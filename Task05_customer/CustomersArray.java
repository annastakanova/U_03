package by.epam.JavaEpam03_classes;
import by.epam.JavaEpam03_classes.Customer;
import by.epam.JavaEpam03_classes.CustomersArray;

public class Customerslogic {

    public void removeCustomer(Customer [] customer, int customerId) {
        for (int i = 0; i < customer.length; i++) {
            if (customer[i] != null && customer[i].getId() == customerId) {
                customer[i] = null;
                break;
            }
            if (i == customer.length - 1
                    && (customer[i] == null || customer[i].getId() != customerId)) {
                System.out.println("Пользователя с ID " + customerId + "в базе нет");
            }
        }
    }

    void customerAbcSort (Customer [] customer) {
        Customer customerTemp;
        boolean temp = false;
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 5; i ++) {
                if (customer[i - 1].getSurname().charAt(0) > customer[i].getSurname().charAt(0)) {  //chartAt (int index) возвращает символ, стоящий на индексе
                    customerTemp = customer[i-1];
                    customer[i-1] = customer[i];
                    customer[i] = customerTemp;
                    temp = true;
                }
            }
            if (!temp) {
                break;
            }
        }
    }
    public static void printAbcSortedCustomers(Customer [] customer) {
        for (int i = 0; i < 5; i++) {
            System.out.println(customer[i].toString());
        }
    }
}
