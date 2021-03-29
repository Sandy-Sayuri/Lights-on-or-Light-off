package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Estado {
    Tabuleiro tabuleiro;
    List<Coordenada>acoes;
    public Estado(Tabuleiro atabuleiro){
        this.tabuleiro=atabuleiro;
        this.acoes=new LinkedList<>();
    }
    public Estado(Tabuleiro atabuleiro,List<Coordenada> aAcoes){
        this (atabuleiro);
        this.acoes=aAcoes;
    }
    public boolean isObjetivo(){
        if(this.equals(Global.Objetivo))
            return true;
        return false;
    }
    public void fazerAcao(Coordenada acao){
        this.acoes.add(acao);
        this.tabuleiro.fazerAcoes(acao);
        
    }
    public Collection<Estado> geraFilhos() {
        Collection<Estado> filhos=new ArrayList<>();
        System.out.println("testendo a ação"+acoes);
        for(Coordenada acao: Acoes.value()){
        Estado filho=this.deepCopy();
        filho.fazerAcao(acao);
        filhos.add(filho);
        }
        return filhos;
    }
    public Estado deepCopy(){
        List<Coordenada> novasAcoes=new LinkedList<>(this.acoes);
        return new Estado(this.tabuleiro.deepCopy(),novasAcoes);
    }
    @Override
    public int hashCode(){
    final int prime =31;
    int result=1;
    result=prime*result+((tabuleiro== null)? 0 :tabuleiro.hashCode());
    return result;
    
    }
    @Override
    public boolean equals(Object obj){
         if(this==obj)
             return true;
         if(obj==null)
             return false;
         if(getClass()!=obj.getClass())
             return false;
         Estado other=(Estado)obj;
         if(tabuleiro==null){
             if(other.tabuleiro!=null)
                 return false;
         }
         else if(!tabuleiro.equals(other.tabuleiro))
             return false;
        return true;
             
         }
    @Override
	public String toString() {
		String res = "";
		res += this.tabuleiro + "\n";
		res+= this.tabuleiro+"\n";
                for(Coordenada acao:this.acoes){
                    res+=acao+",";
                }
                res+="\n";
		return res;
	}
}
