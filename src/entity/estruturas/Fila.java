/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.estruturas;

import entity.Estado;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sayuri
 */
public class Fila implements EstadosAbertos{
   Queue<Estado> elementos = new LinkedList<>();

    @Override
    //add um estado
    public void push(Estado estado) {
       elementos.add(estado);
    }

    @Override
    public Estado pop() {
       return elementos.poll();
    }

    @Override
    public int size() {
        return elementos.size();
    }
    
    
}
