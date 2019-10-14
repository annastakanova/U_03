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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Depo depo = (Depo) object;
        return countOfTrains == depo.countOfTrains &&
                java.util.Arrays.equals(trains, depo.trains);
    }

    public int hashCode() {
        int result = Objects.hash(super.hashCode(), countOfTrains);
        result = 31 * result + Arrays.hashCode(trains);
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Depo{" +
                "trains=" + java.util.Arrays.toString(trains) +
                ", countOfTrains=" + countOfTrains +
                '}';
    }
}
