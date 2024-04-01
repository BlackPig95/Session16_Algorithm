package baitap.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchInRange
{
    private static Integer[] getArr()
    {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void findClosestMinMax()
    {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số min");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số max, phải lớn hơn số min");
        int max = Integer.parseInt(scanner.nextLine());
        binarySearchRange(min, max, arr);
    }

    private static void binarySearchRange(int min, int max, Integer[] arr)
    {
        if (max < arr[arr.length - 1])//Max < số nhỏ nhất trong arr
        {
            System.out.println("Không có số nào trong khoảng này");
            return;
        }
        if (min > arr[0])//Min > số lớn nhất trong arr
        {
            System.out.println("Không có số nào trong khoảng này");
            return;
        }
        //Ý tưởng: Chia hai số min max ra để thực hiện 2 binary search riêng biệt
        //Lấy kết quả index được trả về để tìm ra các số trong khoảng cần tìm
        //Vì mảng sắp xếp từ lớn đến nhỏ, nên leftIndex sẽ là số lớn nhất, rightIndex là nhỏ nhất
        int leftIndex = findLeftMostIndex(max, arr);
        int rightIndex = findRightMostIndex(min, arr);
        if (leftIndex >= rightIndex)
        {//Left>Right => 2 số max và min nằm trong khoảng giữa 2 số liền kề nhau của arr
            System.out.println("Không có số nào trong khoảng này");
            return;
        }
        System.out.println("Số lớn nhất trong khoảng này là: " + arr[leftIndex]);
        System.out.println("Số nhỏ nhất trong khoảng này là: " + arr[rightIndex]);
        System.out.println("Các số trong khoảng cần tìm: ");
        for (int i = leftIndex; i <= rightIndex; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static int findLeftMostIndex(int max, Integer[] arr)
    {
        //Vì chưa chắc max đã tồn tại, nên sẽ tìm số == max, hoặc <= max
        //Lúc này index cần tìm sẽ đúng bằng index của max, hoặc nằm bên tay phải so với max(vì mảng đảo ngược)
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        //Khi leftIndex = rightIndex - 1 => 2 index nằm ngay cạnh nhau => Số <= max đang nằm bên tay phải
        while (leftIndex != rightIndex - 1)
        {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            //Logic còn lại tương tự binary search thông thường để liên tục chia mảng thành 2 phần
            if (arr[middleIndex] < max)
            {
                rightIndex = middleIndex;
            } else if (arr[middleIndex] > max)
            {
                leftIndex = middleIndex;
            } else if (arr[middleIndex] == max)//Nếu max vừa đúng bằng số này, thì đây chính là index cần tìm
            {
                return middleIndex;
            }
        }
        //Chạy hết while => max không trùng với bất cứ số nào trong array
        //=> Trả về giá trị nhỏ hơn max và gần với max nhất (nằm bên phải max)
        return rightIndex;
    }

    private static int findRightMostIndex(int min, Integer[] arr)
    {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        //Vì chưa chắc min đã tồn tại, nên sẽ tìm số == min, hoặc >= min
        //Lúc này index cần tìm sẽ đúng bằng index của min, hoặc nằm bên tay trái so với min(vì mảng đảo ngược)
        while (leftIndex != rightIndex - 1)
        {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (arr[middleIndex] > min)
            {
                leftIndex = middleIndex;
            } else if (arr[middleIndex] < min)
            {
                rightIndex = middleIndex;
            } else if (arr[middleIndex] == min)//Nếu min vừa đúng bằng số này, thì đây chính là index cần tìm
            {
                return middleIndex;
            }
        }
        //Chạy hết while => min không trùng với bất cứ số nào trong array
        //=> Trả về giá trị lớn hơn min và gần với min nhất (nằm bên trái min)
        return leftIndex;
    }
}
