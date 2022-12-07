package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.fxml.FXML;
import java.util.ArrayList;



public class BookingController implements Initializable{
	@FXML private TableView<Flight> tableView;
	@FXML private TableColumn<Flight, Integer> flightIDColumn;
	@FXML private TableColumn<Flight, Integer> flightNumColumn;
	@FXML private TableColumn<Flight, Integer> capacityColumn;
	@FXML private TableColumn<Flight, Double> costColumn;
	@FXML private TableColumn<Flight, String> dayColumn;
	@FXML private TableColumn<Flight, String> toColumn;
	@FXML private TableColumn<Flight, String> fromColumn;
	@FXML private TableColumn<Flight, String> arriveTimeColumn;
	@FXML private TableColumn<Flight, String> leavingTimeColumn;
	
	
	public void initialize(URL url, ResourceBundle rb) {
		flightIDColumn.setCellValueFactory(new PropertyValueFactory<Flight, Integer> ("flightID"));
		flightNumColumn.setCellValueFactory(new PropertyValueFactory<Flight, Integer> ("flightNum"));
		capacityColumn.setCellValueFactory(new PropertyValueFactory<Flight, Integer> ("capacity"));
		costColumn.setCellValueFactory(new PropertyValueFactory<Flight, Double> ("cost"));
		dayColumn.setCellValueFactory(new PropertyValueFactory<Flight, String> ("day"));
		toColumn.setCellValueFactory(new PropertyValueFactory<Flight, String> ("to"));
		fromColumn.setCellValueFactory(new PropertyValueFactory<Flight, String> ("from"));
		arriveTimeColumn.setCellValueFactory(new PropertyValueFactory<Flight, String> ("arriveTime"));
		leavingTimeColumn.setCellValueFactory(new PropertyValueFactory<Flight, String> ("leavingTime"));
		
		tableView.setItems(getFlights());
		
	}
	public ObservableList<Flight> getFlights(){
		int numRows;
		
		
		numRows = 10;
		//numRows = length of SQL query for initial data
		
		//use loop to add values use sql query in loop to set vars
		/*
		for(int i = 0, i < numRows, i++) {
			ObservableList<Flight> flights = FXCollections.observableArrayList();
			flights.add(new flights(flightIDVar, toVar, fromVar, arriveTimeVar, leavingTimeVar))
		}
		*/
		
		int flightIDVar = 1;
		int flightNumVar = 1;
		int capacityVar = 1;
		double costVar = 1;
		String dayVar = "4/25/2022";
		String toVar = "Atlanta";
		String fromVar = "Chicago";
		String arriveTimeVar = "4:00 PM";
		String leavingTimeVar = "2:00 PM";
		//Delete below and use for loop in tandem with sql query
		ObservableList<Flight> flights = FXCollections.observableArrayList();
		flights.add(new Flight(leavingTimeVar, arriveTimeVar, toVar, fromVar, dayVar, flightIDVar, flightNumVar, capacityVar, costVar));
		return flights;
	}
	
	public void handleDelete(ActionEvent event){
	        ObservableList<Flight> selectedRows, allFlights;
	        allFlights = tableView.getItems();
	        
	        //this gives us the rows that were selected
	        selectedRows = tableView.getSelectionModel().getSelectedItems();
	        
	        //loop over the selected rows and remove the Person objects from the table
	        for (Flight flight: selectedRows)
	        {
	        	allFlights.remove(flight);
	        }
	    }
	
	
	public void switchToSplashScreen(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMainPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root); 
		stage.setScene(scene);
		stage.show();
	}
	
	public void handleSignOut(ActionEvent event){
		try {
			switchToSplashScreen(event);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void handleBackToMain(ActionEvent event){
		try {
			switchToMainPage(event);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	    
	    
	
}