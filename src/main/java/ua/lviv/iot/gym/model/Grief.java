package ua.lviv.iot.gym.model;

public class Grief extends PowerMachine {
    private double ropeLenghtInMeters;
    private double sittingPlaceHighInMeters;

    public Grief() {
        this(0.0, 0.0, null, null, 0, 0, 0);
    }

    public Grief(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double gainOfWeightInKilo, double ropeLenghtInMeters, double sittingPlaceHighInMeters) {
        super(pricePerHour, durationInMinutes, producingCountry, model, gainOfWeightInKilo);
        this.ropeLenghtInMeters = ropeLenghtInMeters;
        this.sittingPlaceHighInMeters = sittingPlaceHighInMeters;
    }

    public double getRopeLenghtInMeters() {
        return ropeLenghtInMeters;
    }

    public void setRopeLenghtInMeters(double ropeLenghtInMeters) {
        this.ropeLenghtInMeters = ropeLenghtInMeters;
    }

    public double getSittingPlaceHighInMeters() {
        return sittingPlaceHighInMeters;
    }

    public void setSittingPlaceHighInMeters(double sittingPlaceHighInMeters) {
        this.sittingPlaceHighInMeters = sittingPlaceHighInMeters;
    }

    public String getHeaders() {
        return super.getHeaders() + ",ropeLenghtInMeters " + ",sittingPlaceHighInMeters";
    }

    public String toCSV() {
        return super.toCSV() + "," + "ropeLenghtInMeters= " + getRopeLenghtInMeters() + ","
                + "sittingPlaceHighInMeters=" + getSittingPlaceHighInMeters();
    }
}