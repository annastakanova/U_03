package by.epam.JavaEpam03_classes;
//Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале


import by.epam.JavaEpam03_classes.Customer;
import by.epam.JavaEpam03_classes.CustomersArray;
public class Main {

    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(4,"Тургенев", "Иван","Сергеевич","Минск, ул. Скорины, 4-3",2700270027002700L,13 );
        customers[1] = new Customer(2,"Ахматова", "Анна","Андреевна","Минск, ул. Есенина, 39-102",2400240024002400L,34);
        customers[2] = new Customer(1,"Толстой", "Лев","Николаевич","Минск, ул. Танка, 2-33",1000100010001000L,13);
        customers[3] = new Customer(3,"Булгаков", "Михаил","Афанасьевич","Минск, ул. Коласа, 9-88",6300630063006300L,53);
        customers[4] = new Customer();

        System.out.println("\nДанные покупателей в алфавитном порядке:");
        Customerslogic sort = new Customerslogic();
        sort.customerAbcSort(customers);
        sort.printAbcSortedCustomers(customers);

        System.out.println("\nCписок покупателей, у кого номер кредитной карточки находится в интервале от 2400000000000000 до 2800000000000000:");
        long a = 2400000000000000L;
        long b = 2800000000000000L;
        Customerslogic choose = new Customerslogic();
        for (int i = 0; i < 5; i++) {
            if  (customers[i].getCreditCardNum() >= a && customers[i].getCreditCardNum() <= b) {
                System.out.println(customers[i].getSurname() + " ");
            }
        }
    }
}
