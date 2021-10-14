# Job4j. 0. Что такое тестирование [#159431].
Проект содержит решения блока "0. Что такое тестирование [#159431]" курса Job4j.
Задание:
1. Создал класс ru.job4j.converter.Converter;
2. Изначально было:

package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return -1;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}

3.Загрузил код на github.com;
