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
}
