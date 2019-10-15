package by.epam.JavaEpam03_classes;

import java.util.Arrays;

public class CustomersArray {
    private Customer[] customer = new Customer[10];

    CustomersArray() { };
    CustomersArray(Customer customer) {
        this.customer[0] = customer;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersArray that = (CustomersArray) o;
        return Arrays.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customer);
    }

    @Override
    public String toString() {
        return "CustomersArray{" + "customer=" + Arrays.toString(customer) + '}';
    }
}
