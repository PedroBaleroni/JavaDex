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
public class Tipo {
    private int indice;
    private String nome;
    private List<Tipo> fraquezas;
    private List<Tipo> resistencias;
    
    public Tipo(int indice, String nome){
        this.indice = indice;
        this.nome = nome;
    }
    
    public Tipo (int indice, String nome, Tipo fraqueza, Tipo resistencia){
        this.indice =indice;
        this.nome = nome;
        this.fraquezas = new ArrayList();
        this.fraquezas.add(fraqueza);
        this.resistencias = new ArrayList();
        this.resistencias.add(resistencia);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setFraquezas(List<Tipo> fraquezas){
        this.fraquezas = new ArrayList();
        for(Tipo t: fraquezas){
        this.fraquezas.add(t);
        }
    }
    
    public void addFraquezas(List<Tipo> fraquezas){
        for(Tipo t: fraquezas){
            this.fraquezas.add(t);
        }
    }
    
    public String getFraquezas(){
        String fraquezas = "";
        for (Tipo arnaldo: this.fraquezas){
            fraquezas += arnaldo.getNome() + " ";
        }
        return fraquezas;
    }
    
    public void setResistencias(List<Tipo> resistencias){
        this.resistencias = new ArrayList();
        for(Tipo t: resistencias){
        this.resistencias.add(t);
        }
    }
    
    public void addResistencias(List<Tipo> resistencias){
        for(Tipo t: resistencias){
            this.resistencias.add(t);
        }
    }
    
    public String getResistencias(){
        String resistencias = "";
        for (Tipo t: this.resistencias){
            resistencias += t.getNome() + " ";
        }
        return resistencias;
    }
    
    
    
    
}
