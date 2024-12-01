import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import domain.Pessoa;

public class App {

public interface Operacoes{
    public int soma(int a, int b);
}

public static class Exc extends Exception{
    public Exc(String mensagem){
        super(mensagem);
    }
}

public static void main(String args[]){

    Operacoes op = (a,b)->{return a+b;};
    int resultado = op.soma(2, 05);
    List<Pessoa> lista= new ArrayList<>();
    lista.add(new Pessoa(1,"Leonam", 30));
    lista.add(new Pessoa(1,"Cavalcante", 39));
    lista.add(new Pessoa(1,"Souza", 10));
    lista.add(new Pessoa(1,"Lidiane", 32));
    lista.add(new Pessoa(1,"Antunes", 33));
    lista.add(new Pessoa(1,"Fernandes", 60));

    //lista.forEach(System.out::println);

    lista.stream()
    .sorted(Comparator.comparing(Pessoa::getNome))
    .forEach(p->System.out.println(p.getNome()));

    //lista.forEach(p -> System.out.println(p.getNome()+"\t\t"+p.getIdade()));

    try{
        if(resultado%5==0){
            System.out.println("Este é um múltiplo de 5");
        }
        else{
            throw new Exc("Este número não é múltiplo de 5");
        }

    }
    catch(Exc e){
        System.out.println(e.getMessage());
    }

}
 
}
