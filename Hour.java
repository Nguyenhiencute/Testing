//I.	Bài toán
//        •	Mô tả: Kiểm tra xem giờ có hợp lệ hay không
//        •	Đầu vào: Giờ cần kiểm tra gồm có giờ (h) và phút (m)
//        Giờ hợp lệ:
//        0 <= h <= 23
//        0 <= m <= 59
//        •	Đầu ra:
//        -	Nếu giờ nằm trong khoảng quy định thì trả về “Hợp lệ”
//        -	Nếu giờ không nằm trong khoảng quy định thì trả về “Không hợp lệ”
//

import java.util.Scanner;

public class Hour {
    private int h;
    private int m;

    public Hour(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public String print() {
        if (0 <= h && h <= 23) {
            if (0 <= m && m <= 59) {
                return "Hợp lệ";
            }
            else {
                return "Không hợp lệ";
            }
        }
        else {
            return "Không hợp lệ";
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập giờ và phút: ");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        Hour hour = new Hour(h, m);
        System.out.println(hour.print());
    }
}
