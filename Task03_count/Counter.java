package by.epam.JavaEpam03_classes;

import java.util.Objects;

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
        if (minValue < maxValue) {
            this.maxValue = maxValue;
            this.minValue = minValue;
        }
        if (value >= minValue || value >= maxValue) {
            this.value = value;
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return value == counter.value &&
                maxValue == counter.maxValue &&
                minValue == counter.minValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, maxValue, minValue);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", maxValue=" + maxValue +
                ", minValue=" + minValue +
                '}';
    }


    public void increaseValueByOne() {
        if (++value > maxValue) {
            value = minValue;
        }    }

    public void decreaseValueByOne() {
        if (--value < minValue) {
            value = maxValue;
        }
    }
}
