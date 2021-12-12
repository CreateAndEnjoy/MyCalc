package com.company;

import java.util.Scanner;

public class SplitToNums {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String[] nums = str.split(" ");
    private String first;
    private String second;
    private String operation;
    private int firstToInt;
    private int secondToInt;
    private String operator;
    private int result;
    private String resultToStr;
public String getFirst (){
    first = nums [0];
    return first;
}
    public String getOperation (){
    this.operation= operation;
        operation = nums [1];
        return operation;
    }


    public String getSecond (){
        second = nums [2];
        return second;
    }
    public String getResultToStr(int firstToInt, int secondToInt){
    this.firstToInt= firstToInt;
    this.secondToInt = secondToInt;
    this.result = result;
        switch (nums[1]) {
            case  ("+"):
                result =  firstToInt+secondToInt;
                break;
            case  ("-"):
                result =  firstToInt-secondToInt;
                break;
            case  ("*"):
                result =  firstToInt*secondToInt;
                break;
            case  ("/"):
                result =  firstToInt/secondToInt;
                break;

        }
        resultToStr=  Integer.toString(result);
        return resultToStr;


    }

    int input1(){
        int n1;
        n1 = Integer.parseInt(nums[0]);
        return n1;
    }
    int input2(){
        int n2;
        n2 = Integer.parseInt(nums[2]);
        return n2;
    }
    void calc (){

        switch (nums[1]){
            case "+":
                System.out.println(input1() + input2());
                break;
            case "-":
                System.out.println(input1() - input2());
                break;
            case "*":
                System.out.println(input2() * input1());
                break;
            case "/":
                System.out.println(input1() / input2());
                break;
        }


    }}
