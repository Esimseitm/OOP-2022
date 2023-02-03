package Problem3;

public class Temperature
{
	// 2 fields
	private double temperature;
	private char scale;
	
	// 4 constructors
	
	public Temperature()
	{
		temperature = 0;
		scale = 'C';
	}
	
	public Temperature(char scale)
	{
		this.scale = scale;
		temperature = 0;
	}
	
	public Temperature(double temperature)
	{
		this.temperature = temperature;
		scale = 'C';
	}
	
	public Temperature(double temperature, char scale)
	{
		this.temperature = temperature;
		this.scale = scale;
	}
	
	
	// Methods
	public double toCelsius()
	{
		if (scale == 'C') return temperature;
		else return ((double) (Math.round((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
	}
	
	public double toFahrenheit()
	{
		if (scale == 'F') return temperature;
		else return (Math.round((9 * (temperature / 5) + 32) * 10) / 10);
	}
	
	
	// setters
	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}
	
	public void setScale(char scale)
	{
		this.scale = scale;
	}
	
	public void setBoth(double temperature, char scale)
	{
		this.temperature = temperature;
		this.scale = scale;
	}

	// toString
	
	public String toString()
	{
		if (scale == 'C')return String.format("%.1f degrees C = %.1f degrees F", temperature, toFahrenheit());
		else return String.format("%.1f degrees F = %.1f degrees C", temperature, toCelsius());
	}
}