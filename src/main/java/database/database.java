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
        
    }
    
    public void inicialize(){
        this.seederTipo();
        this.seederPokemon();
    }
    
    public void seederTipo(){
    //criar o tipo de cada um
    //criar as fraquezas
    // Criar as resistencias 
        Tipo aco = new Tipo("Aco");
        tipos.add(aco);
        Tipo agua = new Tipo("Agua");
        tipos.add(agua);
        Tipo dragao = new Tipo("Dragao");
        tipos.add(dragao);
        Tipo eletrico = new Tipo("Eletrico");
        tipos.add(eletrico);
        Tipo fada= new Tipo("Fada");
        tipos.add(fada);
        Tipo fantasma= new Tipo("Fantasma");
        tipos.add(fantasma);
        Tipo fogo= new Tipo("Fogo");
        tipos.add(fogo);
        Tipo gelo= new Tipo("Gelo");
        tipos.add(gelo);
        Tipo inseto= new Tipo("Inseto");
        tipos.add(inseto);
        Tipo lutador=new Tipo("Lutador");
        tipos.add(lutador);
        Tipo normal=new Tipo("Normal");
        tipos.add(normal);
        Tipo pedra=new Tipo("Pedra");
        tipos.add(pedra);
        Tipo planta=new Tipo("Planta");
        tipos.add(planta);
        Tipo psiquico=new Tipo("Psiquico");
        tipos.add(psiquico);
        Tipo sombrio=new Tipo("Sombrio");
        tipos.add(sombrio);
        Tipo terrestre=new Tipo("Terrestre");
        tipos.add(terrestre);
        Tipo venenoso=new Tipo("Venenoso");
        tipos.add(venenoso);
        Tipo voador=new Tipo("Voador");
        tipos.add(voador);
        
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
    
    public void seederPokemon(){
        Tipo aco = buscaTipo("Aco");
        Tipo agua = buscaTipo("Agua");
        Tipo dragao = buscaTipo("Dragao");
        Tipo eletrico = buscaTipo("Eletrico");
        Tipo fada = buscaTipo("Fada");
        Tipo fantasma = buscaTipo("Fantasma");
        Tipo fogo = buscaTipo("Fogo");
        Tipo gelo = buscaTipo("Gelo");
        Tipo inseto = buscaTipo("Inseto");
        Tipo lutador = buscaTipo("Lutador");
        Tipo normal = buscaTipo("Normal");
        Tipo pedra = buscaTipo("Pedra");
        Tipo planta = buscaTipo("Planta");
        Tipo psiquico = buscaTipo("Psiquico");
        Tipo sombrio = buscaTipo("Sombrio");
        Tipo terrestre = buscaTipo("Terrestre");
        Tipo venenoso = buscaTipo("Venenoso");
        Tipo voador = buscaTipo("Voador");
        // Linha Bulbasaur
        pokemons.add(new Pokemon(3, "Venusaur", new ArrayList<>(List.of(planta, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(2, "Ivysaur", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Venusaur"), 32, false));
        pokemons.add(new Pokemon(1, "Bulbasaur", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Ivysaur"), 16, false));

        // Linha Charmander
        pokemons.add(new Pokemon(6, "Charizard", new ArrayList<>(List.of(fogo, voador)), null, 0, false));
        pokemons.add(new Pokemon(5, "Charmeleon", new ArrayList<>(List.of(fogo)), buscaPokemon("Charizard"), 36, false));
        pokemons.add(new Pokemon(4, "Charmander", new ArrayList<>(List.of(fogo)), buscaPokemon("Charmeleon"), 16, false));

        // Linha Squirtle
        pokemons.add(new Pokemon(9, "Blastoise", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(8, "Wartortle", new ArrayList<>(List.of(agua)), buscaPokemon("Blastoise"), 36, false));
        pokemons.add(new Pokemon(7, "Squirtle", new ArrayList<>(List.of(agua)), buscaPokemon("Wartortle"), 16, false));

        // Linha Caterpie
        pokemons.add(new Pokemon(12, "Butterfree", new ArrayList<>(List.of(inseto, voador)), null, 0, false));
        pokemons.add(new Pokemon(11, "Metapod", new ArrayList<>(List.of(inseto)), buscaPokemon("Butterfree"), 10, false));
        pokemons.add(new Pokemon(10, "Caterpie", new ArrayList<>(List.of(inseto)), buscaPokemon("Metapod"), 7, false));

        // Linha Weedle
        pokemons.add(new Pokemon(15, "Beedrill", new ArrayList<>(List.of(inseto, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(14, "Kakuna", new ArrayList<>(List.of(inseto, venenoso)), buscaPokemon("Beedrill"), 10, false));
        pokemons.add(new Pokemon(13, "Weedle", new ArrayList<>(List.of(inseto, venenoso)), buscaPokemon("Kakuna"), 7, false));

        // Linha Pidgey
        pokemons.add(new Pokemon(18, "Pidgeot", new ArrayList<>(List.of(normal, voador)), null, 0, false));
        pokemons.add(new Pokemon(17, "Pidgeotto", new ArrayList<>(List.of(normal, voador)), buscaPokemon("Pidgeot"), 36, false));
        pokemons.add(new Pokemon(16, "Pidgey", new ArrayList<>(List.of(normal, voador)), buscaPokemon("Pidgeotto"), 18, false));

        // Linha Rattata
        pokemons.add(new Pokemon(20, "Raticate", new ArrayList<>(List.of(normal)), null, 0, false));
        pokemons.add(new Pokemon(19, "Rattata", new ArrayList<>(List.of(normal)), buscaPokemon("Raticate"), 20, false));

        // Linha Spearow
        pokemons.add(new Pokemon(22, "Fearow", new ArrayList<>(List.of(normal, voador)), null, 0, false));
        pokemons.add(new Pokemon(21, "Spearow", new ArrayList<>(List.of(normal, voador)), buscaPokemon("Fearow"), 20, false));

        // Linha Ekans
        pokemons.add(new Pokemon(24, "Arbok", new ArrayList<>(List.of(venenoso)), null, 0, false));
        pokemons.add(new Pokemon(23, "Ekans", new ArrayList<>(List.of(venenoso)), buscaPokemon("Arbok"), 22, false));

        // Linha Pikachu
        pokemons.add(new Pokemon(26, "Raichu", new ArrayList<>(List.of(eletrico)), null, 0, false));
        pokemons.add(new Pokemon(25, "Pikachu", new ArrayList<>(List.of(eletrico)), buscaPokemon("Raichu"), 0, false)); // Evolui com Thunder Stone

        // Linha Sandshrew
        pokemons.add(new Pokemon(28, "Sandslash", new ArrayList<>(List.of(terrestre)), null, 0, false));
        pokemons.add(new Pokemon(27, "Sandshrew", new ArrayList<>(List.of(terrestre)), buscaPokemon("Sandslash"), 22, false));

        // Linha Nidoran♀
        pokemons.add(new Pokemon(31, "Nidoqueen", new ArrayList<>(List.of(venenoso, terrestre)), null, 0, false));
        pokemons.add(new Pokemon(30, "Nidorina", new ArrayList<>(List.of(venenoso)), buscaPokemon("Nidoqueen"), 0, false)); // Evolui com Moon Stone
        pokemons.add(new Pokemon(29, "Nidoran♀", new ArrayList<>(List.of(venenoso)), buscaPokemon("Nidorina"), 16, false));

        // Linha Nidoran♂
        pokemons.add(new Pokemon(34, "Nidoking", new ArrayList<>(List.of(venenoso, terrestre)), null, 0, false));
        pokemons.add(new Pokemon(33, "Nidorino", new ArrayList<>(List.of(venenoso)), buscaPokemon("Nidoking"), 0, false)); // Evolui com Moon Stone
        pokemons.add(new Pokemon(32, "Nidoran♂", new ArrayList<>(List.of(venenoso)), buscaPokemon("Nidorino"), 16, false));

        // Linha Clefairy
        pokemons.add(new Pokemon(36, "Clefable", new ArrayList<>(List.of(fada)), null, 0, false));
        pokemons.add(new Pokemon(35, "Clefairy", new ArrayList<>(List.of(fada)), buscaPokemon("Clefable"), 0, false)); // Evolui com Moon Stone

        // Linha Vulpix
        pokemons.add(new Pokemon(38, "Ninetales", new ArrayList<>(List.of(fogo)), null, 0, false));
        pokemons.add(new Pokemon(37, "Vulpix", new ArrayList<>(List.of(fogo)), buscaPokemon("Ninetales"), 0, false)); // Evolui com Fire Stone

        // Linha Jigglypuff
        pokemons.add(new Pokemon(40, "Wigglytuff", new ArrayList<>(List.of(normal, fada)), null, 0, false));
        pokemons.add(new Pokemon(39, "Jigglypuff", new ArrayList<>(List.of(normal, fada)), buscaPokemon("Wigglytuff"), 0, false)); // Evolui com Moon Stone

        // Linha Zubat
        pokemons.add(new Pokemon(42, "Golbat", new ArrayList<>(List.of(venenoso, voador)), null, 0, false));
        pokemons.add(new Pokemon(41, "Zubat", new ArrayList<>(List.of(venenoso, voador)), buscaPokemon("Golbat"), 22, false));

        // Linha Oddish
        pokemons.add(new Pokemon(45, "Vileplume", new ArrayList<>(List.of(planta, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(44, "Gloom", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Vileplume"), 0, false)); // Evolui com Leaf Stone
        pokemons.add(new Pokemon(43, "Oddish", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Gloom"), 21, false));

        // Linha Paras
        pokemons.add(new Pokemon(47, "Parasect", new ArrayList<>(List.of(inseto, planta)), null, 0, false));
        pokemons.add(new Pokemon(46, "Paras", new ArrayList<>(List.of(inseto, planta)), buscaPokemon("Parasect"), 24, false));

        // Linha Venonat
        pokemons.add(new Pokemon(49, "Venomoth", new ArrayList<>(List.of(inseto, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(48, "Venonat", new ArrayList<>(List.of(inseto, venenoso)), buscaPokemon("Venomoth"), 31, false));

        // Linha Diglett
        pokemons.add(new Pokemon(51, "Dugtrio", new ArrayList<>(List.of(terrestre)), null, 0, false));
        pokemons.add(new Pokemon(50, "Diglett", new ArrayList<>(List.of(terrestre)), buscaPokemon("Dugtrio"), 26, false));

        // Linha Meowth
        pokemons.add(new Pokemon(53, "Persian", new ArrayList<>(List.of(normal)), null, 0, false));
        pokemons.add(new Pokemon(52, "Meowth", new ArrayList<>(List.of(normal)), buscaPokemon("Persian"), 28, false));

        // Linha Psyduck
        pokemons.add(new Pokemon(55, "Golduck", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(54, "Psyduck", new ArrayList<>(List.of(agua)), buscaPokemon("Golduck"), 33, false));

        // Linha Mankey
        pokemons.add(new Pokemon(57, "Primeape", new ArrayList<>(List.of(lutador)), null, 0, false));
        pokemons.add(new Pokemon(56, "Mankey", new ArrayList<>(List.of(lutador)), buscaPokemon("Primeape"), 28, false));

        // Linha Growlithe
        pokemons.add(new Pokemon(59, "Arcanine", new ArrayList<>(List.of(fogo)), null, 0, false));
        pokemons.add(new Pokemon(58, "Growlithe", new ArrayList<>(List.of(fogo)), buscaPokemon("Arcanine"), 0, false)); // Evolui com Fire Stone

        // Linha Poliwag
        pokemons.add(new Pokemon(62, "Poliwrath", new ArrayList<>(List.of(agua, lutador)), null, 0, false));
        pokemons.add(new Pokemon(61, "Poliwhirl", new ArrayList<>(List.of(agua)), buscaPokemon("Poliwrath"), 0, false)); // Evolui com Water Stone
        pokemons.add(new Pokemon(60, "Poliwag", new ArrayList<>(List.of(agua)), buscaPokemon("Poliwhirl"), 25, false));

        // Linha Abra
        pokemons.add(new Pokemon(65, "Alakazam", new ArrayList<>(List.of(psiquico)), null, 0, false));
        pokemons.add(new Pokemon(64, "Kadabra", new ArrayList<>(List.of(psiquico)), buscaPokemon("Alakazam"), 0, false)); // Evolui por troca
        pokemons.add(new Pokemon(63, "Abra", new ArrayList<>(List.of(psiquico)), buscaPokemon("Kadabra"), 16, false));

        // Linha Machop
        pokemons.add(new Pokemon(68, "Machamp", new ArrayList<>(List.of(lutador)), null, 0, false));
        pokemons.add(new Pokemon(67, "Machoke", new ArrayList<>(List.of(lutador)), buscaPokemon("Machamp"), 0, false)); // Evolui por troca
        pokemons.add(new Pokemon(66, "Machop", new ArrayList<>(List.of(lutador)), buscaPokemon("Machoke"), 28, false));

        // Linha Bellsprout
        pokemons.add(new Pokemon(71, "Victreebel", new ArrayList<>(List.of(planta, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(70, "Weepinbell", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Victreebel"), 0, false)); // Evolui com Leaf Stone
        pokemons.add(new Pokemon(69, "Bellsprout", new ArrayList<>(List.of(planta, venenoso)), buscaPokemon("Weepinbell"), 21, false));

        // Linha Tentacool
        pokemons.add(new Pokemon(73, "Tentacruel", new ArrayList<>(List.of(agua, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(72, "Tentacool", new ArrayList<>(List.of(agua, venenoso)), buscaPokemon("Tentacruel"), 30, false));

        // Linha Geodude
        pokemons.add(new Pokemon(76, "Golem", new ArrayList<>(List.of(pedra, terrestre)), null, 0, false));
        pokemons.add(new Pokemon(75, "Graveler", new ArrayList<>(List.of(pedra, terrestre)), buscaPokemon("Golem"), 0, false)); // Evolui por troca
        pokemons.add(new Pokemon(74, "Geodude", new ArrayList<>(List.of(pedra, terrestre)), buscaPokemon("Graveler"), 25, false));

        // Linha Ponyta
        pokemons.add(new Pokemon(78, "Rapidash", new ArrayList<>(List.of(fogo)), null, 0, false));
        pokemons.add(new Pokemon(77, "Ponyta", new ArrayList<>(List.of(fogo)), buscaPokemon("Rapidash"), 40, false));

        // Linha Slowpoke
        pokemons.add(new Pokemon(80, "Slowbro", new ArrayList<>(List.of(agua, psiquico)), null, 0, false));
        pokemons.add(new Pokemon(79, "Slowpoke", new ArrayList<>(List.of(agua, psiquico)), buscaPokemon("Slowbro"), 37, false));

        // Linha Magnemite
        pokemons.add(new Pokemon(82, "Magneton", new ArrayList<>(List.of(eletrico, aco)), null, 0, false));
        pokemons.add(new Pokemon(81, "Magnemite", new ArrayList<>(List.of(eletrico, aco)), buscaPokemon("Magneton"), 30, false));

        // Farfetch'd (sem evolução)
        pokemons.add(new Pokemon(83, "Farfetch'd", new ArrayList<>(List.of(normal, voador)), null, 0, false));

        // Linha Doduo
        pokemons.add(new Pokemon(85, "Dodrio", new ArrayList<>(List.of(normal, voador)), null, 0, false));
        pokemons.add(new Pokemon(84, "Doduo", new ArrayList<>(List.of(normal, voador)), buscaPokemon("Dodrio"), 31, false));

        // Linha Seel
        pokemons.add(new Pokemon(87, "Dewgong", new ArrayList<>(List.of(agua, gelo)), null, 0, false));
        pokemons.add(new Pokemon(86, "Seel", new ArrayList<>(List.of(agua)), buscaPokemon("Dewgong"), 34, false));

        // Linha Grimer
        pokemons.add(new Pokemon(89, "Muk", new ArrayList<>(List.of(venenoso)), null, 0, false));
        pokemons.add(new Pokemon(88, "Grimer", new ArrayList<>(List.of(venenoso)), buscaPokemon("Muk"), 38, false));

        // Linha Shellder
        pokemons.add(new Pokemon(91, "Cloyster", new ArrayList<>(List.of(agua, gelo)), null, 0, false));
        pokemons.add(new Pokemon(90, "Shellder", new ArrayList<>(List.of(agua)), buscaPokemon("Cloyster"), 0, false)); // Evolui com Water Stone

        // Linha Gastly
        pokemons.add(new Pokemon(94, "Gengar", new ArrayList<>(List.of(fantasma, venenoso)), null, 0, false));
        pokemons.add(new Pokemon(93, "Haunter", new ArrayList<>(List.of(fantasma, venenoso)), buscaPokemon("Gengar"), 0, false)); // Evolui por troca
        pokemons.add(new Pokemon(92, "Gastly", new ArrayList<>(List.of(fantasma, venenoso)), buscaPokemon("Haunter"), 25, false));

        // Onix (sem evolução)
        pokemons.add(new Pokemon(95, "Onix", new ArrayList<>(List.of(pedra, terrestre)), null, 0, false));

        // Linha Drowzee
        pokemons.add(new Pokemon(97, "Hypno", new ArrayList<>(List.of(psiquico)), null, 0, false));
        pokemons.add(new Pokemon(96, "Drowzee", new ArrayList<>(List.of(psiquico)), buscaPokemon("Hypno"), 26, false));

        // Linha Krabby
        pokemons.add(new Pokemon(99, "Kingler", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(98, "Krabby", new ArrayList<>(List.of(agua)), buscaPokemon("Kingler"), 28, false));

        // Linha Voltorb
        pokemons.add(new Pokemon(101, "Electrode", new ArrayList<>(List.of(eletrico)), null, 0, false));
        pokemons.add(new Pokemon(100, "Voltorb", new ArrayList<>(List.of(eletrico)), buscaPokemon("Electrode"), 30, false));

        // Linha Exeggcute
        pokemons.add(new Pokemon(103, "Exeggutor", new ArrayList<>(List.of(planta, psiquico)), null, 0, false));
        pokemons.add(new Pokemon(102, "Exeggcute", new ArrayList<>(List.of(planta, psiquico)), buscaPokemon("Exeggutor"), 0, false)); // Evolui com Leaf Stone

        // Linha Cubone
        pokemons.add(new Pokemon(105, "Marowak", new ArrayList<>(List.of(terrestre)), null, 0, false));
        pokemons.add(new Pokemon(104, "Cubone", new ArrayList<>(List.of(terrestre)), buscaPokemon("Marowak"), 28, false));

        // Hitmonlee (sem evolução)
        pokemons.add(new Pokemon(106, "Hitmonlee", new ArrayList<>(List.of(lutador)), null, 0, false));

        // Hitmonchan (sem evolução)
        pokemons.add(new Pokemon(107, "Hitmonchan", new ArrayList<>(List.of(lutador)), null, 0, false));

        // Lickitung (sem evolução)
        pokemons.add(new Pokemon(108, "Lickitung", new ArrayList<>(List.of(normal)), null, 0, false));

        // Linha Koffing
        pokemons.add(new Pokemon(110, "Weezing", new ArrayList<>(List.of(venenoso)), null, 0, false));
        pokemons.add(new Pokemon(109, "Koffing", new ArrayList<>(List.of(venenoso)), buscaPokemon("Weezing"), 35, false));

        // Linha Rhyhorn
        pokemons.add(new Pokemon(112, "Rhydon", new ArrayList<>(List.of(terrestre, pedra)), null, 0, false));
        pokemons.add(new Pokemon(111, "Rhyhorn", new ArrayList<>(List.of(terrestre, pedra)), buscaPokemon("Rhydon"), 42, false));

        // Chansey (sem evolução)
        pokemons.add(new Pokemon(113, "Chansey", new ArrayList<>(List.of(normal)), null, 0, false));

        // Tangela (sem evolução)
        pokemons.add(new Pokemon(114, "Tangela", new ArrayList<>(List.of(planta)), null, 0, false));

        // Kangaskhan (sem evolução)
        pokemons.add(new Pokemon(115, "Kangaskhan", new ArrayList<>(List.of(normal)), null, 0, false));

        // Linha Horsea
        pokemons.add(new Pokemon(117, "Seadra", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(116, "Horsea", new ArrayList<>(List.of(agua)), buscaPokemon("Seadra"), 32, false));

        // Linha Goldeen
        pokemons.add(new Pokemon(119, "Seaking", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(118, "Goldeen", new ArrayList<>(List.of(agua)), buscaPokemon("Seaking"), 33, false));

        // Linha Staryu
        pokemons.add(new Pokemon(121, "Starmie", new ArrayList<>(List.of(agua, psiquico)), null, 0, false));
        pokemons.add(new Pokemon(120, "Staryu", new ArrayList<>(List.of(agua)), buscaPokemon("Starmie"), 0, false)); // Evolui com Water Stone

        // Mr. Mime (sem evolução)
        pokemons.add(new Pokemon(122, "Mr. Mime", new ArrayList<>(List.of(psiquico, fada)), null, 0, false));

        // Scyther (sem evolução)
        pokemons.add(new Pokemon(123, "Scyther", new ArrayList<>(List.of(inseto, voador)), null, 0, false));

        // Jynx (sem evolução)
        pokemons.add(new Pokemon(124, "Jynx", new ArrayList<>(List.of(gelo, psiquico)), null, 0, false));

        // Electabuzz (sem evolução)
        pokemons.add(new Pokemon(125, "Electabuzz", new ArrayList<>(List.of(eletrico)), null, 0, false));

        // Magmar (sem evolução)
        pokemons.add(new Pokemon(126, "Magmar", new ArrayList<>(List.of(fogo)), null, 0, false));

        // Pinsir (sem evolução)
        pokemons.add(new Pokemon(127, "Pinsir", new ArrayList<>(List.of(inseto)), null, 0, false));

        // Tauros (sem evolução)
        pokemons.add(new Pokemon(128, "Tauros", new ArrayList<>(List.of(normal)), null, 0, false));

        // Linha Magikarp
        pokemons.add(new Pokemon(130, "Gyarados", new ArrayList<>(List.of(agua, voador)), null, 0, false));
        pokemons.add(new Pokemon(129, "Magikarp", new ArrayList<>(List.of(agua)), buscaPokemon("Gyarados"), 20, false));

        // Lapras (sem evolução)
        pokemons.add(new Pokemon(131, "Lapras", new ArrayList<>(List.of(agua, gelo)), null, 0, false));

        // Ditto (sem evolução)
        pokemons.add(new Pokemon(132, "Ditto", new ArrayList<>(List.of(normal)), null, 0, false));

        // Linha Eevee
        pokemons.add(new Pokemon(134, "Vaporeon", new ArrayList<>(List.of(agua)), null, 0, false));
        pokemons.add(new Pokemon(135, "Jolteon", new ArrayList<>(List.of(eletrico)), null, 0, false));
        pokemons.add(new Pokemon(136, "Flareon", new ArrayList<>(List.of(fogo)), null, 0, false));
        pokemons.add(new Pokemon(133, "Eevee", new ArrayList<>(List.of(normal)), buscaPokemon("Vaporeon"), 0, false)); // Evolui com Water Stone
        pokemons.add(new Pokemon(133, "Eevee", new ArrayList<>(List.of(normal)), buscaPokemon("Jolteon"), 0, false)); // Evolui com Thunder Stone
        pokemons.add(new Pokemon(133, "Eevee", new ArrayList<>(List.of(normal)), buscaPokemon("Flareon"), 0, false)); // Evolui com Fire Stone

        // Porygon (sem evolução)
        pokemons.add(new Pokemon(137, "Porygon", new ArrayList<>(List.of(normal)), null, 0, false));

        // Linha Omanyte
        pokemons.add(new Pokemon(139, "Omastar", new ArrayList<>(List.of(pedra, agua)), null, 0, false));
        pokemons.add(new Pokemon(138, "Omanyte", new ArrayList<>(List.of(pedra, agua)), buscaPokemon("Omastar"), 40, false));

        // Linha Kabuto
        pokemons.add(new Pokemon(141, "Kabutops", new ArrayList<>(List.of(pedra, agua)), null, 0, false));
        pokemons.add(new Pokemon(140, "Kabuto", new ArrayList<>(List.of(pedra, agua)), buscaPokemon("Kabutops"), 40, false));

        // Aerodactyl (sem evolução)
        pokemons.add(new Pokemon(142, "Aerodactyl", new ArrayList<>(List.of(pedra, voador)), null, 0, false));

        // Snorlax (sem evolução)
        pokemons.add(new Pokemon(143, "Snorlax", new ArrayList<>(List.of(normal)), null, 0, false));

        // Articuno (lendário, sem evolução)
        pokemons.add(new Pokemon(144, "Articuno", new ArrayList<>(List.of(gelo, voador)), null, 0, true));

        // Zapdos (lendário, sem evolução)
        pokemons.add(new Pokemon(145, "Zapdos", new ArrayList<>(List.of(eletrico, voador)), null, 0, true));

        // Moltres (lendário, sem evolução)
        pokemons.add(new Pokemon(146, "Moltres", new ArrayList<>(List.of(fogo, voador)), null, 0, true));

        // Linha Dratini
        pokemons.add(new Pokemon(149, "Dragonite", new ArrayList<>(List.of(dragao, voador)), null, 0, false));
        pokemons.add(new Pokemon(148, "Dragonair", new ArrayList<>(List.of(dragao)), buscaPokemon("Dragonite"), 55, false));
        pokemons.add(new Pokemon(147, "Dratini", new ArrayList<>(List.of(dragao)), buscaPokemon("Dragonair"), 30, false));

        // Mewtwo (lendário, sem evolução)
        pokemons.add(new Pokemon(150, "Mewtwo", new ArrayList<>(List.of(psiquico)), null, 0, true));

        // Mew (lendário, sem evolução)
        pokemons.add(new Pokemon(151, "Mew", new ArrayList<>(List.of(psiquico)), null, 0, true));

    }
    
    public Pokemon buscaPokemon(int id){
        
        for(Pokemon p: pokemons){
            if(p.getNumero() == id){
                return p;
            }
        }
        return null;
    }
   
    ///SobreCarga buscaPokemon
    public Pokemon buscaPokemon(String nome){
        
        for(Pokemon p: pokemons){
            if(p.getNome() == nome){
                return p;
            }
        }
        return null;
    }
    
    public Tipo buscaTipo (String nome_tipo){
        for(Tipo t: tipos){
            if(t.getNome() == nome_tipo){
                return t;
            }
        }
        return null;
    }
}
