package domain;
import java.util.ArrayList;
import java.util.List;

public class Pessoa{
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static List<Pessoa> getLista(){
        List<Pessoa> lista= new ArrayList<>();
        lista.add(new Pessoa(1,"Leonam", 30));
        lista.add(new Pessoa(1,"Cavalcante", 39));
        lista.add(new Pessoa(1,"Souza", 10));
        lista.add(new Pessoa(1,"Lidiane", 32));
        lista.add(new Pessoa(1,"Antunes", 33));
        lista.add(new Pessoa(1,"Fernandes", 60));  
        
        return lista;
    }

}