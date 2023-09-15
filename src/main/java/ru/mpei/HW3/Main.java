package ru.mpei.HW3;

public class Main {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        double rub = 100;
        rub = exchanger.convert(rub,Type.RUBLE,Type.DOLLAR);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.DOLLAR,Type.DOLLAR);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.DOLLAR,Type.YEN);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.YEN,Type.YEN);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.YEN,Type.YUAN);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.YUAN,Type.YUAN);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.YUAN,Type.RUBLE);
        System.out.println(rub);
        rub = exchanger.convert(rub,Type.RUBLE,Type.RUBLE);
        System.out.println(rub);
    }
}
