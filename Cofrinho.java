import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cofrinho implements Comparable<Cofrinho>{


    List<Moeda> moedas = new ArrayList<>();

    public int compareTo(Cofrinho o){
            
    }

    public void addMoeda(Moeda m){
        moedas.add(m);
    }

    public double get ValorTotal(){
        return;
    }

    public int getQuantMoedas(){
        
    }

    public Moeda getMoedaMaiorValor(){
        return;
    }

    public void ordenaMoedas(){
        Collections.sort(moedas);
        System.out.println(moedas);

    }

}