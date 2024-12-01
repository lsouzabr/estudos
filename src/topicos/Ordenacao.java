package topicos;
import java.util.Comparator;
import java.util.List;

import domain.Pessoa;

public class Ordenacao {

    public static void main(String args[]){

        List<Pessoa> lista = Pessoa.getLista();

        //usando stream para ordenar por nome - através do stream você ordena em tempo real
        lista.stream()
        .sorted(Comparator.comparing(Pessoa :: getNome))
        .forEach(p->System.out.println(p.getNome()));

        System.out.println("------------------------------");
        //usando stream para ordenar por nome - através do stream você ordena reversa em tempo real
        lista.stream()
        .sorted(Comparator.comparing(Pessoa :: getNome).reversed())
        .forEach(p->System.out.println(p.getNome()));        

        System.out.println("------------------------------");

        //ordenando a lista com sort e depois imprimindo
        lista.sort(Comparator.comparing(Pessoa :: getNome));
        lista.forEach(p->System.out.println(p.getNome()));

        System.out.println("------------------------------");
        //ordenando a lista com sort e depois imprimindo
        lista.sort(Comparator.comparing(Pessoa :: getNome).reversed());
        lista.forEach(p->System.out.println(p.getNome()));        

    }
}
