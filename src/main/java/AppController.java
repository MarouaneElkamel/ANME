
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class AppController
        implements Initializable
{
    String path = "";
    @FXML
    private StackPane drop;
    @FXML
    private Button folderChooser;
    @FXML
    private Button generate;
    @FXML
    private Text dataStart;
    @FXML
    private Text dataEnds;
    @FXML
    private Text datacount;

    @FXML
    void folderClicked(ActionEvent event)
    {
        Stage s = new Stage();
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("CSV FOLDER CHOOSER");
        File selectedDirectory = chooser.showDialog(s);
        if (selectedDirectory.exists()) {
            InfoCollector.getInstance().loadFolde(selectedDirectory.getPath());
        }
        this.path = (selectedDirectory.getPath() + File.separator);
        System.out.println(this.path);
        this.datacount.setText(InfoCollector.getInstance().getDataloaded() + " DATA LOADED");
        this.datacount.setFill(Color.GREEN);
        this.dataStart.setText(InfoCollector.getInstance().getFirst().toString());
        this.dataStart.setFill(Color.GREEN);
        this.dataEnds.setText(InfoCollector.getInstance().getLast().toString());
        this.dataEnds.setFill(Color.GREEN);
    }

    @FXML
    void generateclicked(ActionEvent event)
    {
        if (InfoCollector.getInstance().getDataloaded() > 0) {
            FilesCreator localFilesCreator = new FilesCreator(this.path);
        }
    }

    public void initialize(URL url, ResourceBundle rb) {}
}
