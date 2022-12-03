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

public class SplashScreneControler implements Initializable{
	
	ImageView image1;
	
	public void initialize(URL location, ResourceBundle resources) {
		//Image im1 = new Image("Main_image.png");
		//image1.setImage(im1);
	}
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public Button login;
	public Button register;
	public TextField TextFieldUser;
	public TextField TextFieldPassword;
	
	public void switchToSplashScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToLogIn(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMainPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToRegistration(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Registration.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSecurityQuestions(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("ResetPassword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void handleLoginClick(ActionEvent event) {
		boolean login;
		String user = TextFieldUser.getText();
		String pass = TextFieldPassword.getText();
		System.out.println(user);
		
		if(user.equals("1234")) {
			login = false;
		} else {
			login = true;
		}
		
		
		if(login) {
			try{
				switchToMainPage(event);
			} catch(IOException ex) {
				System.out.println("OOF");
			}
		} else{
			
			try{
				switchToLogIn(event);
			} catch(IOException ex) {
				System.out.println("OOF");
			}
			
			//FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));	
			//root = loader.load();
		}	
	}
	
	public void handlePasswordReset(ActionEvent event) {
		try{
			switchToSecurityQuestions(event);
		} catch(IOException ex){
			System.out.println("Shux");
		}
	}
	
	
	
	

	

}
