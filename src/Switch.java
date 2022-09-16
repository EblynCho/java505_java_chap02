import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("축하합니다.");
                System.out.println("잘 하셨습니다.");
                break;

            case 'B':
                System.out.println("좋아요");
                break;

            case 'C':
                System.out.println("노력하세요");
                break;

            default:
                System.out.println("탈락입니다.");
                break;
        }

        System.out.println("\n\n");

//        자바의 날짜 관련 클래스
        Calendar cal = Calendar.getInstance();
//        현재 시간을 날짜 클래스에 적용
        cal.setTime(new Date());
//        현재 날짜를 기준으로 일주일 중 오늘 요일을 가져옴
//        int currDay = cal.get(Calendar.DAY_OF_WEEK);

        Scanner scan = new Scanner(System.in);
                System.out.print("1 ~ 7까지의 숫자를 입력하세요 : ");
        int currDay = scan.nextInt();

        System.out.println("변수 currDay의 값 : " + currDay);

        switch (currDay) {
            case 1:
                System.out.println("오늘은 일요일입니다.");
                break;

            case 2:
                System.out.println("오늘은 월요일입니다.");
                break;

            case 3:
                System.out.println("오늘은 화요일입니다.");
//                break;

            case 4:
                System.out.println("오늘은 수요일입니다.");
                break;

            case 5:
                System.out.println("오늘은 목요일입니다.");
                break;

            case 6:
                System.out.println("오늘은 금요일입니다.");
                break;

            case 7:
                System.out.println("오늘은 토요일입니다.");
                break;
        }

//        Scanner scan = new Scanner(System.in);
        System.out.print("1 ~ 7까지의 숫자를 입력하세요 : ");
        currDay = scan.nextInt();

        System.out.println("변수 currDay의 값 : " + currDay);

        switch (currDay) {
            case 2:
            case 3:
                System.out.println("오늘은 월화 드라마가 방영됩니다.");
                break;

            case 4:
            case 5:
                System.out.println("오늘은 수목 드라마가 방영됩니다.");
                break;

            case 6:
                System.out.println("오늘은 금요일입니다.");
                break;

            case 1:
            case 7:
                System.out.println("오늘은 주말입니다.");
                break;
        }

    }
}
