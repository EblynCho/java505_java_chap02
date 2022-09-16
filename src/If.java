import  java.util.Scanner;

public class If {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
//        if : 가장 많이 사용되는 조건문으로 조건식의 결과가 참일 경우 해당 코드 블럭을 실행하는 형태의 조건문
//        단순 if문 : 조건식의 결과가 참일 경우 코드 블럭의 내용을 추가로 실행하는 형태
        System.out.print("숫자를 입력하세요 : ");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        }

        System.out.println("입력한 숫자는 " + n + " 입니다.");
//        if ~ else 문 : 조건식의 결과가 참일 경우 바로 아래의 코드블럭을 실행하고, 거짓일 경우 else 아래의 코드블럭을 실행하는 형태
//        단순 if 문과는 다르게 반드시 둘 중 하나를 선택하는 형태의 조건문
        System.out.println("탕수육 먹는 형태를 입력하세요");
        System.out.print("찍먹? 부먹? : ");
        String input = scan.next();

//        equals(문자열) : 지정한 문자열과 동일한 문자열인지 확인, true/false로 출력
        if (input.equals("부먹")) {
            System.out.println("탕수육의 원래 형태는 부먹입니다.");
        } else {
            System.out.println("찍먹을 해야 탕수육의 튀김옷이 바삭합니다.");
        }

        System.out.println("탕수육을 맛있게 먹습니다.");
//        else if 문 : 조건식이 여러개가 존재하여 조건식의 결과가 참인 코드블럭을 실행하는 형태
//        조건식을 여러개 사용하기 때문에 단계별로 조건식을 설정해야 함 (문법적으로 문제가 없으나 논리적으로 문제가 발생할 수 있음)
//        마지막에 존재하는 else문은 생략 가능함 (else 구문으로 갈 수 없도록 모든 조건을 다 입력했을 경우, else문으로 빠지는 경우에 그냥 아무런 처리를 하지 않을 경우)

        System.out.print("점수를 입력해 주세요 : ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 A 입니다.");
        } else if (grade >= 80) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 B 입니다.");
        } else if (grade >= 70) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 C 입니다.");
        } else if (grade >= 60) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 D 입니다.");
        } else if (grade < 60) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 F 입니다.");
        }


        System.out.println("\n------ 중첩 if문 -----\n");
//        중첩 if 문 : if, if ~ else, else if 문의 코드블럭에 if문을 사용하는 방식
        System.out.print("점수를 입력해 주세요 : ");
        grade = scan.nextInt();

        if (grade >= 90) {
            System.out.println("당신의 점수는 " + grade + "점이고, 등급은 A 입니다.");
        }
        else {
            if (grade >= 80) {
                System.out.println("당신의 점수는 " + grade + "점이고, 등급은 B 입니다.");
            }
            else {
                if (grade >= 70) {
                    System.out.println("당신의 점수는 " + grade + "점이고, 등급은 C 입니다.");
                    }
                else {
                    if (grade >= 60) {
                        System.out.println("당신의 점수는 " + grade + "점이고, 등급은 D 입니다.");
                    }
                    else {
                        System.out.println("당신의 점수는 " + grade + "점이고, 등급은 F 입니다.");
                    }
                }
            }
        }


    }
}