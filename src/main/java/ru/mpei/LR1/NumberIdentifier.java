package ru.mpei.LR1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberIdentifier {
    List<String> romanNum = new ArrayList<String>(Arrays.asList("I","II","III","IV","V","VI","VII","VIII","IX","X"));
    public boolean isArabicNumber(String number){
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            return false;
        }
        return Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 10;
    }
    public boolean isRomanNumber(String number){
        return romanNum.contains(number);
    }

}
