package baitap.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntList
{
    public static List<Integer> getIntegerList()
    {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            integerList.add(random.nextInt(120));
        }
        return integerList;
    }

}
