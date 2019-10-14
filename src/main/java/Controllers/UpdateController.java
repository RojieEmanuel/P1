package Controllers;

import database.AlunoDAO;
import database.ProfessorDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Aluno;
import model.Professor;

public class UpdateController {
	  @FXML
	    private ComboBox<?> cmbUserRegister;

	    @FXML
	    private TextField txtCpf;

	    @FXML
	    private TextField txtNome;

	    @FXML
	    private TextField txtCurso;

	    @FXML
	    private TextField txtNewLogin;

	    @FXML
	    private TextField txtNewSenha;

	    @FXML
	    private Button btnAtualizar;

	    @FXML
	    private Button btnCancelarr;
	    
	    private ListaController listController;

	    @FXML
		private void update(ActionEvent e) {
			Aluno aluno = new Aluno(txtCpf.getText(), txtNome.getText(), txtCurso.getText(),
					txtNewLogin.getText(), txtNewSenha.getText());
			new AlunoDAO().update(aluno);
			
			Professor professor = new Professor(txtCpf.getText(), txtNome.getText(), txtCurso.getText(),
					txtNewLogin.getText(), txtNewSenha.getText());
			new ProfessorDAO().update(professor);
			
			Button btn = (Button) e.getSource();
			Scene scene = btn.getScene();
			Stage stage = (Stage) scene.getWindow();
			listController.updateList();
			stage.close();
		}

		public void selectedAluno(Aluno aluno, ListaController listController) {
			txtCpf.setText(aluno.getCpf());
			txtNome.setText(aluno.getCpf());
			txtCurso.setText(aluno.getCurso());
			txtNewLogin.setText(aluno.getLogin());
			txtNewSenha.setText(aluno.getSenha());
			this.listController = listController;
		}
		public void Cancelar() {
			
		}

		public void selectedProfessor(Professor professor, ListaController listaController) {
			txtCpf.setText(professor.getCpf());
			txtNome.setText(professor.getCpf());
			txtCurso.setText(professor.getCurso());
			txtNewLogin.setText(professor.getLogin());
			txtNewSenha.setText(professor.getSenha());
			this.listController = listController;
			
		}

		
}
