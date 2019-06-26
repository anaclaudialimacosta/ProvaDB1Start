/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiodamatematica_db1start;

/**
 *
 * @author alima
 */
public final class Numero {
    
    private final int valor;
    private boolean par, impar, primo, maiorque10;
    
    //Método Construtor
    public Numero(int valor) {
        this.valor = valor;
        this.ePar();
        this.ePrimo();
        this.eMaiorQueDez();
    }

    //Métodos Getters
    public boolean isPar() {
        return par;
    }

    public boolean isImpar() {
        return impar;
    }

    public boolean isPrimo() {
        return primo;
    }

    public boolean isMaiorque10() {
        return maiorque10;
    }
    
    public int getValor() {
        return valor;
    }
    
    //Métodos 
    
    public void eMaiorQueDez(){
      //Este método determina se o número é maior que 10
      boolean resposta;
      resposta = (this.valor>10); 
      this.maiorque10 = resposta;
    }
    public void ePar(){
      //Este método determina se o número é par ou ímpar
      boolean resposta;
      resposta = (this.valor%2==0); 
      this.par = resposta;
      this.impar = !resposta; 
    }
    
    public int dobro(){
      //Este método retorna o dobro do valor digitado
      
      int resposta;
      resposta = this.valor*2; 
      return resposta;
    }
    
    public void ePrimo(){
     //Esta função retorna se um número é primo
     
      boolean resposta = true;
      
      for(int i=2; i<this.valor;i++){
          if(this.valor%i==0){
              resposta=false;
          }
      }
      
      if(this.valor==1){
          resposta = false;
      }
      
      if(this.valor==2){
          resposta = true;
      }
      
      this.primo = resposta;
    }


}
