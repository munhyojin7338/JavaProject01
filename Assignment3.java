package Practice;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        /*
        - 과제3. 문효진
        - 3세미만이면 무료 입장
        - 복지카드와 국가유공자의 경우 일반 할인 적용
        - 13세 미만이면 특별 할인 적용
        - 17시이후에 입장하면 특별 할인 적용
         */

        /* 3번 문효진
        1. 스캐너 사용하여 나이, 입장 시간 , 국가유공자, 복지카드 입력값 받기
        2. if , else if  사용하여 나누기
        3.  나이가 14살이면 -> 일반가격
        3-1. 나이가 14살 이상이면서 복지카드와 or 국가유공자일 경우 -> 일반할인적용
        3-2. 13세 미만이거나 17시 이후에 입장하면 -> 특별할인 적용
        3-3. 3세 미만일 경우 무료 입장
         */

        int ticket = 10000;
        int specialTicket = 4000;
        int basicTicket = 8000;



        System.out.println("입장권 계산하기");
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요. : ");
        int age = scanner.nextInt(); // 나이

        System.out.println("입장시간을 입력해 주세요. : ");
        int time = scanner.nextInt(); // 시간

        System.out.println("국가유공자 여부를 입력해 주세요. :");
        String nationalMerit = scanner.next(); // yes -> basicTicket을 받고 no -> ticket 받는 로직을 짜면 될듯,,

        System.out.println("복지카드 여부를 입력해 주세요. : ");
        String specialCard = scanner.next(); // yes -> basicTicket 을 받는다


        if( age >= 14){
            if(nationalMerit.equals("Y") || specialCard.equals(("Y"))){
                System.out.println("입장료: " + basicTicket);
            }else {
                System.out.println("입장료 " + ticket);
            } }else if ( time >= 17 || age <= 13 && age >= 3 ) { // 13 >= age >= age
            System.out.println("입장료: " + specialTicket);

        } else if(age < 3){
            System.out.println("입장료 무료!");

        }

        /*
        경우의 수
        1. 나이가 13살이야 -> specialTicket
        2. 나이가 14살이면서 국가유공자(Y) ->  basicTicket
        3.
         */

    }
}
