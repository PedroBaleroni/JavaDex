/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.List; //Interface
import java.util.ArrayList; // Funcional

/**
 *
 * @author pedro
 */

  // Instância da Classe
public class Tipo {
    private String nome;
    private List<Tipo> fraquezas;
    private List<Tipo> resistencias;

   // Construtor da Classe
    public Tipo(String nome){
        this.nome = nome;
    }

    // Sobrecarga (OverLoad) do Construtor
    // Mesma função recebendo funções parametrizadas de forma diferente.  
    public Tipo (String nome, Tipo fraqueza, Tipo resistencia){
        this.nome = nome;
        this.fraquezas = new ArrayList();
        this.fraquezas.add(fraqueza);
        this.resistencias = new ArrayList();
        this.resistencias.add(resistencia);
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
    
    public String getFraquezas(){
        String fraquezas = "";
        for (Tipo arnaldo: this.fraquezas){
            fraquezas += arnaldo.getNome() + " ";
        }
        return fraquezas;
    }
    public void addFraquezas(List<Tipo> fraquezas){
        for(Tipo t: fraquezas){
            this.fraquezas.add(t);
        }
    }
    
    public String getResistencias(){
        String resistencias = "";
        for (Tipo t: this.resistencias){
            resistencias += t.getNome() + " ";
        }
        return resistencias;
    }
    
    public void addResistencias(List<Tipo> resistencias){
        for(Tipo t: resistencias){
            this.resistencias.add(t);
        }
    }
    /**
     * Setters
     * Funções de atribuição de valores de valores de atributos da classe
     * Utilizado quando o atributo é privado
     * @param nome
     */
    
    public void setFraquezas(List<Tipo> fraquezas){
        this.fraquezas = new ArrayList();
        for(Tipo t: fraquezas){
        this.fraquezas.add(t);
        }
    }
    
    
    public void setResistencias(List<Tipo> resistencias){
        this.resistencias = new ArrayList();
        for(Tipo t: resistencias){
        this.resistencias.add(t);
        }
    }
    
}