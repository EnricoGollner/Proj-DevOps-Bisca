package proj.devops.bisca;

import java.util.ArrayList;

/**
 *
 * @author Guto
 */
public class Bisca {

    // Criando jogadores:
    public ArrayList<String> Jogador1 = new ArrayList<>(3);
    public ArrayList<String> Jogador2 = new ArrayList<>(3);
    
    // Criando as cartas
    public static String[] nipes = {"Ouro", "Copas", "Espadas", "Paus"};
    public static String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Valete", "Dama", "Rei"};
    
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
            String carta = SorteiaCarta(nipes, faces);
            jogador.add(carta);
        }
        return jogador;
    }

}
