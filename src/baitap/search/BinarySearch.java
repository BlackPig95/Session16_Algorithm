package baitap.search;

import java.util.List;

public class BinarySearch
{
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T searchValue)
    {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high)
        {
            int middle = low + (high - low) / 2;
            System.out.println("Midle: " + middle);
            T midValue = list.get(middle);//Lưu đệm giá trị ở index middle
            if (searchValue.equals(midValue))
            {
                return middle;
            } else if (searchValue.compareTo(midValue) < 0)//=>searchValue < midValue
            {
                high = middle - 1;
            } else
            {
                low = middle + 1;//=>searchValue > midValue
            }
        }
        return -1;
    }
}
