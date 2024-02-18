/*
 최진
 01. 콘솔 화면에 구구단 출력하기
 >다중 반복문을 이용
 >format함수 이용
 >제목 및 1단부터 9단까지 표시
 */

public class minitask1 {
    public static void main(String[] args){

        System.out.println("[구구단 출력]");

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j<= 9; j++) {
                System.out.print(String.format("%02d X %02d = %02d\t", j,i,(j*i)));
            }
            System.out.println();
        }
    }
}
