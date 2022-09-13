/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketscine;

import java.io.IOException;

import controlador.CarteleraCineControlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Grupo 2
 */
public class TicketsCine extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TicketsCine.class.getResource("/vista/Cartelera_Cine.fxml"));

            Pane ventana = (Pane) loader.load();

            Scene scene = new Scene(ventana);

            stage.setScene(scene);

            CarteleraCineControlador controller = loader.getController();

            controller.setStage(stage);

            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
