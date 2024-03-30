package baitap.sort;

import java.util.List;

public class BubbleSort
{
    public static <T extends Comparable<T>> void bubbleSort(List<T> list)
    {
        int n = list.size();
        boolean isSorted = false;//Chừng nào mảng còn chưa được sắp xếp thì tiếp tục chạy
        for (int i = 1; i < n && !isSorted; i++)
        {
            isSorted = true;//Giả định ở mỗi vòng lặp rằng mảng đã được sắp xếp
            System.out.print("Outer loop: " + i + " - ");
            System.out.println(list);
            for (int j = 0; j < n - i; j++)
            {
                System.out.print("Inner loop: " + j + " - ");
                System.out.println(list);
                if (list.get(j).compareTo(list.get(j + 1)) > 0)//=>j > j+1 => Sắp xếp tăng dần
                {   //Mảng sẽ được chia thành phần đã sắp xếp nằm bên phải, phần chưa sắp xếp nằm bên trái
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    isSorted = false;//Nếu có sự đổi chỗ => Mảng chưa được sắp xếp
                }
            }
        }
    }
}
