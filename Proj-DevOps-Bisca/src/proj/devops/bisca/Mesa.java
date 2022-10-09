package proj.devops.bisca;

import java.util.ArrayList;



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
        //public Monte
        for (int i = 0; i < 3; i++) {
            String carta = SorteiaCarta(Baralho.nipes, Baralho.faces);
            // monte.add(carta)
            jogador.add(carta);
        }
        return jogador;
    }
    
    //pontuação
    ArrayList<Integer> pontoJ1 = new ArrayList<>();
    ArrayList<Integer> pontoJ2 = new ArrayList<>();
}

// iniciando compras do jogo
    for (int i = 0; i < 3; i++) {
        vJodares[0].pegarcarta (distribuir:mesa.distribuir ());
        vJodares[1].pegarcarta (distribuir:mesa.distribuir ());

}
