package Practice;

import java.time.LocalDate;
import java.util.Scanner;

/* 과제 5 문효진
스캐너 달력의 년도 / 월을 입력하기
LocalDate 클래스 사용하기

조건문 / 반복문 사용하여 만들기
반복문 1월부터 ~ 12월 달 만들어주기?

조건문에서는  -> 매 달 요일이 다른것도 정의 해줘야하고
            -> 매 주마다 요일이 끝나면 줄 바꿈이 되어야하고
            -> 2월 29일 윤년 일때는 조건 만들어줘야하고

 */
public class Assignment5 {

    public static void main(String[] args){

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("달력의 년도를 입력해 주세요.(yyyy) :  ");
            int year = scanner.nextInt(); // 달력 년도 받기

            if(year < 1000){
                System.out.println("오류!!, 다시 입력해주세요!");
                continue;
            }

            System.out.println("달력의 월을 입력해 주세요.(mm) : ");
            int month = scanner.nextInt(); // 달력 월 받기

            if(month > 12 || month < 0){
                System.out.println("오류!! 다시입력해주세요");
                continue;
            }
            System.out.printf("[" + (String.format("%d" + "년" + " %02d" + " 월", year, month)) + "]" + "\n");
            calendar_create(start_day(year, month), last_day_num(year, month));
            break;
        }

    }
    public static int last_day_num(int year, int week){
        LocalDate now = LocalDate.of(year, week, 1);
        return now.lengthOfMonth();
    }

    public static int start_day(int year, int week){
       LocalDate now = LocalDate.of(year, week, 1);
       return now.getDayOfWeek().getValue();
    }

    public static void calendar_create(int start_day_num, int last_day_num){
        if(start_day_num == 7){
            start_day_num = 0;
        }
        String[] check = new String[start_day_num + last_day_num];
        for (int i = 0; i < start_day_num; ++i) {
            check[i] = "\t";
        }

        for (int j = start_day_num,leng = 1; j < start_day_num + last_day_num; ++j, ++leng) {
            check[j] = "" + leng + "\t";
        }

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i < check.length; ++i) {
            System.out.print(check[i]);
            if((i + 1) % 7 == 0){
                System.out.println();
            }
        }
        // 달력은 일 ~ 토 까지 총 7일이므로 i가 7이 될때마다 한줄씩 띄웠다.

    }

}
