/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;
import database.database;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class main {

    public static void main(String[] args) {
        //Pokemon(Numero, Nome, Tipo1, Tipo2?, vida, peso, altura, evolui)
            //database bd = new database();
            //List<Pokemon> pokemons;
            //Pokemon achado = bd.buscaPokemon(25);
            //System.out.println(achado);
            
            Tipo fogo = new Tipo(1,"Fogo");
            Tipo agua = new Tipo(2,"Agua");
            Tipo planta = new Tipo(3, "Planta", 1, 2);
            Tipo eletrico = new Tipo(4, "Eletrico",3, 2);
           
            System.out.println(fogo.indice);
            
        }
}
