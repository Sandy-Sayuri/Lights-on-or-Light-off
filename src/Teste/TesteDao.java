package Teste;
import entity.Tabuleiro;
import dao.InputInstance;
public class TesteDao{
	public static void main(String[] args) {
            //pega o arquivo e mostra no terminal
		Tabuleiro t= InputInstance.getInstance( "insts/inst_3_0001.in");
		System.out.println(t);
	}
	
}