package Teste;
import entity.Tabuleiro;
import dao.InputInstance;
public class TesteDao{
	public static void main(String[] args) {
		Tabuleiro t= InputInstance.getInstance( "insts/inst_3_0000.in");
		System.out.println(t);
	}
	
}