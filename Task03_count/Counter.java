package by.epam.JavaEpam03_classes;

public class Counter {
    private int value;
    private int maxValue;
    private int minValue;

    public Counter() {
        this.maxValue = 0;
        this.minValue = 0;
        this.value = 0;
    }

    public Counter(int value, int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
    public int getMaxValue() {
        return this.maxValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
    public int getMinValue() {
        return this.minValue;
    }

    public void increaseValueByOne() {
        if (isAvailableValue(value) && isAvailableValue(value + 1)) {
            value++;
        }
        else System.out.println("операция не выполнена, так как значение счётчика выходит за максимальный предел допустимых значений");
    }

    public void decreaseValueByOne() {
        if (isAvailableValue(value) && isAvailableValue(value - 1)){
            value--;}
        else System.out.println("операция не выполнена, так как значение счётчика выходит за минимальный пределы допустимых значений");
    }

    private boolean isAvailableValue(int checkingValue) {
        if (checkingValue >= minValue && checkingValue <= maxValue) {
            return true;
        }
        return false;
    }
    public void getInfo() {
        System.out.println("Текущее значение счетчика: " + value);
        System.out.println("минимум: " + minValue);
        System.out.println("максимум: " + maxValue);
        System.out.println();
    }
}