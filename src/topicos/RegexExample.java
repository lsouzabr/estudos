package topicos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String input = "Meu email é exemplo@exemplo.com e meu número de telefone é 123-456-7890.";
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Email encontrado: " + matcher.group());
        }

        pattern = Pattern.compile(phonePattern);
        matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Número de telefone encontrado: " + matcher.group());
        }
    }
}
