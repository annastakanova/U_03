package by.epam.JavaEpam03_classes;
//Создайте класс с именем Student, содержащий поля:
// фамилия и инициалы,
// номер группы,
// успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.

public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Олег", "Власов", 1, new int[]{3, 4, 5, 6, 7}),
                new Student("Иван", "Тургенев", 2, new int[]{5, 7, 5, 3, 2}),
                new Student("Бэн", "Льюэс", 3, new int[]{9, 10, 9, 10, 10}),
                new Student("Лев", "Толстой", 3, new int[]{8, 8, 8, 9, 10}),
                new Student("Сергей", "Есенин", 3, new int[]{8, 5, 4, 4, 10}),
                new Student("Вольфганг", "Моцарт", 2, new int[]{10, 10, 9, 9, 10}),
                new Student("Альберт", "Эйнштейн", 2, new int[]{4, 9, 9, 9, 10}),
                new Student("Ричард", "Фейнман", 3, new int[]{9, 9, 9, 9, 10}),
                new Student("Исаак", "Ньютон", 4, new int[]{9, 9, 9, 9, 3}),
                new Student("Амедео", "Модильяни", 1, new int[]{9, 9, 9, 9, 10}),
        };

        boolean check = false;

        for (int j = 0; j<students.length; j++) {
            for (int i = 0; i < 5; i++) {

                if (students[j].getMarks()[i] == 9 || students[j].getMarks()[i] == 10) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }

            if (check == true)
                System.out.println("Фамилия ученика: " + students[j].getLastName() + ", группа " + students[j].getGroup());
        }
    }
}
