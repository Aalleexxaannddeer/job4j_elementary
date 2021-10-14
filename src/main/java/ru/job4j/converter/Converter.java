package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(130);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("130 rebles are " + dollar + " dollars.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inOne = 130;
        double expectedOne = 1.8571428;
        double outOne = Converter.rubleToDollar(inOne);
        boolean passedOne = expectedOne == outOne;
        System.out.println("130 rubles are 1. Test result: " + passedOne);
    }
}
