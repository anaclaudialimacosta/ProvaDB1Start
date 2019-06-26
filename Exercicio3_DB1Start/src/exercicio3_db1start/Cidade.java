/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_db1start;

/**
 *
 * @author alima
 */
public enum Cidade {
    
    //Enumeração responsável por armazenar todas as cidades disponíveis no sistema
    
    curitiba(true, "Paraná", "Curitiba"),
    maringa(false,"Paraná", "Maringá"),
    londrina (false,"Paraná", "Londrina"),
    pinhais (false,"Paraná", "Pinhais"),
    chapeco(false, "Santa Catarina", "Chapecó"),
    joinville (false, "Santa Catarina", "Joinville"),
    blumenal (false, "Santa Catarina", "Blumenal"),
    florianopolis (true, "Santa Catarina", "Florianópolis"),
    portoAlegre (true, "Rio Grande do Sul", "Porto Alegre"),
    gramado(false, "Rio Grande do Sul", "Gramado");

    @Override
    public String toString() {
        return this.nome;
    }

    public boolean capital;
    public String estado;
    public String nome;
    
    
    private Cidade(boolean capital, String estado, String nome) {
        
        this.capital = capital;
        this.estado = estado;
        this.nome=nome;
    }
    
        
    
}
