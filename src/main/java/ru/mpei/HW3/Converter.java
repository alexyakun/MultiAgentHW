package ru.mpei.HW3;



public interface Converter {
    double convertToRub(double ue);
    double convertToCurency(double rub);
    Type getType();
}
