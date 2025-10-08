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
        this.tipos = new ArrayList();
        // this.seeder();
        this.seederTipo();
    }
    
    public void seederTipo(){
    //criar o tipo de cada um
    //criar as fraquezas
    // Criar as resistencias 
        Tipo aco = new Tipo("Aco");
        Tipo agua = new Tipo("Agua");
        Tipo dragao = new Tipo("Dragao");
        Tipo eletrico = new Tipo("Eletrico");
        Tipo fada= new Tipo("Fada");
        Tipo fantasma= new Tipo("Fantasma");
        Tipo fogo= new Tipo("Fogo");
        Tipo gelo= new Tipo("Gelo");
        Tipo inseto= new Tipo("Inseto");
        Tipo lutador=new Tipo("Lutador");
        Tipo normal=new Tipo("Normal");
        Tipo pedra=new Tipo("Pedra");
        Tipo planta=new Tipo("Planta");
        Tipo psiquico=new Tipo("Psiquico");
        Tipo sombrio=new Tipo("Sombrio");
        Tipo terrestre=new Tipo("Terrestre");
        Tipo venenoso=new Tipo("Venenoso");
        Tipo voador=new Tipo("Voador");
        
        // Adrian - Fraquezas do Aço
        List fraquezas = new ArrayList<>(List.of(fogo,terrestre,lutador));
        aco.setFraquezas(fraquezas);

        // André Lucas Silva de Oliveira - Fraquezas da Água
        fraquezas = new ArrayList<>(List.of(planta, eletrico)); 
        agua.setFraquezas(fraquezas);

        // André Santos - Fraquezas do Dragão
        fraquezas = new ArrayList<>(List.of(dragao, fada, gelo)); 
        dragao.setFraquezas(fraquezas);

        // Bruno Garcia Souza - Fraquezas do Elétrico
        fraquezas = new ArrayList<>(List.of(agua,voador)); 
        eletrico.setFraquezas(fraquezas);

        // Bruno Monteiro ฅ⁠^⁠•⁠ﻌ⁠•⁠^ฅ - Fraquezas da Fada  
        fraquezas = new ArrayList<>(List.of(venenoso, aco));
        fada.setFraquezas(fraquezas);

        // Denis Sasdelli - Fraquezas do Fantasma
        fraquezas = new ArrayList<>(List.of(fantasma, sombrio));
        fantasma.setFraquezas(fraquezas);

        //Felipe - Fraquezas do Fogo
        fraquezas = new ArrayList<>(List.of(agua,pedra,terrestre)); 
        fogo.setFraquezas(fraquezas);

        //Boidedrift - Fraquezas do Gelo
        fraquezas = new ArrayList<>(List.of(aco, fogo, lutador, pedra)); 
        gelo.setFraquezas(fraquezas);

        // Berta - Fraquezas do Inseto
        fraquezas = new ArrayList<>(List.of(fogo,pedra, voador)); 
        inseto.setFraquezas(fraquezas);

        // Gabriel Pelizari - Fraquezas do Lutador
        fraquezas = new ArrayList<>(List.of(fada, psiquico, voador));
        lutador.setFraquezas(fraquezas);

        //Heitor - Resistências e Fraquezas do Normal
        List resistencias = new ArrayList<>(List.of(fantasma));
        normal.setResistencias(resistencias);
        fraquezas = new ArrayList<>(List.of(lutador));
        normal.setFraquezas(fraquezas);

        //Jhimy - Fraquezas da Pedra
        fraquezas = new ArrayList<>(List.of(agua,lutador,planta,terrestre,venenoso));
        pedra.setFraquezas(fraquezas);

        // João Felipe do Nascimento Lopes - Fraquezas da Planta
        fraquezas = new ArrayList<>(List.of(fogo, gelo, venenoso, voador, inseto)); 
        planta.setFraquezas(fraquezas);

        // João Victor Cuculo - Fraquezas do Psíquico
        fraquezas = new ArrayList<>(List.of(fantasma, inseto, sombrio));
        psiquico.setFraquezas(fraquezas);

        // João Vitor Ramalho
        fraquezas = new ArrayList<>(List.of(fantasma,sombrio));
        sombrio.setFraquezas(fraquezas);


        // Kauan Sousa - Fraquezas do Terrestre
        fraquezas = new ArrayList<>(List.of(agua,gelo,planta));
        terrestre.setFraquezas(fraquezas);

        // Kaue Lopes Cardoso - Fraquezas do Venenoso
        fraquezas = new ArrayList<>(List.of(psiquico, terrestre));  
        venenoso.setFraquezas(fraquezas);

        // Leonardo Ricardo Araujo - Fraquezas do Voador
        fraquezas = new ArrayList<>(List.of(eletrico, gelo, pedra)); 
        voador.setFraquezas(fraquezas);

        // Livia Maria - Resistências do Aço
        resistencias = new ArrayList<>(List.of(aco, inseto, planta, dragao, voador, gelo, pedra, psiquico, normal, fada)); 
        aco.setResistencias(resistencias);

        // Luiz Gustavo -  Resistências da Água
        resistencias = new ArrayList<>(List.of(aco,agua,fogo,gelo));
        agua.setResistencias(resistencias);

        // Matheus Pereira - Resistências do Dragão
        resistencias = new ArrayList<>(List.of(agua, eletrico, fogo, planta)); 
        dragao.setResistencias(resistencias);

        // Murilo Augusto - Resistências do Elétrico
        resistencias = new ArrayList<>(List.of(aco,eletrico,voador));
        eletrico.setResistencias(resistencias);

        // Orlando - Resistências da Fada 
        resistencias = new ArrayList<>(List.of(inseto, lutador, sombrio, dragao));
        fada.setResistencias(resistencias);

        // Renan
        resistencias = new ArrayList<>(List.of(inseto, venenoso, normal));
        fantasma.setResistencias(resistencias);

        // Ryan - 
        resistencias = new ArrayList<>(List.of(aco,fada,gelo,fogo,inseto,planta));
        fogo.setResistencias(resistencias);

        // Thiago Makoto
        resistencias = new ArrayList<>(List.of(gelo));
        gelo.setResistencias(resistencias);

        // Professor Pedro
        resistencias = new ArrayList<>(List.of(lutador,planta,terrestre));
        inseto.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(inseto, pedra, sombrio));
        lutador.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(fantasma));
        normal.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(fogo,normal, venenoso, voador));
        pedra.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(agua,eletrico,planta,terrestre));
        planta.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(lutador,psiquico));
        psiquico.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(fantasma,sombrio,psiquico));
        sombrio.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(pedra,venenoso));
        terrestre.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(fada,inseto,lutador,planta,venenoso));
        lutador.setResistencias(resistencias);

        resistencias = new ArrayList<>(List.of(inseto, lutador,planta,terrestre));
        voador.setResistencias(resistencias);

    
    }
    
    public void seeder(){

    pokemons.add(new Pokemon(546, "Cottonee", 50,0.6f, 30, true)); //Adrian Kauan Aquino de Melo
    pokemons.add(new Pokemon(572, "Minccino", 50,5,4,true));//Ana Louise Lima Silva
    pokemons.add(new Pokemon(103, "Exeggutor", 140, 120, 200, true));//Ana Paula de O. de Freitas
    pokemons.add(new Pokemon(696, "Clauncher", 60, 8, 50, true));//André Lucas Silva de Oliveira
    pokemons.add(new Pokemon(109, "koffing",, 40, 1, 6, true));//Bruno Garcia Souza
    pokemons.add(new Pokemon(194, "Wooper", 55, 8.5f, 40, true));//Bruno Monteiro
    pokemons.add(new Pokemon(215, "Sneseal", 60, 28,90,true));//Felipe Jazon Lima
    pokemons.add(new Pokemon(50,  "Diglett", 40, 0.8f, 20, true));//Gabriel Costa
    pokemons.add(new Pokemon(86,  "Seel", 80, 90, 110, true));//Gabriel Pelizari
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
