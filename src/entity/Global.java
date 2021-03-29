/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sayuri
 */
public class Global {
    public static Estado Objetivo;
    public static void init(int n){
    Tabuleiro.N = n; 
    makeObjetivo();
    
    }
    public static void makeObjetivo(){
    int[][]luz=new int[Tabuleiro.N][Tabuleiro.N];
    for(int i=0;i<luz.length;i++){
        for(int j=0;j<luz.length;j++){
            luz[i][j]=0;
        }
      }
    Tabuleiro t0=new Tabuleiro(luz);
    Objetivo=new Estado(t0);
    }
}
