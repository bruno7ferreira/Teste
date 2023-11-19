import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataAtual {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        ZoneId zonaHorariaCuiaba = ZoneId.of("America/Cuiaba");
        LocalDateTime dataHoraAtual = LocalDateTime.now(zonaHorariaCuiaba);

        System.out.println("Data e Hora atual em Cuiabá: " + dataHoraAtual);

    }
}
