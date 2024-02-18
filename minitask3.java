/*
 최진
 03. 놀이동산 입장권 계산 프로그램
>3세 미만이면 무료 입장
>복지카드와 국가유공자의 경우 일반 할인 적용
>13세 미만이면 특별 할인 적용
>17시 이후 입장하면 특별 할인 적용

>기본 입장료 : 10,000원
>특별 할인의 경우 : 4,000원
>일반 할인의 경우 : 8,000원
 */

import java.util.Scanner;

public class minitask3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        int enterance;

        System.out.println("나이를 입력해 주세요.(숫자):");
        int age = scanner.nextInt();
        System.out.println("입장시간을 입력해 주세요.(숫자입력):");
        int time = scanner.nextInt();
        System.out.println("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = scanner.next();
        System.out.println("복지카드 여부를 입력해 주세요.(y/n):");
        String card = scanner.next();

            if (age < 3) {
                enterance = 0;
            } else {
                if (age < 13 || time > 17) {
                    enterance = 4000;
                } else if (merit.equals("y") || card.equals(("y"))) {
                    enterance = 8000;
                } else {
                    enterance = 10000;
                }
            }

        System.out.println("입장료: "+ enterance);
    }
}
