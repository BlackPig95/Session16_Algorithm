package baitap.search;

import java.util.List;

public class InterpolationSearch
{
    public static int interpolationSearch(List<Integer> listInt, int searchValue)
    {
        int lowIndex = 0;
        int highIndex = listInt.size() - 1;
        //Nếu search value < list.get(lowIndex) hoặc search value > list.get(highIndex)
        //=> Không tồn tại nên không cần tìm nữa
        while (lowIndex <= highIndex && searchValue >= listInt.get(lowIndex) && searchValue <= listInt.get(highIndex))
        {
            int probeIndex = lowIndex + (highIndex - lowIndex) * (searchValue - listInt.get(lowIndex))
                    / (listInt.get(highIndex) - listInt.get(lowIndex));
            System.out.println("Probe: " + probeIndex);
            //Ngoài việc dùng formula để tính toán vị trí của index thì logic giống binary search
            if (listInt.get(probeIndex) == searchValue)
            {
                return probeIndex;
            } else if (searchValue < listInt.get(probeIndex))
            {
                highIndex = probeIndex - 1;
            } else if (searchValue > listInt.get(probeIndex))
            {
                lowIndex = probeIndex + 1;
            }
        }
        return -1;
    }
}
