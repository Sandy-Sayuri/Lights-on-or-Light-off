package dao;

import entity.Global;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import entity.Tabuleiro;

public class InputInstance {
	
	public static Tabuleiro getInstance(String file) {
		
		Tabuleiro tabuleiro = null;
	
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			//LÃª arquivos
			is = new FileInputStream(file);
			//comversoer de caracter
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			//lÃª uma linaha de arquivo de cada vez
			br = new BufferedReader(isr);
			//varieavel que vai guardar a linha
			int n=Integer.parseInt(br.readLine());
                        Global.init(n);
			String line;
			int[][] luz = new int[Tabuleiro.N][Tabuleiro.N];
			for(int i=0; i<Tabuleiro.N; i++) {
				//leitura de elementos
				line = br.readLine();
				//guarda o elementosna lista valores
				String[] valores = line.split(" ");
				for(int j=0; j<Tabuleiro.N; j++) {
					luz[i][j] = Integer.parseInt(valores[j]);
				}
			}
			tabuleiro = new Tabuleiro(luz);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return tabuleiro;
		
		
	}

}


//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//public class TesteInputText {
//	
//	public static void main(String[] args) {
//		
//		InputStream is;
//		InputStreamReader isr;
//		BufferedReader br;
//		
//		try {
//			
//			is = new FileInputStream("files/arquivo.in");
//			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
//			br = new BufferedReader(isr);
//			String line;
//			while( ( line = br.readLine() ) !=null) {
//				System.out.println(line);
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//	}
//
//}
