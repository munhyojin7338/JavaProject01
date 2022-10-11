package Practice;

/*
 과제 구구단 만들기 - 문효진 
 1. 다중 반복문 돌리기 i,j 9 까지  돌리기
 2. 문자를 숫자형으로 변환
 */


public class Assignment1 {
    public static void main(String[] args){

        // 콘솔 화면에 구구단 출력하기 - 문효진
        System.out.println("[구구단 출력]");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(String.format("%02d x %02d = %02d\t",i,j, j * i));
            }
            System.out.println();
        }
    }
}

