
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Testando Data hora

        // Instânciar data e hora atual
        LocalDate data01 = LocalDate.now(); // Conseguir a data local atual
        LocalDateTime data02 = LocalDateTime.now(); // Conseguir a data e hora local atual
        Instant data03 = Instant.now(); // Conseguir a data e hora global atual
        
        // Converter String para data (o formato deve ser o mesmo do padrão ISO-8601, "yyyy-MM-ddTHH:mm:ssZ")
        LocalDate data04 = LocalDate.parse("2022-07-20"); // Converter String para data
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Converter String para data e hora
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z"); // Converter String para data e hora global
        // (Podemos usar -03:00 no lugar de "Z" para o fuso horário de Brasília: "2022-07-20T01:30:26-03:00");

        // Converter texto em formato customizado para data
        // Utilizamos o DateTimeFormatter para definir o formato do texto a ser convertido
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formato de texto a ser convertido
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Formato de texto a ser convertido com hora e minuto

        LocalDate data07 = LocalDate.parse("20/07/2022", fmt1); // Converter String para data usando o formato definido no DateTimeFormatter
        LocalDateTime data08 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        // Converter String para data e hora usando o formato definido no DateTimeFormatter

        // Converter valores separados para data
        LocalDate data09 = LocalDate.of(2022, 7, 20); // Converter valores separados para data (ano, mês, dia)
        LocalDateTime data10 = LocalDateTime.of(2022, 7, 20, 1, 30);
        // Converter valores separados para data e hora (ano, mês, dia, hora, minuto)

        // Imprimir as datas
        System.out.println("Data 01: " + data01);
        System.out.println("Data 02: " + data02);
        System.out.println("Data 03: " + data03);
        System.out.println("Data 04: " + data04);
        System.out.println("Data 05: " + data05);
        System.out.println("Data 06: " + data06);
        System.out.println("Data 07: " + data07);
        System.out.println("Data 08: " + data08);
        System.out.println("Data 09: " + data09);
        System.out.println("Data 10: " + data10);
        System.out.println();
        
        
        // Transformar data em texto customizado
        String data11 = data01.format(fmt1); // Transformar data em texto usando o formato definido no DateTimeFormatter
        String data12 = fmt2.format(data02); // Outra forma de transformar data em texto usando o formato definido no DateTimeFormatter
        String data13 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mmZ").withZone(ZoneId.systemDefault()).format(data03);
        // Transformar data e hora global em texto usando o formato definido no DateTimeFormatter, necessário o fuso horário do sistema para funcionar
        
        System.out.println("Data 11: " + data11);
        System.out.println("Data 12: " + data12);
        System.out.println("Data 13: " + data13);
        System.out.println();

        // Converter data hora global para local
        // Necessário a data hora global e o timezone

        // Todos os timezone disponiveis:
        // for(String s : ZoneId.getAvailableZoneIds()){
        //     System.out.println(s);
        // };

        LocalDate data14 = LocalDate.ofInstant(data03, ZoneId.systemDefault()); // Transformou um horário global em local
        System.out.println(data14);

        // Selecionando apenas dia/mes/ano/hora/minuto do obejto data
        System.out.println("Data: " + data02.getDayOfMonth());
        System.out.println("Mês: " + data02.getMonthValue());
        System.out.println("Ano: " + data02.getYear());
        System.out.println("Hora: " + data02.getHour());
        System.out.println("minuto: " + data02.getMinute());
        System.out.println();


        // Calcular data hora
        // Podemos diminuir ou adicionar data/hora/mes/ano/segundos ao tempo que temos
        // Não podemos mudar o objeto data que instânciamos porque ele é imultavel então devemos criar um segundo objeto que vai recebe a soma ou subtração de tempo
        LocalDate semanaPassadaLocalDate = data01.minusDays(7);
        LocalDate semanaQueVemLocalDate = data01.plusDays(7);
        System.out.println("Semana passada LocalDate" + semanaPassadaLocalDate);
        System.out.println("Semana passada LocalDate" + semanaQueVemLocalDate);
        
        LocalDateTime semanaPassadaLocalDateTime = data02.minusDays(7);
        LocalDateTime semanaQueVemLocalDateTime = data02.plusDays(7);
        System.out.println("Semana passada LocalDateTime" + semanaPassadaLocalDateTime);
        System.out.println("Semana passada LocalDateTime" + semanaQueVemLocalDateTime);


        // Instant não possui os métodos minus/plus de dias/mes/ano diretamente, precisamos usar a UnidadeTemporal(ChronoUnit)
        Instant semanaPassadaInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant semanaQueVemInstant = data03.plus(7, ChronoUnit.DAYS);
        System.out.println("Semana passada Instant" + semanaPassadaInstant);
        System.out.println("Semana passada Instant" + semanaQueVemInstant);

        // Podemos calcular a diferença de tempo entre datas
        // Duration não funciona com LocalDate por não ter tempo então temos que transformar em LocalDateTime para o calculo funcionar
        // Devemos usar atTime ou atStartOfDay para dizer o tempo do dia ou que o dia está em zero horas.
        Duration diferenca1 = Duration.between(semanaPassadaLocalDate.atTime(0,0), semanaQueVemLocalDate.atStartOfDay());
        System.out.println(diferenca1);

        // Não precisamos usar o atTime quando usamos LocalDateTime e Instant
        Duration diferenca2 = Duration.between(semanaQueVemLocalDateTime, semanaPassadaLocalDateTime);
        System.out.println(diferenca2);

        Duration diferenca3 = Duration.between(semanaPassadaInstant, semanaQueVemInstant);
        System.out.println(diferenca3);

        // Ao imprimir diretamente a variavel recebemos algo como PT336H que é a diferença em horas entre as datas
        // para transformar isso em dias, horas, minutos, segundos, etc, podemos usar os métodos toDays(), toHours() da variável do tipo Duration
        System.out.println("Diferença em dias: " + diferenca1.toDays());
        System.out.println("Diferença em horas: " + diferenca1.toHours());
        System.out.println("Diferença em minutos: " + diferenca1.toMinutes());
    }
}
