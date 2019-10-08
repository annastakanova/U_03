package by.epam.JavaEpam03_classes;
import java.util.List;

//Создайте класс Train, содержащий поля:
// название пункта назначения,
// номер поезда,
// время отправления.

// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

public class Main {

    public static void main(String[] args) {

            Depo trains = new Depo(5);

            trains.add(new Train("Таллин", 3, 20.15));
            trains.add(new Train("Москва", 2, 10.25));
            trains.add(new Train("Берлин", 5, 08.10));
            trains.add(new Train("Амстердам", 4, 06.30));
            trains.add(new Train("Амстердам ", 1, 18.10));

            System.out.println("\nвсе поезда:");
            List<Train> trainsNotSort = DepoLogic.getTrains(trains);
            printTrains(trainsNotSort);

            System.out.println("\nсортировка по №:");
            Train[] sortNum = DepoLogic.sortTrainsNum(trains);
            printTrains1(sortNum);

            System.out.println("\nвывод информации по заданному №:");
            int n = 2;
            DepoLogic.getTrainInfo(trains, n);

            System.out.println("\nсортировка по направлению:");
            Train[] sortNameCity = DepoLogic.sortByCity(trains);
            printTrains1(sortNameCity);

        }

        public static void printTrains(List<Train> trains) {
            for (Train st : trains) {
                System.out.print("поезд №" + st.getTrainNum() +  ": ");
                System.out.printf("%-10s", st.getDestination());
                System.out.printf("%-10s\n", st.getTime());
            }
        }

        public static void printTrains1(Train[] trains) {
            for (Train st : trains) {
                System.out.print("поезд №" + st.getTrainNum() +  ": ");
                System.out.printf("%-10s", st.getDestination());
                System.out.printf("%-10s\n", st.getTime());
            }
        }

}