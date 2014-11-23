package puica.se.mvc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

import puica.se.mvc.models.WeatherModel;

import java.awt.Font;


public class WeatherView extends JFrame {
	//View Components
	private JPanel contentPane;
	private JTextField textFieldTemperature;
	private JTextField textFieldHumidity;
	private WeatherModel mModel=new WeatherModel();
	private JButton btnUpdate = new JButton("Update");

	public WeatherView() {
		//Initialize view components
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUpdate.setBounds(173, 197, 89, 23);
		contentPane.add(btnUpdate);
		
		
		textFieldTemperature = new JTextField();
		textFieldTemperature.setBounds(156, 52, 106, 23);
		textFieldTemperature.enableInputMethods(false);
		contentPane.add(textFieldTemperature);
		textFieldTemperature.setColumns(10);
		textFieldTemperature.setEditable(false);
		
		textFieldHumidity = new JTextField();
		textFieldHumidity.setBounds(156, 104, 106, 23);
		contentPane.add(textFieldHumidity);
		textFieldHumidity.setColumns(10);
		textFieldHumidity.setEditable(false);
		
		JLabel lblTemperature = new JLabel("Temperatura");
		lblTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemperature.setBounds(52, 52, 89, 18);
		contentPane.add(lblTemperature);
		
		JLabel lblHumidity = new JLabel("Umiditate");
		lblHumidity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHumidity.setBounds(77, 106, 64, 14);
		contentPane.add(lblHumidity);
	}
	
	//Sets view action listener
	public void addUpdateListener(ActionListener listenForUpdate) {
		btnUpdate.addActionListener(listenForUpdate);
	}
	
	//functions to change displayed information
	public void setTemperature(String temperature)
	{
		textFieldTemperature.setText(temperature);
	}
	public void setHumidity(String humidity)
	{
		textFieldHumidity.setText(humidity);
	}
}
