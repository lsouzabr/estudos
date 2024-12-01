package modulos;

public class Lambda {

    public interface Operacao{
        public int soma(int a, int b);
    }

    public static void main(String args[]){
        Operacao operacao = (a,b)->{return a+b;};
        System.out.println(operacao.soma(3, 5));
    }
}
