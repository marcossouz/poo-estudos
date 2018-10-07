package com.company;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    char option;
    double n1;
    double n2;
    char operator;

    public void calc(){

        while(true){
            System.out.println("Digite um dado de cada vez - Numero, operador, Numero\n");
            n1 = recebeN();
            operator = recebeOp();
            n2 = recebeN();

            System.out.println(n1 + " " + operator + " " + n2 + " = " + result(n1, operator, n2));

            System.out.println();
            System.out.print("Digite X - para sair, C ou Outra tecla para continuar --> ");
            option = scanner.next().charAt(0);

            if(option == 'x' || option  == 'X'){
                break;
            } else{
                continue;
            }
        }
    }

    public double recebeN(){
        double n1;

        while (true){
            System.out.print("--> ");
            try {
                n1 = scanner.nextDouble();
                break;
            } catch (Exception e) {
               scanner.next(); //descartando o dado anterior
                System.out.println("Digite um numero!");
            }
        }
        return n1;
    }

    public char recebeOp(){
        char op;
            while(true){
                System.out.print("--> ");
                op = scanner.next().charAt(0);

                if(op != '+'&& op != '-' && op != '*' && op != '/'){
                    System.out.println("Digite um operador valido (+, -, /, /)");
                    continue;
                } else {
                    break;
                }
            }

        return op;
    }

    public double result(double n1, char op, double n2){
        double result;

        switch (op){
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            default:
                result = 0;
        }

        return result;
    }
}
