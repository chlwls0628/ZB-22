/*
 최진
 02. 결제 금액 캐시백 계산 프로그램
 */

import java.util.Scanner;

public class minitask2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.println("결제 금액을 입력해 주세요.(금액):");
        int payment = scanner.nextInt();

        int cashback = (int) (payment * 0.1);

        if(cashback >= 300){
            cashback = 300;
        }else if(200 <= cashback && cashback < 300){
            cashback = 200;
        }else
            cashback = 100;

        System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d입니다.", payment, cashback));
    }
}