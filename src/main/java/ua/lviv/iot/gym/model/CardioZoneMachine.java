package ua.lviv.iot.gym.model;

public class CardioZoneMachine extends AbstractExerciseMachine {
    private double droppedWeightInKilo;

    public CardioZoneMachine(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double droppedWeightInKilo) {
        super(pricePerHour, durationInMinutes, producingCountry, model);
        this.droppedWeightInKilo = droppedWeightInKilo;
    }

    public double getDroppedWeightInKilo() {
        return droppedWeightInKilo;
    }

    public CardioZoneMachine() {
        this(0.0, 0.0, null, null, 0);
    }

    public void setDroppedWeightInKilo(double droppedWeightInKilo) {
        this.droppedWeightInKilo = droppedWeightInKilo;
    }

    public String getHeaders() {
        return super.getHeaders() + ",droppedWeightInKilo ";
    }

    public String toCSV() {
        return super.toCSV() + "," + "droppedWeightInKilo= " + getDroppedWeightInKilo();
    }
}