package proj.devops.bisca;

import java.util.ArrayList;

public class Jogador {
    
    // Criando jogadores 
    public static ArrayList<String> Jogador1() {
    
        ArrayList<String> Jogador1 = new ArrayList<>(3);
        
        ArrayList<String> JogadorCartas1 = Mesa.DistribuirCartas(Jogador1);
        
        return JogadorCartas1;
        
    }
    
    public static ArrayList<String> Jogador2() {
    
        ArrayList<String> Jogador2 = new ArrayList<>(3);
        
        ArrayList<String> JogadorCartas2 = Mesa.DistribuirCartas(Jogador2);
        
        return JogadorCartas2;
        
    }
    
    public static ArrayList<String> CompraCartas(ArrayList<String> jogador) {
        
        // Sorteando apenas uma carta
        String carta = Mesa.SorteiaCarta(Baralho.nipes, Baralho.faces);
        jogador.add(carta);
        
        return jogador;
    }
 
}
