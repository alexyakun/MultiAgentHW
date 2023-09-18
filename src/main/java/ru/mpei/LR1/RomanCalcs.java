package ru.mpei.LR1;

import java.util.HashMap;
import java.util.Map;

public class RomanCalcs extends Calculations{
    Map<String, Integer> romInArab= new HashMap(Map.of("I",1,"II",2,"III",3,
            "IV",4,"V",5,"VI",6,"VII",7,"VIII",8,"IX",9,"X",10));
    @Override
    public void addition(String num1, String num2) {
        int numInt1 = romInArab.get(num1);
        int numInt2 = romInArab.get(num2);
        arabToRom(numInt1 + numInt2);

    }

    @Override
    public void subtraction(String num1, String num2) {
        int numInt1 = romInArab.get(num1);
        int numInt2 = romInArab.get(num2);
        if(numInt1 - numInt2 <= 0){
            System.out.println("Неположительный результат");
        } else {
            arabToRom(numInt1 - numInt2);
        }

    }

    @Override
    public void multiplication(String num1, String num2) {
        int numInt1 = romInArab.get(num1);
        int numInt2 = romInArab.get(num2);
        arabToRom(numInt1 * numInt2);

    }

    @Override
    public void division(String num1, String num2) {
        int numInt1 = romInArab.get(num1);
        int numInt2 = romInArab.get(num2);
        if(numInt2 == 0){
            System.out.println("Деление на 0");
        } else if(numInt1 < numInt2){
            System.out.println("Неположительный результат");

        } else{
            arabToRom(numInt1 / numInt2);
        }

    }

    public void arabToRom(int number){
        int[] arabList = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanList = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < arabList.length; i += 1) {
            while (number >= arabList[i]){
                number -= arabList[i];
                System.out.print(romanList[i]);
            }
        }
        System.out.println();
    }

}
