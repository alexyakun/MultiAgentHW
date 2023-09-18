package ru.mpei.LR1;

public class ArabicCalcs extends Calculations{
    @Override
    public void addition(String num1, String num2) {
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Override
    public void subtraction(String num1, String num2) {
        System.out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    @Override
    public void multiplication(String num1, String num2) {
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @Override
    public void division(String num1, String num2) {
        if(Integer.parseInt(num2 ) == 0){
            System.out.println("Деление на 0");
        }
        else System.out.println(Integer.parseInt(num1) / Integer.parseInt(num2));

    }



}
