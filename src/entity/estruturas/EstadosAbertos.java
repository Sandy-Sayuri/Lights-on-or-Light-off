/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.estruturas;

import entity.Estado;

/**
 *
 * @author Sayuri
 */
public interface EstadosAbertos {
    public void push (Estado estado);
    public Estado pop();
    public int size();
}
