package topicos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

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
        LeituraArquivo leitura = new LeituraArquivo();
        // Obtém o caminho da classe atual
        URL url = LeituraArquivo.class.getProtectionDomain().getCodeSource().getLocation();
        String caminhoClasse = url.getPath();
        System.out.println("Caminho da classe atual: " + caminhoClasse);

        leitura.lerArquivo("c://file.txt"); // Caminho relativo ao diretório de execução
    }
}
