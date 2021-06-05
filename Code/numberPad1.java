package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class numberPad1 {
    // creating method to set all calculators in Main.java
    public static void numberPad(TextField tF, GridPane gP){
        //creating buttons and add them to gridpane
        Button bt0=new Button("0");
        bt0.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");
        bt0.setPrefHeight(50);
        bt0.setPrefWidth(50);


        Button bt1=new Button("1");
        bt1.setPrefHeight(50);
        bt1.setPrefWidth(50);
        bt1.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");



        Button bt2=new Button("2");
        bt2.setPrefHeight(50);
        bt2.setPrefWidth(50);
        bt2.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt3=new Button("3");
        bt3.setPrefHeight(50);
        bt3.setPrefWidth(50);
        bt3.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt4=new Button("4");
        bt4.setPrefHeight(50);
        bt4.setPrefWidth(50);
        bt4.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt5=new Button("5");
        bt5.setPrefHeight(50);
        bt5.setPrefWidth(50);
        bt5.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt6=new Button("6");
        bt6.setPrefHeight(50);
        bt6.setPrefWidth(50);
        bt6.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt7=new Button("7");
        bt7.setPrefHeight(50);
        bt7.setPrefWidth(50);
        bt7.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt8=new Button("8");
        bt8.setPrefHeight(50);
        bt8.setPrefWidth(50);
        bt8.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button bt9=new Button("9");
        bt9.setPrefHeight(50);
        bt9.setPrefWidth(50);
        bt9.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");


        Button btC=new Button("C");
        btC.setPrefHeight(50);
        btC.setPrefWidth(50);
        btC.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");



        Button btDot=new Button(".");
        btDot.setPrefHeight(50);
        btDot.setPrefWidth(50);
        btDot.setStyle("-fx-background-color: coral;"+
                "-fx-border-color: black;"+
                "-fx-border-width: 3;"+
                "-fx-font-family: 'Arial Black'");

        for (int i=0; i<tF.getText().length(); i++){
            String string=Character.toString(tF.getText().charAt(i));
            if (string.contentEquals(".")){
                btDot.setDisable(true);
            }

        }


        bt0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("0");
            }
        });
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("1");
            }
        });
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("2");
            }
        });
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("3");
            }
        });
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("4");
            }
        });
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("5");
            }
        });
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("6");
            }
        });
        bt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("7");
            }
        });
        bt8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("8");
            }
        });
        bt9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText("9");
            }
        });
        btC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.setText(tF.getText().substring(0,tF.getText().length()-1));
                btDot.setDisable(false);
            }
        });
        btDot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tF.appendText(".");
                btDot.setDisable(true);
                for (int i=0; i<tF.getText().length(); i++){
                    String string=Character.toString(tF.getText().charAt(i));
                    if (string.contentEquals(".")){
                        btDot.setDisable(true);
                    }

                }
            }
        });

//adding numberpad to gridpane
        gP.add(bt0,4,18);
        gP.add(bt1,3,15);
        gP.add(bt2,4,15);
        gP.add(bt3,5,15);
        gP.add(bt4,3,16);
        gP.add(bt5,4,16);
        gP.add(bt6,5,16);
        gP.add(bt7,3,17);
        gP.add(bt8,4,17);
        gP.add(bt9,5,17);
        gP.add(btC,3,18);
        gP.add(btDot,5,18);

    }

    }

