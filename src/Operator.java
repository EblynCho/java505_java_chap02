import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println("변수 a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = 10 / 3;
        System.out.println("10 / 3 = " + c);

        c = 10 % 3;
        System.out.println("10 % 3 = " + c);

        System.out.println("\n\n");
        int time = s.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.println(second + "초입니다.");

        s.close();

        System.out.println("------- 문자열 연결 연산자 ------");

        System.out.println("하나의 긴 문자열을 표현하기 위해서는 String 타입의 변수에 긴 문자열을 저장하여 출력");

        System.out.println("여러개의 문자열 변수에 저장된 내용을 한줄로 표현하고 싶을 경우 사용하는 것이 문자열 연결 연산자");

        String str1 = "String 타입의 변수에 긴 문자열을 입력하여 pringln() 함수를 통해서화면에 출력";
        System.out.println(str1);

        System.out.println("2개 이상의 " + "문자열을 + 연산자를 사용하여 " + "연산을 진행하면 " + "하나의 긴 문자열로 출력됨");
        String str2 = "2개 이상의 ";
        String str3 = "문자열을 + 연산자를 사용하여 ";
        String str4 = "연산을 진행하면 ";
        String str5 = "하나의 긴 문자열로 출력됨";
        System.out.println(str2 + str3 + str4 + str5);

        String str6 = str2 + str3 + str4 + str5;
        System.out.println(str6);

//        문자열과 기본 데이터 타입을 연산 시 모두 문자열로 변환됨
        String menu = "로티세리 바베큐 ";
        String menu2 = "세트 ";
        int price = 6500;
        int price2 = 2000;

        System.out.println(menu + price + "원");
        System.out.println(menu + menu2 + (price + price2) + "원");
        System.out.println(menu + menu2 + price + price2 + "원");

        System.out.println("\n----- 증감 연산자 -----\n");

//        전위 연산 혹은 후위 연산이 단독으로 사용될 경우에는 읿반 연산자를 통해서 값을 증감시키는 것과 차이가 없음
//        전위 연산 혹은 후위 연산을 다른 연산식과 함께 사용할 경우 실행되는 시점이 달라짐
        int op = 10;
        System.out.println("변수 op의 값 : " + op);
        op++;
        System.out.println("op++ 이후의 값 : " + op);
        ++op;
        System.out.println("++op 이후의 값 : " + op);
        --op;
        System.out.println("--op 이후의 값 : " + op);
        op--;
        System.out.println("op-- 이후의 값 : " + op);

        System.out.println("\n");

        op = 10;
        System.out.println("현재 변수 op의 값 : " + op);
        System.out.println("++op 실행 이후의 값 : " + ++op);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op++ 실행 시 : " + op++);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op-- 실행 시 : " + op--);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("--op 실행 시 : " + --op);
        System.out.println("현재 op의 값 : " + op);

        System.out.println("\n----- 비교 연산자 -----\n");

        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);

        System.out.println("\n----- 논리 연산자 -----\n");

        System.out.println(!(3 != 2));
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));

        System.out.println("\n----- 조건 연산자(3항연산자) -----\n");

        int num1 = 3;
        int num2 = 5;

        System.out.println("두 수의 차는 : " + ( (num1 > num2) ? (num1 - num2) : (num2 - num1)));

        if (num1 > num2) {
            System.out.println("두 수의 차는 : " + (num1 - num2));
        }
        else {
            System.out.println("두 수의 차는 : " + (num2 - num1));
        }

    }
}
