package controlador;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import DAO.PeliculasDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Pelicula;

public class CarteleraCineControlador implements Initializable {

    private Stage stage;

    @FXML
    private ChoiceBox<String> lstPelDisp;

    @FXML
    private Label lblTitulo;
    @FXML
    private Label lblFechaEst;
    @FXML
    private Label lblDuracion;
    @FXML
    private ImageView imgPel;

    // @FXML
    // public void seleccionarPelicula1(ActionEvent event) throws IOException {
    // FXMLLoader loader = new
    // FXMLLoader(getClass().getResource("/vista/CarteleraSegundaVentana.fxml"));
    // Parent root = loader.load();
    // Cartelera2Controlador controlador = loader.getController();
    // Scene scene = new Scene(root);
    // Stage stage = new Stage();
    // stage.setScene(scene);
    // // controlador.init(btnselect1.getText(), stage, imgpeli1.getImage(), this);
    // stage.show();
    // this.stage.close();
    // }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PeliculasDAO peliculasDAO = new PeliculasDAO();
        List<Pelicula> peliculas = peliculasDAO.GetAll();
        ObservableList<String> titulos = FXCollections.observableArrayList();
        peliculas.forEach(x -> titulos.add(x.getNombre()));

        lstPelDisp.getItems().setAll(titulos);

        lstPelDisp.setOnAction((event) -> {
            int selectedIndex = lstPelDisp.getSelectionModel().getSelectedIndex();
            Pelicula pelicula = peliculas.get(selectedIndex);
            lblDuracion.setText(pelicula.getDuracionMinutos().toString() + " minutos");
            lblFechaEst.setText(pelicula.getEstreno().toString());
            lblTitulo.setText(lstPelDisp.getValue());

            // Object selectedItem = lstPelDisp.getSelectionModel().getSelectedItem();

            // System.out.println("Selection made: [" + selectedIndex + "] " +
            // selectedItem);
            // System.out.println(" lstPelDisp.getValue(): " + lstPelDisp.getValue());

            // setear imagen
            try (FileInputStream input = new FileInputStream("src/Imagenes/" + pelicula.getRutaImagen())) {
                Image image = new Image(input);
                imgPel.setImage(image);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        lstPelDisp.getSelectionModel().selectFirst();
    }

}
