package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float euro = 70;
        float rsl = value / euro;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float dollar = 60;
        float rsl = value / dollar;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars");

    }
}
