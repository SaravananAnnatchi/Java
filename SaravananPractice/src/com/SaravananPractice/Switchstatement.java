package com.SaravananPractice;



public class Switchstatement {

    public static void main(String[] args) {
        for(int i=0;i<=7;i++) {
            printWeekDay(i);
        }

            }
    public static void printWeekDay(int day){

        switch(day){
            case 0:
                System.out.println("Today is SUNDAY");
                break;
            case 1:
                System.out.println("Today is MONDAY");
                break;
            case 2:
                System.out.println("Today is TUESDAY");
                break;
            case 3:
                System.out.println("Today is WEDNESDAY");
                break;
            case 4:
                System.out.println("Today is THURSDAY");
                break;
            case 5:
                System.out.println("Today is FRIDAY");
                break;
            case 6:
                System.out.println("Today is SATURDAY");
                break;

            default:
                System.out.println("Invalid input to display day");
                break;
        }
    }
}
