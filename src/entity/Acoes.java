package entity;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Acoes{
    public static Set<Coordenada> todas;
    public static void init(){
    todas=new TreeSet<>();
    for(int i=0;i<Tabuleiro.N;i++){
        for(int j=0;j<Tabuleiro.N;j++){
            todas.add(new Coordenada(i, j));
            }
        }
    }
    public static Collection<Coordenada> value(){
        return Acoes.todas;
    }
}
