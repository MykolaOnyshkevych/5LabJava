package ua.lviv.iot.gym.model;

import java.util.Objects;

public abstract class AbstractExerciseMachine {
  
    private double pricePerHour;
    private double durationInMinutes;
    private String producingCountry;
    private String model;
    

   public AbstractExerciseMachine() {
        super();
    }

    public AbstractExerciseMachine(double pricePerHour, double durationInMinutes, String producingCountry,
            String model) {
        this.pricePerHour = pricePerHour;
        this.durationInMinutes = durationInMinutes;
        this.producingCountry = producingCountry;
        this.model = model;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toCSV() {
        return "price = " + getPricePerHour() + " duration = " + getDurationInMinutes() + " country = "
                + getProducingCountry() + " model = " + getModel();
    }

    /*public String getHeaders() {

        return "pricePerHour,durationInMinutes,producingCountry,String model";
    }*/
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractExerciseMachine that = (AbstractExerciseMachine) o;
        return getPricePerHour() == that.getPricePerHour() &&
                getDurationInMinutes() == that.getDurationInMinutes() &&
                        getProducingCountry() == that.getProducingCountry() &&
                                getModel().equals(that.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPricePerHour(), getDurationInMinutes(), getProducingCountry(), getModel());
    }

    @Override
    public String toString() {
        return "AbstractExerciseMachine [pricePerHour=" + pricePerHour + ", durationInMinutes=" + durationInMinutes
                + ", producingCountry=" + producingCountry + ", model=" + model +  "]";
    }
}