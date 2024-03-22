package main;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class butil {

    private Scanner scan = new Scanner(System.in);
    public Scanner getScan() {return scan;}

    public String gettime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        String DateFormatter = now.format(formatter);
        return DateFormatter;
    }
}
