package by.epam.JavaEpam03_classes;
import by.epam.JavaEpam03_classes.TimeManager;

// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей
// (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Main {
    public static void main(String[] args) {
        TimeManagerLogic tml = new TimeManagerLogic();
        TimeManager tm = new TimeManager();
        System.out.println("Исходное время = " + tm.getHours() + ":" + tm.getMinutes() + ":" + tm.getSeconds());

        tml.changeHours(tm,6);
        tml.changeMinute (tm, 20);
        tml.changeSecond (tm, 25);

        System.out.println("Измененное время = " + tm.getHours() + ":" + tm.getMinutes() + ":" + tm.getSeconds());
    }
}
