package baitap.sort;

import java.util.List;

public class SelectionSort
{
    public static <T extends Comparable<T>> void selectionSort(List<T> list)
    {
        int n = list.size();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Outer loop: " + i + " - ");
            System.out.println(list);
            for (int j = i + 1; j < n; j++)
            {
                System.out.print("Inner loop: " + j + " - ");
                System.out.println(list);
                if (list.get(i).compareTo(list.get(j)) > 0)//=> j > j+1 => Sắp xếp tăng dần
                {   //Mảng sẽ được chia thành phần đã sắp xếp nằm bên trái, phần chưa sắp xếp ở bên phải
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
