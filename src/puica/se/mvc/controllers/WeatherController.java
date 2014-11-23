package puica.se.mvc.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import puica.se.mvc.models.WeatherModel;
import puica.se.mvc.views.WeatherView;

public class WeatherController {
	private WeatherView mView;
	private WeatherModel mModel;
	//Contructor
	public WeatherController(WeatherView mView,WeatherModel mModel)
	{
		this.mModel=mModel;
		this.mView=mView;
		this.mView.addUpdateListener(new UpdateListener());
	}
	class UpdateListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//If action performed update view components
			mView.setTemperature(""+mModel.getTemperature());
			mView.setHumidity(""+mModel.getHumidity());
		}
	}
}
