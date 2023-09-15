package ru.mpei.HW3;

public class Exchanger {

    private Converter[] converters;

    public Exchanger() {
        this.converters = new Converter[3];
        this.converters[0] = new ConverterDollar();
        this.converters[1] = new ConverterYen();
        this.converters[2] = new ConverterYuan();
    }

    public double convert(double value, Type input, Type output) {
        for (Converter converter : converters) {
            if(converter.getType() == input){
                value = converter.convertToRub(value);
            }
        }
        for (Converter converter : converters) {
            if(converter.getType() == output){
                value = converter.convertToCurency(value);
            }
        }
        return value;
    }
}
