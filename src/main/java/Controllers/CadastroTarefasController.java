package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.InterfaceTherad;
import rojie.poo.ifsc.P1.App;

public class CadastroTarefasController implements Initializable {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtTurma;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtDescricao;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	void Envio(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Aguarde.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		AguardeController controller = (AguardeController) fxmlLoader.getController();
		controller.setProxTela("mainProfessor");
		controller.conectar("novatarefa@"+txtTitulo.getText().toString() + "-" + txtTurma.getText().toString() + "-" + txtDescricao.getText().toString());
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnEnviar.getScene().getWindow();
		stage.close();

	}
	
	@FXML
	void Voltar(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("mainProfessor.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnVoltar.getScene().getWindow();
		stage.close();

	}

}
