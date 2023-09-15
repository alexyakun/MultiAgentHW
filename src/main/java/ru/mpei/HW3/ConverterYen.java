package ru.mpei.HW3;



public class ConverterYen implements Converter{
    private double rateInRuble = 1.53;
    @Override
    public double convertToRub(double ue) {
        return ue/rateInRuble;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub*rateInRuble;
    }

    @Override
    public Type getType() {
        return Type.YEN;
    }
}
