
package ua.lviv.iot.gym.model;

public class RaceTrack  extends CardioZoneMachine{
	private double trackSpeedInMetersPerSecond;

	public double getTrackSpeedInMetersPerSecond() {
		return trackSpeedInMetersPerSecond;
	}

	public void setTrackSpeedInMetersPerSecond(double trackSpeedInMetersPerSecond) {
		this.trackSpeedInMetersPerSecond = trackSpeedInMetersPerSecond;
	}
	public RaceTrack() {
		this(0.0, 0.0,null,null,0,0);
	}
	public RaceTrack(double pricePerHour, double durationInMinutes, 
	String producingCountry, String model,double droppedWeightInKilo, 
	double trackSpeedInMetersPerSecond) {
		super(pricePerHour, durationInMinutes, producingCountry,
		model, droppedWeightInKilo);
		this.trackSpeedInMetersPerSecond = trackSpeedInMetersPerSecond;
	}
	public String getHeaders() {
		return super.getHeaders()+",trackSpeedInMetersPerSecond ";
	}
	public String toCSV() {
		return super.toCSV()+","+"trackSpeedInMetersPerSecond= "+getTrackSpeedInMetersPerSecond();
	}
}