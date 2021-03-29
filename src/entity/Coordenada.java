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
public class Coordenada implements Comparable<Coordenada>{
    public int i;
    public int j;
    public Coordenada(int i,int j){
        this.i=i;
        this.j=j;
    }

    @Override
    public int compareTo(Coordenada o) {
        if(this.i==o.i){
            return Integer.compare(this.j, o.j);
        }
        return Integer.compare(this.i, o.i);
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Coordenada other=(Coordenada) obj;
        if(i!= other.i)
            return false;
        if(j!=other.j)
            return false;
        return true;
                
    }
    @Override
    public String toString(){
        return "("+i+","+j+")";
    }
}
    
  
