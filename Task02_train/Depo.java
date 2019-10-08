package by.epam.JavaEpam03_classes;

public class Depo {
    private Train[] trains;
    private int countOfTrains;

    public Depo(int number) {
        trains = new Train[number];
        countOfTrains = 0;
    }

    public boolean add(Train newTrain) {
        if (countOfTrains >= trains.length) {
            return false;
        }
        trains[countOfTrains] = newTrain;
        countOfTrains++;
        return true;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }
}
