package proj.devops.bisca;

//import static proj.devops.bisca.Baralho.faces;
//import static proj.devops.bisca.Baralho.nipes;

public class Regras {  
    
        // Regra 1 || Se os nipes são iguais, a face com maior número pontua. ( precisa arrumar o nome das variaveis )
        
        if ( naipe.Jogador1 == naipe.Jogador2 ){
            if ( face.Jogador1 > face.Jogador2 ){
                resultadoJogador1++;
            }else {
                resultadoJogador2++;
            }
        }
        
        // Regra 2 e 3 ( Precisa arrumar nome das variáveis e fazer com que olhe quem jogou primeiro ).
        
        if ( naipe.Jogador1 != naipe.Jogador2 ) {
            if ( face.Jogador1 != trunfo && face.Jogador2 != trunfo){
                // Quem jogou primeiro ganha pontuação ( não sei verificar quem jogou primeiro )
            } else if ( face.Jogador1 == trunfo || face.Jogador2 == trunfo) {
                // O jogaor que tiver o trunfo ganha pontuação
            }
        }
}
