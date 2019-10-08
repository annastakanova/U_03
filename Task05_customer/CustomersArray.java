package by.epam.JavaEpam03_classes;

public class CustomersArray {
    private Customer[] customer = new Customer[10];

    CustomersArray() {
    };

    CustomersArray(Customer customer) {
        this.customer[0] = customer;
    }

    public void addCustomer(Customer customer) {
        for (int i = 0; i < this.customer.length; i++) {
            if (this.customer[i] == null) {
                this.customer[i] = customer;
                break;
            }
            if (i == this.customer.length - 1 && this.customer[i] != null) {
                System.out.println("Действие невозможно, массив заполнен");
            }
        }
    }

    public void removeCustomer(int customerId) {
        for (int i = 0; i < this.customer.length; i++) {
            if (this.customer[i] != null && this.customer[i].getId() == customerId) {
                this.customer[i] = null;
                break;
            }
            if (i == this.customer.length - 1
                    && (this.customer[i] == null || this.customer[i].getId() != customerId)) {
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

    void printCustomerCardDiapazon (long a, long b, Customer [] customer) {
        for (int i = 0; i < 5; i++) {
            if  (customer[i].getCreditCardNum() >= a && customer[i].getCreditCardNum() <= b) {
                System.out.println(customer[i].getSurname() + " ");
            }
        }
    }
}
