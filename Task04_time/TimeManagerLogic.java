package by.epam.JavaEpam03_classes;
import by.epam.JavaEpam03_classes.TimeManager;

public class TimeManagerLogic {
    public void changeHours(TimeManager tm, int hour){
        if((hour + tm.getHours()) <= 24)
            tm.setHours(hour + tm.getHours());
        else
            tm.setHours(hour + tm.getHours() - 24);
    }

    public void changeMinute(TimeManager tm, int minute){
        if((minute + tm.getMinutes()) <= 60)
            tm.setMinutes(minute + tm.getMinutes());
        else {
            tm.setMinutes(minute + tm.getMinutes() - 60);
            tm.setHours(tm.getHours() + 1);
        }
    }

    public void changeSecond(TimeManager tm, int second) {
        if ((second + tm.getSeconds()) <= 60)
            tm.setSeconds(second + tm.getSeconds());
        else {
            tm.setSeconds(second + tm.getSeconds() - 60);
            tm.setMinutes(tm.getMinutes() + 1);
        }
    }

    public boolean checkTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            return false;
        }
        return true;
    }
}
