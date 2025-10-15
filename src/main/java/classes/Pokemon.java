/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.List;
import java.util.ArrayList;
import database.database;



/**
 *
 * @author pedro
 */

 // Instância da Classe
public class Pokemon {

    private int numero;
    private String nome;
    private List<Tipo> tipos;
    private Pokemon evoluiPara; // Objeto Pokemon, próximo na linha evolutiva
    // evoluiPara pode ser Null;
    private int evoluiEm; // É o nível que o Pokemon passa para a próxima evolução
    // Construtor da Classe
    private boolean lendario; // Para especies raras de Pokemon.
    
    //Construtor
    public Pokemon() {
    }
    // Sobrecarga (OverLoad) do Construtor
    // Mesma função recebendo funções parametrizadas de forma diferente.
    public Pokemon(int numero, String nome,
            List<Tipo> tipos, Pokemon evoluiPara, int evoluiEm, boolean lendario){
        
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
        if(evoluiPara != null){
            this.evoluiPara = new Pokemon();
            this.evoluiPara = evoluiPara;
            this.evoluiEm = evoluiEm;
        }
        this.lendario = lendario;
    }
    //Sobrecarga do construtor
        public Pokemon(int numero, String nome,
            List<Tipo> tipos, boolean lendario){
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
        this.lendario = lendario;
    }
        
    public String getNome(){
        return this.nome;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getTipoFraquezas(){
        String aux = "";
        for(Tipo t: tipos){
            aux += t.getFraquezas();
        }
        return aux;
    }
    public String getTipoResistencias(){
        String tipos = "";
        for(Tipo t: this.tipos){
            tipos += t.getResistencias();
        }
        return tipos;
    }
    
    public List<Tipo> getTipos(){
        return this.tipos;
        
    }
    
    public Pokemon getEvoluiPara(){
        return this.evoluiPara;
    }
    
    public int getEvoluiEm(){
        return this.evoluiEm;
    }
    
    public boolean isLendario(){
        return this.lendario;
    }
    /**
     * Setters
     * Funções de atribuição de valores de valores de atributos da classe
     * Utilizado quando o atributo é privado
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTipos(List<Tipo> tipos){
        
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
     
    }
    
    public void setEvoluiPara(Pokemon pokemon){
        this.evoluiPara = new Pokemon();
        this.evoluiPara = pokemon;
    }
    
    public void setEvoluiEm (int nivel){
        this.evoluiEm = nivel;
    }
    
    public void setLendario(boolean ehLendario){
        this.lendario = ehLendario;
    }
    
    /* Função toString()
     * Função padrão das classes
     * - Utilizado para transforma a classe em uma constante String
     * - Para imprimir em funções "System.out.println()" por exemplo
     * 
     *  ## Como Padrão entrega um enderçamento para a Classe ##
     */
    // Sobrescrita da Função toString()
    /*
     * Modificamos em uma SubClasse a Função, para funcionar de uma forma distinta ao padrão
     * indicada pelo "@Override"
     * 
     * No caso abaixo mudamos o toString para uma saída coerente ao nosso uso, trazendo uma string
     * com o atributo _nome_ da Classe 
     */
    @Override
    public String toString(){
        return this.nome;
    }

    
}



