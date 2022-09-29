package proj.devops.bisca;

import java.util.ArrayList;
import proj.devops.bisca.Mesa;


public class Jogador {
    
    // Criando jogadores:
    //public ArrayList<String> Jogador1 = new ArrayList<>(3);
    //public ArrayList<String> Jogador2 = new ArrayList<>(3);
    
    
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
        
    
    
 
   
    



}
