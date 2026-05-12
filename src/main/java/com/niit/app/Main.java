package com.niit.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        DashboardView dashboard = new DashboardView();
        Scene scene = new Scene(dashboard, 1000,1000);

        //Link your csss here - ensure the path is correct
        scene.getStylesheets().add(getClass().getResource("com/niit/app/css").toExternalForm());

        primaryStage.setTitle("E-commerce Dashboard");

        primaryStage.setScene(scene);
        primaryStage.show();

    }
   public static void main(String [] args){
      launch(args);
   }
}