package by.epam.JavaEpam03_classes;

import java.util.Objects;

public class Customer {
    private int id;
    private long creditCardNum;
    private int bankNum;
    private String surname;
    private String name;
    private String fatherName;
    private String address;

    public Customer (int id, String surname, String name, String fatherName, String address, long creditCardNum, int bankNum) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        if (creditCardNum > 0) {
            this.creditCardNum = creditCardNum;
        } else {
            System.out.println("Номер карты должен быть положительным для id# " + id);
        }
        if (bankNum > 0) {
            this.bankNum = bankNum;
        } else {
            System.out.println("Номер банка должен быть положительным для id# " + id);
        }
    }

    public Customer () {
        id = 5;
        surname = "Лермонтов";
        name = "Михаил";
        fatherName = "Юрьевич";
        address = "Минск, ул. Купалы, 77-77";
        creditCardNum = 300300300300L;
        bankNum = 15;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) { this.surname = surname; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String secondName) {
        this.fatherName = secondName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String location) {
        this.address = location;
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }
    public void setCreditCardNum(long numberCreditCard) {
        this.creditCardNum = numberCreditCard;
    }

    public int getBankNum() {
        return bankNum;
    }
    public void setBankNum(int numberBank) {
        this.bankNum = numberBank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCardNum == customer.creditCardNum &&
                bankNum == customer.bankNum &&
                surname.equals(customer.surname) &&
                name.equals(customer.name) &&
                fatherName.equals(customer.fatherName) &&
                address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creditCardNum, bankNum, surname, name, fatherName, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", creditCardNum=" + creditCardNum +
                ", bankNum=" + bankNum +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
