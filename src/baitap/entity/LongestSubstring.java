package baitap.entity;

import java.util.Scanner;

public class LongestSubstring
{
    public static void findLongestSubstring()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String input = scanner.nextLine();
        int countLongest = 0;
        int countTemp = 0;
        String subString = "";
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++)
        {   //Đảm bảo không bị bỏ sót trong trường hợp chuỗi dài nhất nằm ở cuối string
            if (i == input.length() - 2)
            {   //Nếu điều kiện vẫn thỏa mãn thì gắn cả 2 char vào
                if (input.charAt(i) <= input.charAt(i + 1))
                {
                    tempString.append(input.charAt(i));
                    tempString.append(input.charAt(i + 1));
                    countTemp += 2;//Tăng số đếm lên 2 thì gắn 2 char
                }
                if (countLongest < countTemp)
                {
                    subString = String.valueOf(tempString);
                    countLongest = countTemp;
                }
            }
            //So sánh char ở vị trí hiện tại với char ngay sau nó
            if (input.charAt(i) <= input.charAt(i + 1))
            {   //Nếu char trước < char sau thì nối chuỗi và tăng biến đếm
                tempString.append(input.charAt(i));
                countTemp++;
            } else
            {   //Nối vào để không bị sót char
                //Ví dụ chuỗi abcdab => Chạy đến d: d>a => Vẫn phải gán d vào tempString trước đó
                tempString.append(input.charAt(i));
                countTemp++;
                //Kiểm tra xem substring hiện tại có lớn hơn substring trước đó không
                if (countLongest < countTemp)
                {   //Nếu đúng thì thay substring hiện tại vào làm substring lớn nhất
                    subString = String.valueOf(tempString);
                    countLongest = countTemp;
                }
                tempString.setLength(0);//Reset lại tempString và biến đếm để kiểm tra tiếp
                countTemp = 0;
            }
        }
        System.out.println(countLongest);
        System.out.println(subString);
    }
}
