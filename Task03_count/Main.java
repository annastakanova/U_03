package by.epam.JavaEpam03_classes;
//Опишите класс, реализующий десятичный счетчик,
// который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющий получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса

public class Main {
    public static void main(String[] args) {
        Counter cnt = new Counter(5, 1, 20);
        cnt.getInfo();
        System.out.println("Значения счетчика после изменений: ");

        cnt.increaseValueByOne();
        System.out.println(cnt.getValue());

        cnt.decreaseValueByOne();
        System.out.println(cnt.getValue());
    }
}
