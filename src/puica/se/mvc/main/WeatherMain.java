package puica.se.mvc.main;
import java.awt.EventQueue;

import puica.se.mvc.controllers.WeatherController;
import puica.se.mvc.models.WeatherModel;
import puica.se.mvc.views.WeatherView;


public class WeatherMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a model and a view
		WeatherModel model = new WeatherModel();
		WeatherView frame = new WeatherView();
		//Dislay the view
		frame.setVisible(true);
		//Connect the controller with the view and the model
		WeatherController controller = new WeatherController(frame,model);
	}

}
