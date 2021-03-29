package entity;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Tabuleiro {
	//aqui é definido o tamanho da matriz
  public static int N = - 1;
	//gera a matriz
	int[][] luz;
	//emcapsulamento da matriz
	public Tabuleiro(int[][] luzes) {
		this.luz = luzes;
	}
	public void TrocarLuz(Coordenada c){
        luz[c.i][c.j]+=1;
        luz[c.i][c.j]%=2;
        }
        public boolean isValidTrocarLuz(Coordenada c){
        if(c.i>=0&& c.i<Tabuleiro.N &&c.j>=0 &&c.j<Tabuleiro.N){
         return true;
        }
        return false;
        }
        public void fazerAcoes(Coordenada acao){
        Set<Coordenada> acoes =new TreeSet<>();
        for(int i=acao.i-1;i<=acao.i+1;i++){
            acoes.add(new Coordenada(i, acao.j));
        }
        for(int j=acao.j-1;j<=acao.j+1;j++){
            acoes.add(new Coordenada(acao.i, j));
        }
        
        for(Coordenada c:acoes){
            if(isValidTrocarLuz(c)){
                TrocarLuz(c);
                }
            }
        }
    public Tabuleiro deepCopy(){
    int[][]novaLuzes=new int[Tabuleiro.N][Tabuleiro.N];
        for(int i=0;i<Tabuleiro.N;i++){
            for(int j=0;j<Tabuleiro.N;j++){
                novaLuzes[i][j]=this.luz[i][j];
            }
        }
        return new Tabuleiro(novaLuzes);
    }
   	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(luz);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tabuleiro other = (Tabuleiro) obj;
		if (!Arrays.deepEquals(luz, other.luz))
			return false;
		return true;
	}



	@Override
	//Trasforma a lista em uma matriz
	public String toString() {
		String res = "";
		
		for(int i=0; i<Tabuleiro.N; i++) {
			for(int j=0; j<Tabuleiro.N; j++) {
				res += this.luz[i][j] + " ";
			}
			res += "\n";
		}
		return res;
	}
	

}
