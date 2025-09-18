/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;



/**
 *
 * @author pedro
 */

 // Instância da Classe
public class Pokemon {

    private int numero;
    private String nome;
    private Tipo tipo1;
    private Tipo tipo2;
    private int vida;
    private float peso;
    private int altura; //altura em centimetros
    private boolean evolui;
    // Construtor da Classe
    public Pokemon() {
    }
    // Sobrecarga (OverLoad) do Construtor
    // Mesma função recebendo funções parametrizadas de forma diferente.
    public Pokemon(int numero, String nome,
            Tipo tipo1, Tipo tipo2, 
            int vida, float peso, 
            int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
        
    }

    // Sobrecarga do Construtor
    //
    public Pokemon(int numero, String nome,
            Tipo tipo1,
            int vida, float peso, 
            int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = null;
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;   
    }
    /**
     *  Getters
     *  Funções de Busca de atributos da Classe
     *  Obrigatório caso:
     *  - Utilize o atributo fora da Classe
     *  - Utilize o atributo PRIVADO (PRIVATE) 
     * @param nome
     */
    public String getNome(){
        return this.nome;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getFraquezas(){
        return this.tipo1.getFraquezas();
    }
    public String getResistencias(){
        return this.tipo1.getResistencias();
    }
    
    public Tipo getTipo(){
        return this.tipo1;
        
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
    
    public void setTipo(Tipo tipo1, Tipo tipo2){;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
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



