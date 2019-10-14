package by.epam.JavaEpam03_classes;

public class Train {
    private String destination;
    private int trainNum;
    private double time;

    public Train(String destination, int trainNum, double time) {
        this.destination = destination;
        this.trainNum = trainNum;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Train train = (Train) object;
        return trainNum == train.trainNum &&
                Double.compare(train.time, time) == 0 &&
                destination.equals(train.destination);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), destination, trainNum, time);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNum=" + trainNum +
                ", time=" + time +
                '}';
    }
}
