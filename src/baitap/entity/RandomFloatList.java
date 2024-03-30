package baitap.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFloatList
{
    public static List<Float> getFloatList()
    {
        Random random = new Random();
        List<Float> floatList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            floatList.add(random.nextFloat(10));
        }
        return floatList;
    }
}
