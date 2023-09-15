package ru.mpei.HW3;



public class ConverterDollar implements Converter {
    private double rateInRuble = 0.01;
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
        return Type.DOLLAR;
    }
}
