import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("nhap so tu 1-10");
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("số một");
                break;
            case 2:
                System.out.println("số hai");

                break;
            case 3:
                System.out.println("số ba");

                break;
            case 4:
                System.out.println("số bốn");

                break;
            case 5:
                System.out.println("số năm");

                break;
            case 6:
                System.out.println("số sáu");

                break;
            case 7:
                System.out.println("số bảy");

                break;
            case 8:
                System.out.println("số tám");

                break;
            case 9:
                System.out.println("số chín");

                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }
}
