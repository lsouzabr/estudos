package topicos;

public class Excessao {

    public static class Ex extends Exception{
        public Ex(String message){
            super(message);
        }
    }

    public static void main(String args[]){
        int a = 20;
        try{
            if(a==20){
                System.out.println("A é realmente igual a 20");
            }
            else{
                throw new Ex("não é igual a 20");
            }

        }catch(Ex e){
            e.getMessage();
        }

    }

}
