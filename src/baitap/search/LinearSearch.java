package baitap.search;

import java.util.List;

public class LinearSearch
{
    public static <T> int linearSearch(List<T> list, T searchValue)
    {
        int n = list.size();
        for (int i = 0; i < n; i++)
        {
            if (searchValue.equals(list.get(i)))
            {
                return i;
            }
        }
        return -1;
    }
}
