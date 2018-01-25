import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class folderchooser
        extends Application {
    public Parent root = null;
    public Scene scene = null;

    public folderchooser() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("App.fxml"));
        try {
            this.root = (Parent)fxmlLoader.load();
        }
        catch (IOException ex) {
            Logger.getLogger(folderchooser.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.scene = new Scene(this.root);
    }

    public static void main(String[] args) {
        folderchooser.launch((String[])args);
    }

    public void start(Stage stage) {
        stage.setTitle("ANME");
        stage.setScene(this.scene);
        stage.setOnCloseRequest(e -> {
                    System.exit(0);
                }
        );
        stage.show();
    }
}