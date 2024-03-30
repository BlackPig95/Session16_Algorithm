package run;

import baitap.entity.FootballTeam;
import baitap.entity.RandomFloatList;
import baitap.entity.RandomIntList;
import baitap.entity.RandomStringList;
import baitap.search.BinaryRecursiveSearch;
import baitap.search.BinarySearch;
import baitap.search.InterpolationSearch;
import baitap.search.LinearSearch;
import baitap.sort.BubbleSort;
import baitap.sort.ClosestMinMax;
import baitap.sort.InsertionSort;
import baitap.sort.SelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainAlgorithm
{
    public static void main(String[] args)
    {
        ClosestMinMax.findClosestMinMax();
        FootballTeam footballTeam1 = new FootballTeam(2, "C", 2, 10);
        FootballTeam footballTeam2 = new FootballTeam(3, "A", 4, 12);
        FootballTeam footballTeam3 = new FootballTeam(1, "B", 3, 9);
        List<FootballTeam> footballTeamList = new ArrayList<>();
        footballTeamList.add(footballTeam1);
        footballTeamList.add(footballTeam2);
        footballTeamList.add(footballTeam3);
        BubbleSort.bubbleSort(footballTeamList);
        SelectionSort.selectionSort(footballTeamList);
        InsertionSort.insertionSort(footballTeamList);
        System.out.println(footballTeamList);
        List<Integer> integerList = RandomIntList.getIntegerList();
        List<Float> floatList = RandomFloatList.getFloatList();
        List<String> stringList = RandomStringList.getStringList();

        System.out.println("Trước sắp xếp");
        System.out.println(integerList);
        System.out.println(floatList);
        System.out.println(stringList);
        System.out.println("----------------------------------------------------------------------------------");
        BubbleSort.bubbleSort(integerList);
        BubbleSort.bubbleSort(floatList);
        BubbleSort.bubbleSort(stringList);
        SelectionSort.selectionSort(integerList);
        SelectionSort.selectionSort(floatList);
        SelectionSort.selectionSort(stringList);
        InsertionSort.insertionSort(integerList);
        InsertionSort.insertionSort(floatList);
        InsertionSort.insertionSort(stringList);
        System.out.println("Sau sắp xếp");
        System.out.println(integerList);
        System.out.println(floatList);
        System.out.println(stringList);
        System.out.println(LinearSearch.linearSearch(integerList, 10));
        System.out.println(LinearSearch.linearSearch(stringList, "String number 3"));
        System.out.println(BinarySearch.binarySearch(integerList, 10));
        System.out.println(BinarySearch.binarySearch(stringList, "String number 3"));
        System.out.println(BinaryRecursiveSearch.binaryRecursiveSearch
                (integerList, 10, 0, integerList.size() - 1));
        System.out.println(BinaryRecursiveSearch.binaryRecursiveSearch
                (stringList, "String number 3", 0, stringList.size()));
        System.out.println(integerList);
        System.out.println(InterpolationSearch.interpolationSearch(integerList, 10));
    }
}
