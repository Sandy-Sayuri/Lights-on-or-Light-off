package teste;

import java.util.Collection;

import dao.InputInstance;
import entity.EspacoDeEstados;
import entity.Estado;
import entity.Tabuleiro;

public class TesteEstadoGeraFilhos {
	
	public static void main(String[] args) {
		Tabuleiro t = InputInstance.getInstance("insts/inst_obj.in");
		Estado e = new Estado(t);
		Tabuleiro tO = InputInstance.getInstance("insts/inst_3_0002.in");
		Estado eO = new Estado(tO);
		
		System.out.println("estado original");
		System.out.println(eO);
		
		Collection<Estado> filhos = eO.geraFilhos();
		
		System.out.println("filhos");
		for(Estado filho: filhos)
			System.out.println(filho);
		
		
		
	}

}
