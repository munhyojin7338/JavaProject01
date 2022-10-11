package Practice;

import java.util.Scanner;
    // 과제2. 문효진
    // 결재 금액의 10%를  적립한다
    // 캐시백 포인트 단위는 백원단위이다 100, 200, 300 원 단위 최대 300원까지
    // 캐시백 포인트는 최대 300원을 넘을 수 없다

/*
 1. 스캐너 입력값 받기
 2. 받은 입력값  / 10 해주기
 3. 나누기 10 해준 캐시백 값은 최대 300원을 넘지 않는다
 4. 캐시백은 100원 단위이다.
 */

/* 2번 문효진 
1번  스캐너 사용
2번  입력받은 값을  숫자형으로  형변환
3번 입력받은 숫자의 10%로를 계산한다
4번 10%  나눈 값을 조건문을 돌린다.(단 300원 초과하면 300원으로 반환 됨)

 */

public class Assignment2 {
    public static void main(String[] args){
        int cashBack = 0; // 캐시백 값

        System.out.println("[캐시백 계산]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("결제 금액을 입력해 주세요.(금액) : ");
        int userInputNumber = scanner.nextInt();


        // 캐시백 구하기
        if(userInputNumber / 10 >= 300){
            cashBack = 300;
        } else if ((userInputNumber / 10) >= 200 ) {
           cashBack = 200;
        }else {
            cashBack = 100;
        }
        System.out.println("결제 금액은 " + userInputNumber +"원 이고, 캐시백은: " + cashBack + "입니다");

    }
}
