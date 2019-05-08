package com.company;

public class Main {

    public static void main(String[] args){
        String a = "Hello world";
        int b = 1;
        printValues(a);
        String result = printValues(a,b);
        System.out.println(result);
        String result1 = printValues(false,a,b);
        System.out.println(result1);
        String result2 = printValues(true,a,b);
        System.out.println(result2);
    }

    public static void printValues(String value){
        System.out.println(value);
    }

    public static String printValues(String value1, int value2){
        return value1+value2;
    }

    public static String printValues(Boolean value, String value1, int value2){
        if (value){
            return value1;
        }else {
            return value2+"";
        }
    }
}