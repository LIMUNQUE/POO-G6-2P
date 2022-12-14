package com.espol.poo.g6.p;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static String pathImg="src/main/resources/imagenesMundial/";
    public static String pathPaises="src/main/resources/Paises/";
    public static String pathUI="src/main/resources/UI/";
    public static String pathJugadores="src/main/resources/Jugadores/";

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Principal"), 640, 480);
        stage.setScene(scene);
        scene.getStylesheets().add(App.class.getResource("App.css").toExternalForm());
        stage.setTitle("Consulta de datos históricos");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}