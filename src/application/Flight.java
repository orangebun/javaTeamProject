package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
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



public class Flight {
	public SimpleStringProperty leavingTime, arriveTime, to, from, day;
	public SimpleIntegerProperty flightID, flightNum, capacity;
	public SimpleDoubleProperty cost;
	
	
	public Flight() {

	}
	
	public Flight(String leavingTime, String arriveTime, String to, String from, String day, int flightID,
			int flightNum, int capacity, double cost) {
		this.leavingTime = new SimpleStringProperty(leavingTime);
		this.arriveTime = new SimpleStringProperty(arriveTime);
		this.to = new SimpleStringProperty(to);
		this.from = new SimpleStringProperty(from);
		this.day = new SimpleStringProperty(day);
		this.flightID = new SimpleIntegerProperty(flightID);
		this.flightNum = new SimpleIntegerProperty(flightNum);
		this.capacity = new SimpleIntegerProperty(capacity);
		this.cost = new SimpleDoubleProperty(cost);
	}

	
	
	public String getLeavingTime() {
		return leavingTime.get();
	}



	public void setLeavingTime(String leavingTime) {
		this.leavingTime = new SimpleStringProperty(leavingTime);
	}



	public String getArriveTime() {
		return arriveTime.get();
	}



	public void setArriveTime(String arriveTime) {
		this.arriveTime = new SimpleStringProperty(arriveTime);
	}



	public String getTo() {
		return to.get();
	}



	public void setTo(String to) {
		this.to = new SimpleStringProperty(to);
	}



	public String getFrom() {
		return from.get();
	}



	public void setFrom(String from) {
		this.from = new SimpleStringProperty(from);
	}



	public String getDay() {
		return day.get();
	}



	public void setDay(String day) {
		this.day = new SimpleStringProperty(day);
	}



	public int getFlightID() {
		return flightID.get();
	}



	public void setFlightID(int flightID) {
		this.flightID = new SimpleIntegerProperty(flightID);
	}



	public int getFlightNum() {
		return flightNum.get();
	}



	public void setFlightNum(int flightNum) {
		this.flightNum = new SimpleIntegerProperty(flightNum);
	}



	public int getCapacity() {
		return capacity.get();
	}



	public void setCapacity(int capacity) {
		this.capacity = new SimpleIntegerProperty(capacity);
	}



	public double getCost() {
		return cost.get();
	}



	public void setCost(double cost) {
		this.cost = new SimpleDoubleProperty(cost);
	}




	
	
	
	

}
