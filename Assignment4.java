package Practice;

import java.util.Random;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        /* 4번 문효진
        1. 스캐너를 사용하여 입력값 받기 -> 출생년도 생월 생일과 성별 입력 받기
        2. 주민번호 앞자리는 생일로 받고  성별에 따라 뒤에 주민번호 뒷자리 정하기
        3. 랜덤메소드 사용하기
         */

        /*
        1. 스캐너를 사용하여 출생년도 4자리 받기 , 생월 2자리 받기 , 생일 2자리 받기
        2. 성별이 M일 경우 1xxx 로 시작하면 1 2xxx 로 시작 하면 3 / F일 경우 1xxx 로 시작하면 2 2xxx 로 시작하면 4
        3. 받은 성별을 이용하여 남자(M) 1 or 3 and 여자(F) 2 or 4 로 앞자리 받기
        4. 랜덤메소드 7자리 중 앞자리는 1 or 3  and 2 or 4  로 시작
         */

        System.out.println("[랜덤 주민등록번호 만들기 ]");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("출생년도를 입력해 주세요. : ");
        int year = scanner.nextInt();  // 출생년도 앞자리를 보고 1이

        System.out.println("출생월을 입력해 주세요. : ");
        int month = scanner.nextInt();

        System.out.println("출생일을 입력해 주세요. : ");
        int date = scanner.nextInt();

        System.out.println("성별을 입력해 주세요. (M/F) : ");
        String gender = scanner.next();

        if(gender.equals("M") && year >= 1000 && year <= 1999 ){ // 1999 >= year >= 1000 이면서 M 일 경우
            System.out.printf( String.format("%d"+"%02d" + "%02d",year,month,date) +"-"+ (random.nextInt(1000000) + 1000000));
        }
        else if (gender.equals("M") && year >= 2000 && year <= 2022) {
            System.out.printf( String.format("%d"+"%02d" + "%02d",year,month,date) +"-"+ (random.nextInt(1000000) + 3000000));
        }
        else if(gender.equals("F") && year >= 1000 && year <= 1999){
            System.out.printf(String.format("%d"+"%02d" + "%02d",year,month,date) +"-"+ (random.nextInt(1000000) + 2000000));
        }
        else if (gender.equals("F")&& year >= 2000 && year <= 2022) {
            System.out.printf(String.format("%d"+"%02d" + "%02d",year,month,date)+"-"+ (random.nextInt(1000000) + 4000000));
        }else {
            System.out.println(" 값 오류");
        }

    }
}
