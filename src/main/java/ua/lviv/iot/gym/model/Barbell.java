package ua.lviv.iot.gym.model;

import java.util.Objects;

public class Barbell extends PowerMachine {
    private double handleLenghtInMeters;

    public double getHandleLenghtInMeters() {
        return handleLenghtInMeters;
    }

    public void setHandleLenghtInMeters(double handleLenghtInMeters) {
        this.handleLenghtInMeters = handleLenghtInMeters;
    }

    public Barbell() {
        this(0.0, 0.0, null, null, 0, 0);
    }

    public Barbell(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double gainOfWeightInKilo, double handleLenghtInMeters) {
        super(pricePerHour, durationInMinutes, producingCountry, model, gainOfWeightInKilo);
        this.handleLenghtInMeters = handleLenghtInMeters;
    }

   /* public String getHeaders() {
        return super.getHeaders() + ",handleLenghtInMeters ";
    }*/

    public String toCSV() {
        return super.toCSV() + "," + "handleLenghtInMeters= " + getHandleLenghtInMeters();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Barbell that = (Barbell) o;
        return getHandleLenghtInMeters() == that.getHandleLenghtInMeters();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHandleLenghtInMeters());
    }

    @Override
    public String toString() {
        return "Barbell [handleLenghtInMeters=" + handleLenghtInMeters + "]";
    }

}