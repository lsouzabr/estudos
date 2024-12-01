package topicos;

public class Threads {
    public static void main(String[] args) {
        Runnable tarefa1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarefa 1 - Contagem: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable tarefa2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarefa 2 - Contagem: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefa2);

        thread1.start();
        thread2.start();
    }
}
