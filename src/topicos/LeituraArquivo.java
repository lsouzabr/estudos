package topicos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class LeituraArquivo {

    public void lerArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String caminhoArquivo = args[0];
            LeituraArquivo leitura = new LeituraArquivo();
            leitura.lerArquivo(caminhoArquivo);
        } else {
            System.out.println("Por favor, forneça o caminho do arquivo como argumento.");
        }
    }
}
