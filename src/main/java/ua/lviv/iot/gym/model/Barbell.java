
package ua.lviv.iot.gym.model;

public class Barbell extends PowerMachine{
	private double handleLenghtInMeters;

	public double getHandleLenghtInMeters() {
		return handleLenghtInMeters;
	}

	public void setHandleLenghtInMeters(double handleLenghtInMeters) {
		this.handleLenghtInMeters = handleLenghtInMeters;
	}
	public Barbell() {
		this(0.0, 0.0,null,null,0,0);
	}
	public Barbell(double pricePerHour, double durationInMinutes, String producingCountry, 
		String model,double gainOfWeightInKilo, double handleLenghtInMeters) {
		super(pricePerHour, durationInMinutes, producingCountry, model, gainOfWeightInKilo);
		this.handleLenghtInMeters = handleLenghtInMeters;
	}
	public String getHeaders() {
		return super.getHeaders()+",handleLenghtInMeters ";
	}
	public String toCSV() {
		return super.toCSV()+","+"handleLenghtInMeters= "+getHandleLenghtInMeters();
	}
}