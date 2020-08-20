package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Number");
        int month = scanner.nextInt();
        numberOfDays(month);

    }

    public static void numberOfDays(int month){
        int result;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result= 31;
                break;
            case 2:
                result= 28;
                break;
            case 4: case 6: case 9: case 11:
                result= 30;
                break;
            default:
                result= -1;
                System.out.println("Invalid Number");
        }
        System.out.println("month has " + result + " days :)");
    }
}
