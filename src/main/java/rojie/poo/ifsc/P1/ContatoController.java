package rojie.poo.ifsc.P1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ContatoController implements Initializable {

	@FXML
	private ChoiceBox<String> choicebox1 = new ChoiceBox<>();
	@FXML
	private Label lblInfo;

	@FXML
	private ChoiceBox<String> choicebox2 = new ChoiceBox<>();

	@FXML
	private CheckBox chkAgradecimento;

	@FXML
	private CheckBox chkElogio;

	@FXML
	private CheckBox chkReclamacao;

	@FXML
	private CheckBox chkSugestao;

    @FXML
    private Button brnCadastrarMan;

    @FXML
    private Button btnCancelar;
    
    @FXML
    private Button btnVer;

    @FXML
    private TextArea txtArea;
	
	private ManifestacoesController enviatexto;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		choicebox1.getItems().add("Acadêmico");
		choicebox1.getItems().add("Administrativo");

		choicebox2.getItems().add("Infraestrutura");
		choicebox2.getItems().add("Cursos");
		choicebox2.getItems().add("Servidores");
		choicebox2.getItems().add("Limpeza");

	}
	public void CadManifestação()throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("manifestacoes.fxml"));
		Parent root = (Parent) fxmlLoader.load();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnVer.getScene().getWindow();
		stage.close();
	}
	public void Cancelar()throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("telaone.fxml"));
		Parent root = (Parent) fxmlLoader.load();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCancelar.getScene().getWindow();
		stage.close();
	}
public void enviar() {
		
		if(enviatexto == null) {
			enviatexto = new ManifestacoesController();
			enviatexto.recebendo(txtArea.getText());
		}
		else {
			enviatexto.recebendo(txtArea.getText());
		}
	}

}
