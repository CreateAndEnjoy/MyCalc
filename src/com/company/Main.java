package com.company;
public class Main {
    public static void main(String[] args) {
        int result;

SplitToNums split = new SplitToNums();
        AreTheyRoman firstCheck = new AreTheyRoman();

       if( firstCheck.isItRoman(split.getFirst()) && firstCheck.isItRoman(split.getSecond())){
//           System.out.println("roman");
           FromRomanToArab first = FromRomanToArab.valueOf(split.getFirst());
           FromRomanToArab second = FromRomanToArab.valueOf(split.getSecond());
           switch (split.getOperation()) {
               case  ("+"):
                   result = first.getArabian()+second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("-"):
                   result = first.getArabian()-second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("/"):
                   result = first.getArabian()/second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("*"):
                   result = first.getArabian()*second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));

                   break;
           }

       }
          else if (  !firstCheck.isItRoman(split.getFirst()) & !firstCheck.isItRoman(split.getSecond())){;
//        System.out.println("they are Arabian");
        split.calc();}
        }
    }