package baitap.search;

import java.util.List;

public class BinaryRecursiveSearch
{
    public static <T extends Comparable<T>> int binaryRecursiveSearch(List<T> list, T searchValue, int low, int high)
    {
        if (low > high)//Base case là khi không còn phần tử nào để duyệt
        {
            return -1;
        }
        int middle = low + (high - low) / 2;
        T midValue = list.get(middle);//Lưu đệm giá trị ở index middle
        if (searchValue.compareTo(midValue) < 0)//=>searchValue < midValue => Tìm tiếp bên trái
        {
            high = middle - 1;
            //Gán middle bằng return value của hàm đệ quy
            middle = binaryRecursiveSearch(list, searchValue, low, high);
        } else if (searchValue.compareTo(midValue) > 0)//=>searchValue = midValue => Tìm tiếp bên phải
        {
            low = middle + 1;
            //Gán middle bằng return value của hàm đệ quy
            middle = binaryRecursiveSearch(list, searchValue, low, high);
        } else if (searchValue.equals(midValue))
        {
            return middle;
        }
        //Khi đệ quy cuối cùng return middle,
        // hàm được gọi đầu tiên sẽ nhận được giá trị middle đó, chính là kết quả cần tìm
        return middle;
    }
}
