package ua.lviv.iot.gym.model;

public class PowerMachine extends AbstractExerciseMachine {
    private double gainOfWeightInKilo;

    public PowerMachine() {
        this(0.0, 0.0, null, null, 0);
    }

    public double getGainOfWeightInKilo() {
        return gainOfWeightInKilo;
    }

    public void setGainOfWeightInKilo(double gainOfWeightInKilo) {
        this.gainOfWeightInKilo = gainOfWeightInKilo;
    }

    public PowerMachine(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double gainOfWeightInKilo) {
        super(pricePerHour, durationInMinutes, producingCountry, model);
        this.gainOfWeightInKilo = gainOfWeightInKilo;
    }

    public String getHeaders() {
        return super.getHeaders() + ",gainOfWeightInKilo ";
    }

    public String toCSV() {
        return super.toCSV() + "," + "gainOfWeightInKilo= " + getGainOfWeightInKilo();
    }
}