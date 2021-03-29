package entity;

import java.util.Collection;

import entity.estruturas.EstadosAbertos;
import entity.estruturas.Fila;
import java.util.HashSet;
import java.util.Set;

public class EspacoDeEstados {
	Estado inicial;
        EstadosAbertos estadosAberto;
        Set<Estado> estadosFechados;
        
        public EspacoDeEstados(Estado aInicial,EstadosAbertos aEstruturaAbertos){
        this.inicial=aInicial;
        this.estadosAberto=aEstruturaAbertos;
        estadosAberto.push(this.inicial);
        estadosFechados=new HashSet<>();
        }
        public Estado solve(){
            while(estadosAberto.size()>0){
                Estado e=estadosAberto.pop();
                System.out.println("TESTANDO ESTADO");
                System.out.println(e);
                System.out.println("Estados abertos:"+ this.estadosAberto.size());
                System.out.println("Estados fechados:"+this.estadosFechados.size());
                if(e.isObjetivo()){
                    System.out.println("-------Encontrou Solução--------");
                    System.out.println(e);
                    return e;
                }
                estadosFechados.add(e);
                Collection<Estado>filhos=e.geraFilhos();
                for(Estado filho: filhos){
                    if(!estadosFechados.contains(filho))
                        estadosAberto.push(filho);
                }
            }
            System.out.println("não encontrou a solução");
            return null;
        }
        
}
