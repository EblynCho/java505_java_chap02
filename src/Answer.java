import  java.util.Scanner;


public class Answer {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
//        문제 1) 점수을 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if 문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 = B, 75이상 = C+, 70이상 = C, 60이상 = D, 60alaks = F
//        중첩 if문을 사용하여 각각의 + 대의 점수를 출력
//        System.out.print("점수를 입력해주세요 : ");
//        int grade = scan.nextInt();
//
//        if (grade >= 90) {
//            if (grade >= 95) {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 A+ 입니다.");
//            }
//            else {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 A 입니다.");
//            }
//        } else if (grade >= 80) {
//            if (grade >= 85) {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 B+ 입니다.");
//            }
//            else {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 B 입니다.");
//            }
//        } else if (grade >= 70) {
//            if (grade >= 75) {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 C+ 입니다.");
//            }
//            else {
//                System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 C 입니다.");
//            }
//        } else if (grade >= 60) {
//            System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 D 입니다.");
//        } else if (grade < 60) {
//            System.out.println("당신의 점수는 "+ grade + "점이고, 당신의 등급은 F 입니다.");
//        }

//        6번
        System.out.println("\n ----- 실습 문제 6 -----\n");

        System.out.print("돈의 액수를 입력하세요>> ");
        int money = scan.nextInt();

//        원금 / 50000 -> 5만원권 수 확인
        int m50000 = money / 50000;
//        5만원을 뺀 15,245원을 변수 money에 저장
        money = money % 50000;
        int m10000 = money / 10000; //1만원권 수를 확인하기 위해서 10000으로 나눔
        money = money % 10000; //1만원권을 제외한 금액 저장
        int m1000 = money / 1000; // 5,245에서 1천원권의 수 확인
        money = money % 1000;
        int m500 = money / 500; // 245에서 500원 동전의 수 확인
        money = money % 500;
        int m100 = money / 100;
        money = money % 100;
        int m10 = money / 10;
        money = money % 10;

        System.out.print("오만원" + m50000 + "개");
        System.out.print("만원" + m10000 + "개");
        System.out.print("천원" + m1000 + "개");
        System.out.print("500원" + m500 + "개");
        System.out.print("100원" + m100 + "개");
        System.out.print("10원" + m10 + "개");
        System.out.print("1원" + money + "개");

//        7번
        System.out.println("\n ----- 실습 문제 7 -----\n");

        System.out.print("학점을 입력하세요>> ");
        String grade = scan.nextLine() ;
        switch (grade) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;

            case "F":
                System.out.println("Bye");
                break;
        }


//        9번
        System.out.println("\n ----- 실습 문제 9 -----\n");

        System.out.print("1~99 사이의 정수를 입력하세요>> ");
        int n = scan.nextInt();
        int first = n/10;
        int second = n%10;

        if ((first % 3 == 0) && (second % 3 == 0)){
            System.out.println("박수짝짝");
        }
        else if ((first % 3 == 0) ^ (second % 3 == 0)) {
            System.out.println("박수짝");
        }
        else {
            System.out.println("박수없음");
        }

        int number = scan.nextInt(); //사용자 숫자 입력
//        2자리의 숫자 중 10의 자리 숫자와 1의 자리 숫자를 분리
        int first2 = number / 10; // 10의 자리 숫자를 저장
        int second2 = number % 10; // 1의 자리 숫자를 저장
        int count = 0; // 3,6,9 의 수를 저장하기 위한 변수

//        10의 자리 숫자가 3의 배수인지 확인
        if (first2 % 3 == 0) {
            count++; // 3의 배수이면 변수 count의 값 1 증가
        }
//        1의 자리 숫자가 3의 배수인지 확인
        if (second2 % 3 == 0 )  {
            count++; // 3의 배수이면 변수 count의 값 1 증가
        }

        if (count == 1) {
            System.out.println("박수짝");
        }
        else if (count == 2) {
            System.out.println("박수짝짝");
        }
        else {
            System.out.println("박수없음");
        }
    }
}
