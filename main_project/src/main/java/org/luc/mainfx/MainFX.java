package org.luc.mainfx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.luc.assets.LoadResources;
import org.luc.controls.ButtonFX;

public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(LoadResources.load("some.css"));
        new ButtonFX();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
