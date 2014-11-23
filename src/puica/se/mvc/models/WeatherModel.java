package puica.se.mvc.models;

import java.util.Random;

public class WeatherModel {
	//Model components
	private int temperature;
	private int humidity;
	private Random randomNumber=new Random();
	private final int temperatureRange=50;
	private final int humidityRange=100;
	//Functions for getting information from lower level
	public int getTemperature() {
		temperature=randomNumber.nextInt(temperatureRange);
	    return temperature;
	}
	public int getHumidity(){
		humidity=randomNumber.nextInt(humidityRange);
		return humidity;
	}
}
