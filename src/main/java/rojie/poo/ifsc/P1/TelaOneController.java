package rojie.poo.ifsc.P1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaOneController implements Initializable {

	@FXML
	private ComboBox<String> cmbEnsino;

	@FXML
	private ComboBox<String> cmbEstagios;

	@FXML
	private ComboBox<String> cmbExtensao;

	@FXML
	private ComboBox<String> cmbOutros;

	@FXML
	private TableColumn<TabelaInicial, String> colCompCurri;

	@FXML
	private TableColumn<TabelaInicial, String> colLocal;

	@FXML
	private TableColumn<TabelaInicial, String> colHorario;

	@FXML
	private TableView<TabelaInicial> tabela;

	ObservableList<String> listEnsino = FXCollections.observableArrayList("Boletim", "Atestado");
	ObservableList<String> listEstagios = FXCollections.observableArrayList("Mural de Vagas", "Gerenciar Estágios");
	ObservableList<String> listExtensao = FXCollections.observableArrayList("Consultar Minhas Ações", "Certificados");
	ObservableList<String> listOutros = FXCollections.observableArrayList("Entrar em Contato", "Forum de Curso",
			"Página de Curso");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cmbEnsino.setItems(listEnsino);
		cmbEstagios.setItems(listEstagios);
		cmbExtensao.setItems(listExtensao);
		cmbOutros.setItems(listOutros);
		
		colCompCurri.setCellValueFactory(new PropertyValueFactory<>("comCurricular"));
		colLocal.setCellValueFactory(new PropertyValueFactory<>("Local"));
		colHorario.setCellValueFactory(new PropertyValueFactory<>("Horario"));

		tabela.setItems(listaAlunos());
	}

	private ObservableList<TabelaInicial> listaAlunos() {
		return FXCollections.observableArrayList(new TabelaInicial("Analise de Sistemas", "Sala 15", "56N12 *"),
				new TabelaInicial("Engenharia de Software", "Sala 12", "56N12 *"),
				new TabelaInicial("Programação Orientada a Objetos", "Sala 15", "56N12 *"),
				new TabelaInicial("Gerencia de Projetos", "Sala 15", "56N12 *"),
				new TabelaInicial("Metodologia de Pesquisa", "Sala 15", "56N12 *"),
				new TabelaInicial("TCC", "Sala 14", "56N12 *"));
	}
}