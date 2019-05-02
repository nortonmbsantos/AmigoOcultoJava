package amigooculto;

import amigooculto.models.Amigo;
import amigooculto.models.Sorteio;
import java.util.ArrayList;

/**
 *
 * @author norto
 */
public class AmigoOculto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Amigo a1 = new Amigo("João");
        Amigo a2 = new Amigo("Norton");
        Amigo a3 = new Amigo("Ursula");
        Amigo a4 = new Amigo("Estevan");
        Amigo a5 = new Amigo("Livio");

        ArrayList<Amigo> amigos = new ArrayList<>();
        amigos.add(a1);
        amigos.add(a2);
        amigos.add(a3);
        amigos.add(a4);
        amigos.add(a5);
        
        Sorteio sorteio = new Sorteio(amigos);
        sorteio.sorteia();
        sorteio.imprime();
        
    }
    
    
   
}
