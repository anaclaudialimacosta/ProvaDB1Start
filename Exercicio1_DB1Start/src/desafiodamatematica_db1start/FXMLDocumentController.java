/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiodamatematica_db1start;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author alima
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label respostaEPar;

    @FXML
    private TextField textFieldNumero;

    @FXML
    private Label respostaEPrimo;

    @FXML
    private Label respostaEMaiorQueDez;

    @FXML
    private Label respostaEImpar;

    @FXML
    private Label respostaDobro;

    @FXML
    private Button buttonConfirmar;

    @FXML
    private Label label;
    
    @FXML
    private Label respostaNumeroDigitado;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Você confirmou!!");
        Numero num = new Numero(Integer.parseInt(textFieldNumero.getText()));
        criarLabelsComRespostasAoUsuario(num);
        textFieldNumero.clear();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    private void criarLabelsComRespostasAoUsuario(Numero num){
        
        //Setando o Label do Valor Digitado
        respostaNumeroDigitado.setText("O número digitado é: " +num.getValor());
        
        //Setando o Label do Par
        if(num.isPar()){
            respostaEPar.setText("O número é par");   
        } else {
            respostaEPar.setText("O número não é par");
        }
        
        //Setando o Label do Impar
        if(num.isImpar()){
            respostaEImpar.setText("O número é ímpar");   
        } else {
            respostaEImpar.setText("O número não é ímpar");
        }
        
        //Setando a Label do Primo
        if(num.isPrimo()){
            respostaEPrimo.setText("O número é primo");   
        } else {
            respostaEPrimo.setText("O número não é primo");
        }
        
        //Setando o Label do MaiorQue        
        if(num.isMaiorque10()){
            respostaEMaiorQueDez.setText("O número é maior que 10");   
        } else {
            respostaEMaiorQueDez.setText("O número não é maior que 10");
        }
        //Setando a label do dobro do valor
        respostaDobro.setText("O dobro do número digitado é: " +num.dobro());
    }
    
}
