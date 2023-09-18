package ru.mpei.LR1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberIdentifier numberIdentifier = new NumberIdentifier();
        ArabicCalcs arabicCalcs = new ArabicCalcs();
        RomanCalcs romanCalcs = new RomanCalcs();
        String s = in.nextLine();
        while (!s.equals("stop")){

            if(s.split("\\*").length == 2){
                //умножение
                String[] smass = s.split("\\*");
                if(numberIdentifier.isArabicNumber(smass[0]) && numberIdentifier.isArabicNumber(smass[1])) {
                    //арабское умножение
                    arabicCalcs.multiplication(smass[0],smass[1]);
                } else if(numberIdentifier.isRomanNumber(smass[0]) && numberIdentifier.isRomanNumber(smass[1])){
                    //римское умножение
                    romanCalcs.multiplication(smass[0],smass[1]);

                } else {
                    System.out.println("Неверный формат чисел");
                }


            } else if(s.split("/").length == 2){
                //деление
                String[] smass = s.split("/");
                if(numberIdentifier.isArabicNumber(smass[0]) && numberIdentifier.isArabicNumber(smass[1])) {
                    //арабское деление
                    arabicCalcs.division(smass[0],smass[1]);
                } else if(numberIdentifier.isRomanNumber(smass[0]) && numberIdentifier.isRomanNumber(smass[1])){
                    //римское деление
                    romanCalcs.division(smass[0],smass[1]);
                } else {
                    System.out.println("Неверный формат чисел");
                }

            } else if(s.split("-").length == 2){
                //вычитание
                String[] smass = s.split("-");
                if(numberIdentifier.isArabicNumber(smass[0]) && numberIdentifier.isArabicNumber(smass[1])) {
                    //арабское вычитание
                    arabicCalcs.subtraction(smass[0],smass[1]);
                } else if(numberIdentifier.isRomanNumber(smass[0]) && numberIdentifier.isRomanNumber(smass[1])){
                    //римское вычитание
                    romanCalcs.subtraction(smass[0],smass[1]);
                } else {
                    System.out.println("Неверный формат чисел");
                }

            } else if(s.split("\\+").length == 2){
                //сложение
                String[] smass = s.split("\\+");
                if(numberIdentifier.isArabicNumber(smass[0]) && numberIdentifier.isArabicNumber(smass[1])) {
                    //арабское сложение
                    arabicCalcs.addition(smass[0],smass[1]);
                } else if(numberIdentifier.isRomanNumber(smass[0]) && numberIdentifier.isRomanNumber(smass[1])){
                    //римское сложение
                    romanCalcs.addition(smass[0],smass[1]);
                } else {
                    System.out.println("Неверный формат чисел");
                }
                //сложение
            } else {
                System.out.println("Некорректный ввод");
            }

            s = in.nextLine();
        }
    }
}
