/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floreantlicenceactivator;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author bairuha technologies
 */
public class FloreantLicenceActivator extends Application {
    public static String getMacAddress() {
        InetAddress ip;
        StringBuilder sb = new StringBuilder();
        try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return sb.toString();
    } 

    @Override
    public void start(Stage primaryStage) {

        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
//Defining the Name text field
        final TextField host = new TextField("localhost");
        host.setPromptText("Enter host");
        GridPane.setConstraints(host, 0, 0);
        grid.getChildren().add(host);
//Defining the Last Name text field
        final TextField port = new TextField("3306");
        port.setPromptText("Enter port");
        GridPane.setConstraints(port, 0, 1);
        grid.getChildren().add(port);

        //Defining the DBName text field
//        final TextField dbname = new TextField();
//        dbname.setPromptText("Enter dbname");
//        GridPane.setConstraints(port, 0, 2);
//        grid.getChildren().add(dbname);
        //Defining the DBName text field
        final TextField username = new TextField("floreant");
        username.setPromptText("Enter username");
        GridPane.setConstraints(username, 0, 3);
        grid.getChildren().add(username);

        //Defining the DBName text field
        final TextField password = new TextField("floreant");
        password.setPromptText("Enter password");
        GridPane.setConstraints(password, 0, 4);
        grid.getChildren().add(password);

        //Defining the Submit button
        Button submit = new Button("Activate POS");
        GridPane.setConstraints(submit, 0, 5);
        grid.getChildren().add(submit);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(".key===()" + getKey(host.getText(), port.getText(), username.getText(), password.getText()));;
            }
        });

        Scene scene = new Scene(grid, 350, 350);
        primaryStage.setTitle("POS Licence");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static String getKey(String host, String port, String username, String password) {
        String key = null;
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return key;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/posdb", username, password);
            PreparedStatement ps = connection.prepareStatement("truncate table florant_licence_key");
            Boolean rs = ps.execute();
            
            
            PreparedStatement psinsert = connection.prepareStatement("insert into florant_licence_key (KEYVALUE) values (\""+getMacAddress()+"\")");
            
            int rsInsert = psinsert.executeUpdate();
            System.out.println("rsInsert=="+rsInsert);
            
            
             
            
            
             

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return key;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return key;
    }

}
