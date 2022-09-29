package proj.devops.bisca;

import java.util.ArrayList;
import proj.devops.bisca.Jogador;
import proj.devops.bisca.Baralho;



public class Mesa {
    
    // Sorteando
    public static String SorteiaCarta(String[] nipes, String[] faces) {
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        String carta = face + " de " + nipe;

        return carta;
    }
    
    // Distribuindo
    public static ArrayList<String> DistribuirCartas(ArrayList<String> jogador) {
        for (int i = 0; i < 3; i++) {
            String carta = SorteiaCarta(Baralho.nipes, Baralho.faces);
            jogador.add(carta);
        }
        return jogador;
    }

}

