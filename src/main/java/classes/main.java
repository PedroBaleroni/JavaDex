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
            Tipo planta = new Tipo(3, "Planta", fogo, agua);
            Tipo eletrico = new Tipo(4, "Eletrico",planta, agua);
            
            List fraquezas = new ArrayList<>(List.of(agua,eletrico));
            fogo.setFraquezas(fraquezas);
             
            List<Tipo> tipo_do_pokemon = new ArrayList<>(List.of(eletrico));
            Pokemon pikachu = new Pokemon(25, "Pikachu",tipo_do_pokemon, 35, 6.0f, 40,true);//Pedro Baleroni

            System.out.println(pikachu.getTipoFraquezas());
            
        }
}
