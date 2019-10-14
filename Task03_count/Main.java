package by.epam.JavaEpam03_classes;
//Опишите класс, реализующий десятичный счетчик,
// который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющий получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса

public class Main {
    public static void main(String[] args) {
        Counter cnt = new Counter(5, 1, 20);

        System.out.println("Минимум: " + cnt.getMinValue());
        System.out.println("Максимум: " + cnt.getMaxValue());
        System.out.println("Текущее значение счетчика: " + cnt.getValue());

        System.out.print("Значения счетчика после ++1: ");
        cnt.increaseValueByOne();
        System.out.println(cnt.getValue());

        System.out.print("Значения счетчика после --1: ");
        cnt.decreaseValueByOne();
        System.out.println(cnt.getValue());
    }
}
