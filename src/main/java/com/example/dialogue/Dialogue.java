package com.example.dialogue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Optional;

public class Dialogue extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*  Set Error Dialogue
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Invalid Gregorian Calender date");
        Label label=new Label("Date entered");
        TextArea textArea=new TextArea(new GregorianCalendar().toString());
        textArea.setEditable(false);
        textArea.setWrapText(true);
        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea,Priority.ALWAYS);
        GridPane expandableContent=new GridPane();
        expandableContent.add(label,0,0);
        expandableContent.add(textArea,0,1);
        alert.getDialogPane().setExpandableContent(expandableContent);
        alert.showAndWait();
        */
        // create an confirmation dialogue
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Pick an option");
        alert.setHeaderText(null);
        alert.setContentText("How would rate your vehicle performance?");
        ButtonType[] buttons=new ButtonType[6];
        String[] buttonNames={"Outstanding","excellent","Good","Fair","Poor"};
        alert.getButtonTypes().setAll(); // Erases the default buttons

        for (int i=0; i<5; i++) {
            buttons[i] = new ButtonType(buttonNames[i]);
            alert.getButtonTypes().add(buttons[i]); // Adds this new button
        }
        // Add a cancel button
        alert.getButtonTypes().add(new ButtonType("Cancel",
                ButtonBar.ButtonData.CANCEL_CLOSE));
        Optional<ButtonType> result = alert.showAndWait();
        // Decide what to do according to the button selected
        if (result.get() == buttons[0])
        { System.out.println("That is so great to know!"); }
        else if (result.get() == buttons[1]) {System.out.println("You make us happy."); } else if (result.get() == buttons[2]) { System.out.println("We are glad you are pleased."); }
        else if (result.get() == buttons[3]) { System.out.println("Uh oh ... sounds like we need to improve."); }
        else if (result.get() == buttons[4]) { System.out.println("Oh no! Please explain why."); }





    }

    public static void main(String[] args) {
        launch();
    }
}