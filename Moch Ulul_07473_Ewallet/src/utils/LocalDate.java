package utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDate {
    
    public static  String now(){
    Locale local = new Locale("id");//.forLanguageTag("id");
    String pattern = "yy-MM-dd H:m:s";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, local);
    LocalDateTime dateTime = LocalDateTime.now();
    return dateTime.format(formatter);

    }
}
