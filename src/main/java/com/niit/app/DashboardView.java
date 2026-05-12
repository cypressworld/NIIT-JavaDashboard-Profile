package com.niit.app;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;

public class DashboardView extends BorderPane{
    public DashboardView(){
       VBox sidebar = new VBox(10);
       sidebar.setStyle("-fx-background-color: #2c3e50; -fx-padding: 15;");
       Button btnStore = new Button("Store");
       Button btnOrders = new Button("Order");

       btnStore.setStyle("-fx-text-fill:white; -fx-backgroud-color: transparent;");
        btnOrders.setStyle("-fx-text-fill:white; -fx-backgroud-color: transparent;");

        sidebar.getChildren().addAll(new Label("ADMIN PANEL"), btnStore, btnOrders);
        this.setLeft(sidebar);

        Label welcome = new Label("E-commerce Analytics Dashboard");
        welcome.setStyle("-fx-font-size: 24px; -fx-padding: 20;");
        this.setCenter(welcome);
    }
}