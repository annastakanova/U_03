package by.epam.JavaEpam03_classes;
// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей
// (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Main {
    public static void main(String[] args) {
        TimeManager tm = new TimeManager(20, 55, 45);
        System.out.println("Исходное время = " + tm.get_hours() + ":" + tm.get_minutes() + ":" + tm.get_seconds());

        tm.Change_Time(6, 20, 25);
        System.out.println("Измененное время = " + tm.get_hours() + ":" + tm.get_minutes() + ":" + tm.get_seconds());
    }
}
