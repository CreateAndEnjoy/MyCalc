package com.company;//Есть методы turnToRome isItRoman

public class AreTheyRoman {
    private static int test;
    private String firstInput;
    private boolean isItRoman;
    FromRomanToArab [] toCheck = FromRomanToArab.values();
    public String turnToRome(int test) {
        this.test = test;

        for (int i = 0; i<toCheck.length; i++){
            if(test== (toCheck[i].getArabian())){
                return toCheck[i].getRoman();}
            else {;
            }
        }

        return null;
    };
    public boolean isItRoman(String firstInput){
    this.firstInput = firstInput;
        for (int i = 0; i<toCheck.length; i++){
            if(firstInput.equals (toCheck[i].getRoman())){
                isItRoman= true;
            break; }
                else {
                isItRoman= false;
            }
        }
    return isItRoman;
}
}