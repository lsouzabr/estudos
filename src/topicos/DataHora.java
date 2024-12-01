package topicos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        // Exemplo de LocalDate
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        // Exemplo de LocalTime
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        // Exemplo de LocalDateTime
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora atual: " + dataHoraAtual);

        // Exemplo de formatação de data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);
        System.out.println("Data formatada: " + dataFormatada);

        // Exemplo de formatação de hora
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(timeFormatter);
        System.out.println("Hora formatada: " + horaFormatada);

        // Exemplo de formatação de data e hora
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(dateTimeFormatter);
        System.out.println("Data e Hora formatada: " + dataHoraFormatada);

    }
}
