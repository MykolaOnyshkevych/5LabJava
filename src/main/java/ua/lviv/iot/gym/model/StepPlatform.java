package ua.lviv.iot.gym.model;

public class StepPlatform extends CardioZoneMachine {
    private double highOfThePlatform;

    public double getHighOfThePlatform() {
        return highOfThePlatform;
    }

    public void setHighOfThePlatform(double highOfThePlatform) {
        this.highOfThePlatform = highOfThePlatform;
    }

    public StepPlatform(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double droppedWeightInKilo, double highOfThePlatform) {
        super(pricePerHour, durationInMinutes, producingCountry, model, droppedWeightInKilo);
        this.highOfThePlatform = highOfThePlatform;
    }

    public StepPlatform() {
        this(0.0, 0.0, null, null, 0, 0);
    }

    public String getHeaders() {
        return super.getHeaders() + ",highOfThePlatform ";
    }

    public String toCSV() {
        return super.toCSV() + "," + "highOfThePlatform= " + getHighOfThePlatform();
    }
}