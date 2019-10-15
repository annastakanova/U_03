package by.epam.JavaEpam03_classes;
import java.util.Objects;

public class TimeManager {
    private int newHours;
    private int newMinutes;
    private int newSeconds;

    public TimeManager() {
        this.newHours = 20;
        this.newMinutes = 55;
        this.newSeconds = 45;
    }

    public TimeManager(int hours, int minutes, int seconds) {
        TimeManager tml = new TimeManager ();
        this.newHours = hours;
        this.newMinutes = minutes;
        this.newSeconds = seconds;
    }

    public int getHours() {
        return newHours;
    }
    public void setHours(int m_Hours) {
        this.newHours = m_Hours;
    }

    public int getMinutes() {
        return newMinutes;
    }
    public void setMinutes(int m_Minutes) {
        this.newMinutes = m_Minutes;
    }

    public int getSeconds() {
        return newSeconds;
    }
    public void setSeconds(int m_Seconds) {
        this.newSeconds = m_Seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeManager that = (TimeManager) o;
        return newHours == that.newHours &&
                newMinutes == that.newMinutes &&
                newSeconds == that.newSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newHours, newMinutes, newSeconds);
    }

    @Override
    public String toString() {
        return "TimeManager{" +
                "newHours=" + newHours +
                ", newMinutes=" + newMinutes +
                ", newSeconds=" + newSeconds +
                '}';
    }
}
