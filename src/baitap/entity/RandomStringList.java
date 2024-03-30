package baitap.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStringList
{
    public static List<String> getStringList()
    {
        Random random = new Random();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            stringList.add("String number " + random.nextInt(20));
        }
        return stringList;
    }
}
