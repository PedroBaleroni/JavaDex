/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pedro
 */
public class Tipo {
    private int indice;
    private String nome;
    private int fraqueza;
    private int resistencia;
    
    public Tipo(int indice, String nome){
        this.indice = indice;
        this.nome = nome;
    }
    
    public Tipo (int indice, String nome, int fraqueza, int resistencia){
        this.indice =indice;
        this.nome = nome;
        this.fraqueza = fraqueza;
        this.resistencia = resistencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    
    
    
}
