/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import classes.Pokemon;
import classes.Tipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class database {
    //Model Pokemon
    private List<Pokemon> pokemons;
    private List<Tipo> tipos;
    
    
    public database(){
        this.pokemons = new ArrayList();
        // this.seeder();
    }
    
    public void seeder(){

    pokemons.add(new Pokemon(546, "Cottonee", "Planta", "Fada", 50,0.6f, 30, true)); //Adrian Kauan Aquino de Melo
    pokemons.add(new Pokemon(572, "Minccino","Normal", 50,5,4,true));//Ana Louise Lima Silva
    pokemons.add(new Pokemon(103, "Exeggutor", "Planta", 140, 120, 200, true));//Ana Paula de O. de Freitas
    pokemons.add(new Pokemon(696, "Clauncher", "Aquático", 60, 8, 50, true));//André Lucas Silva de Oliveira
    pokemons.add(new Pokemon(109, "koffing","poison",null, 40, 1, 6, true));//Bruno Garcia Souza
    pokemons.add(new Pokemon(194, "Wooper", "Água", "Ground", 55, 8.5f, 40, true));//Bruno Monteiro
    pokemons.add(new Pokemon(215, "Sneseal","Dark", 60, 28,90,true));//Felipe Jazon Lima
    pokemons.add(new Pokemon(50,  "Diglett", "Terra", 40, 0.8f, 20, true));//Gabriel Costa
    pokemons.add(new Pokemon(86,  "Seel", "Agua", 80, 90, 110, true));//Gabriel Pelizari
    pokemons.add(new Pokemon(412, "Burmy", "Bug", 40, 3.4f, 20, true));//Guilherme Yuiti Rufino Okamoto
    pokemons.add(new Pokemon(155, "Cyndaquil", "Fogo", 60, 7.9f, 50, true)); //Heitor Felipe
    pokemons.add(new Pokemon(193, "Yanma","Bug","Flying",70,38.0f,120,true));//Jhimy Kenedy S. Ferrari
    pokemons.add(new Pokemon(599, "Klink", "Aço", 60,  0.3f, 21,true));//João Felipe do Nascimento Lopes
    pokemons.add(new Pokemon(39,  "Jigglypuff", "Normal", "Fada", 70, 5.5f, 50, true));//João Victor Codato Cuculo
    pokemons.add(new Pokemon(515, "Panpour", "Agua", 60, 13, 60, false));//Lívia Maria dos Santos
    pokemons.add(new Pokemon(636, "Larvesta", "inseto", "fogo", 70, 28.8f, 110, true));//Luiz Gustavo Cardoso
    pokemons.add(new Pokemon(77,  "Ponyta", "Fogo", 60, 30, 1, true));//Maria Eduarda Buchweitz Trovilho
    pokemons.add(new Pokemon(391, "Monferno ","Fogo", "Lutador", 64, 22.0f, 90, true));//Matheus Pereira Garcia
    pokemons.add(new Pokemon(21,  "Spearow", "Voador", 60, 2, 30,true));//Murilo Augusto
    pokemons.add(new Pokemon(53,  "Persian", "Normal", 90, 32, 100, false));//Orlando Cabrera
    pokemons.add(new Pokemon(179, "Mareep", "Eletrico", 60, 7.8f, 60, true));//Renan Pacheco Cavalcanti
    pokemons.add(new Pokemon(712, "Bergmite","Gelo",null, 70, 99.5f, 1,true));//Ryan Rigoto
    pokemons.add(new Pokemon(226, "Mantine","Água","Voador",85, 220f, 2,false));//WILLIAN WITTIENZO

    }
    
    public Pokemon buscaPokemon(int id){
        
        for(Pokemon p: pokemons){
            if(p.getNumero() == id){
                return p;
            }
        }
        return null;
    }
}
