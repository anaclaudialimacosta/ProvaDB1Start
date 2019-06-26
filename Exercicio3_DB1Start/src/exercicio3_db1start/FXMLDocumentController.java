/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_db1start;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author alima
 */
public class FXMLDocumentController implements Initializable {
    
     private Cidade[] cidades = Cidade.values();
    
    @FXML
    private Button button;

    @FXML
    private Label labelECapital;

    @FXML
    private Label labelEstado;

    @FXML
    private Label labelCidadeSelecionada;

    @FXML
    private Label label;

    @FXML
    private ComboBox<Cidade> comboBoxCidades;
    
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        //Esse método coordena a ação do botão Pesquisar
        
         Cidade c = this.comboBoxCidades.getValue();
         criarRespostaAoUsuario(c);
         
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Método de inicialização dos itens necessários na tela
        
        carregarCidades();
    }
    
    public void carregarCidades(){
        
        ObservableList<Cidade> observ = FXCollections.observableArrayList(cidades);
        this.comboBoxCidades.setItems(observ);
    }
    public void criarRespostaAoUsuario(Cidade c){
        
        //Esse método formata as respostas ao usu[ario 
        
        labelCidadeSelecionada.setText("Cidade selecionada:  " + c.nome);
        
        if(c.capital){
            labelECapital.setText("A cidade selecionada é uma capital");
        } else {
            labelECapital.setText("A cidade selecionada não é uma capital");
        }
        
        labelEstado.setText("Pertence ao estado " + c.estado);
        
        
    }
}
