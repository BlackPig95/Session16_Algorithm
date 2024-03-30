package baitap.sort;

import java.util.List;

public class InsertionSort
{
    public static <T extends Comparable<T>> void insertionSort(List<T> list)
    {
        int n = list.size();
        for (int i = 1; i < n; i++)//Giả định rằng phần bên trái đã được sắp xếp => Bắt đầu từ 1
        {
            System.out.print("Outer loop: " + i + " - ");
            System.out.println(list);
            int j = i;//Lấy j = i để đẩy các phần tử sau lên trước
            T temp = list.get(i);//Lưu đệm giá trị của index i
            //So sánh các giá trị đứng đằng sau i hiện tại và shift element về bên phải
            while (j > 0 && list.get(j - 1).compareTo(temp) > 0)
            {//Khi j = 1 => Đẩy j-1=0 lên trước, còn dư ra duy nhất index 0, nên chỉ cần xét đến j > 0
                System.out.print("Inner loop: " + j + " - ");
                System.out.println(list);
                list.set(j, list.get(j - 1));
                j--;//Nếu j=1 => j-- = 0 => break
            }
            list.set(j, temp);//Lấy giá trị đã lưu đệm đặt vào ô trống sau khi dã shift element về bên phải
        }
    }
}
