/*
 최진
 04. 주민등록번호 생성 프로그램
*/

import java.util.Random;
import java.util.Scanner;



public class minitask4 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");

        System.out.println("출생년도를 입력해 주세요.(yyyy) : ");
        int year = scanner.nextInt();
        int yy = year % 100;

        System.out.println("출생월을 입력해 주세요.(mm): ");
        int mm = scanner.nextInt();
        System.out.println("출생일을 입력해 주세요.(dd): ");
        int dd = scanner.nextInt();
        System.out.println("성별을 입력해 주세요.(m/f): ");
        char gender = scanner.next().charAt(0);

        if (yy < 20) {
            System.out.println("다시 입력해주세요.");
        } else if (mm <= 0 || mm > 12) {
            System.out.println("다시 입력해주세요.");
        } else if (dd <= 0 || dd > 31) {
            System.out.println("다시 입력해주세요.");
        }

        switch (gender) {
            case 'm':
                gender = '3';
                break;
            case 'f':
                gender = '4';
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
                break;

                Random num = new Random();
                int ranNum = num.nextInt(999999) + 1;;

            System.out.println(String.format("%02d %02d %02d", yy, mm, dd) + " - " + gender +  ranNum);
            }
    }
}
