package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char op ;

        while(true){
            System.out.println("숫자를 입력하세요 (exit입력 시 종료)");
           String input = sc.next();
                if(input.equals("exit") ){
                    System.out.println("게산 종료");
                    break;
                }
        num1 = Double.parseDouble(input);


        System.out.println("사칙연산자 중 하나를 입력해주세요(+,-,*,/)");
        op = sc.next().charAt(0);


        System.out.println("숫자를 입력해주세요");
        num2 = sc.nextDouble();

        double result;
//        switch (op){
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                result = num1 / num2;
//                break;
//
//            default :
//                System.out.println("잘못된 입력");
//                return;
//        }
//        System.out.println("계산결과 = "+ result);

        if(op =='+'){
            result = num1 + num2;
        }else if (op =='-'){
            result = num1 - num2;
        }else if (op =='*') {
            result = num1 * num2;
        }else if (op =='/') {
            result = num1 * num2;
        }else {
        System.out.println("잘못된 입력");
        return;
        }
        System.out.println("계산결과 = "+ result);

        }

    }

}