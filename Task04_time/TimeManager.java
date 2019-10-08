package by.epam.JavaEpam03_classes;

public class TimeManager {
    private int newHours;
    private int newMinutes;
    private int newSeconds;


    public int get_hours() {
        return newHours;
    }
    public void set_hours(int m_Hours) {
        this.newHours = m_Hours;
        Cansellation();
    }
    public int get_minutes() {
        return newMinutes;
    }
    public void set_minutes(int m_Minutes) {
        this.newMinutes = m_Minutes;
        Cansellation();
    }
    public int get_seconds() {
        return newSeconds;
    }
    public void set_seconds(int m_Seconds) {
        this.newSeconds = m_Seconds;
        Cansellation();
    }

    public TimeManager() {
        this.newHours = 0;
        this.newMinutes = 0;
        this.newSeconds = 0;
    }

    public TimeManager(int hours, int minutes, int seconds) {
        if (Check_Time(hours, minutes, seconds) == true) {
            this.newHours = hours;
            this.newMinutes = minutes;
            this.newSeconds = seconds;
            Cansellation();
        } else {
            this.newHours = 0;
            this.newMinutes = 0;
            this.newSeconds = 0;
            System.out.println("Неверные данные");
        }
    }

    public void Change_Time(int hours, int minutes, int seconds) {
        this.newHours += hours;
        this.newMinutes += minutes;
        this.newSeconds += seconds;
        Cansellation();
        if (Check_Time(hours, minutes, seconds) == false) {
            this.newHours = 0;
            this.newMinutes = 0;
            this.newSeconds = 0;
            System.out.println("Неверные данные");
        }
    }

    public boolean Check_Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            return false;
        }

        return true;
    }

    public void Cansellation() {
        if (newSeconds > 59) {
            newSeconds -= 60;
            newMinutes++;
        if (newMinutes > 59) {
                newMinutes -= 60;
                newHours++;
            }
        if (newHours > 23) {
            newHours -= 24;
            }
        }
    }
}
