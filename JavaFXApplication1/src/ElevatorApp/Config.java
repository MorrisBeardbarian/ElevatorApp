/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorApp;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

/**
 *
 * @author marius
 */
public class Config{
    static protected double swidth = Screen.getPrimary().getVisualBounds().getWidth();
    static protected double sheight = Screen.getPrimary().getVisualBounds().getHeight();
    static private StackPane parinte = new StackPane();
    
    Config(){
        //super(parinte, swidth, sheight);
        
        //Back Button
        Button back_btn = new Button("BACK");
        //Event pe click
        back_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ElevatorApp.change_scene("1");
            }
        });
        //Setam clasa butonului pentru CSS
        back_btn.getStyleClass().add("menu_button");
        

        //TO DO - add elevator configuration menu
        
        
        //Center left menu (clm)
        GridPane clm = new GridPane(); // == tabel
        clm.add(back_btn, 0, 2); //coloana 0, randul 2
        parinte.getChildren().add(clm);
        
        //CSS StyleSheet
        File f = new File("src/javafxapplication1/meniu_style.css");
        parinte.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));        
        //CSS StyleSheet
        f = new File("src/javafxapplication1/config_style.css");
        parinte.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
    }
    
    static StackPane get_parent(){
        return parinte;
    }
}
