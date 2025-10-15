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
            database bd = new database();
            bd.inicialize();
            Pokemon pikachu = bd.buscaPokemon("Diglett");
            
          
            System.out.println(pikachu.getEvoluiPara().getNome());
            
        }
}
