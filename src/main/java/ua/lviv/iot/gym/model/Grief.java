package ua.lviv.iot.gym.model;

import java.util.Objects;

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

   /* public String getHeaders() {
        return super.getHeaders() + ",ropeLenghtInMeters " + ",sittingPlaceHighInMeters";
    }*/

    public String toCSV() {
        return super.toCSV() + "," + "ropeLenghtInMeters= " + getRopeLenghtInMeters() + ","
                + "sittingPlaceHighInMeters=" + getSittingPlaceHighInMeters();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Grief that = (Grief) o;
        return getRopeLenghtInMeters() == that.getRopeLenghtInMeters() && getSittingPlaceHighInMeters() == that.getSittingPlaceHighInMeters();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRopeLenghtInMeters(),getSittingPlaceHighInMeters() );
    }

    @Override
    public String toString() {
        return "Grief [ropeLenghtInMeters=" + ropeLenghtInMeters + ", sittingPlaceHighInMeters="
                + sittingPlaceHighInMeters + "]";
    }
}