# Job4j. Расстояние между точками в системе координат.
Проект содержит решения блока "7. Расстояние между точками в системе координат [#188 #214677]" курса Job4j."
Задание:
1. Создал класс ru.job4j.condition.Point. Дописал метод distance.
2. Доработал метод main. 
3. Загрузил код на github.com. 
Изначально:

package ru.job4j.condition;

    public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}