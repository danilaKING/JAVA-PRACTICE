import java.util.Date;

void main() {
    Date now = new Date();

    System.out.printf("Час (24-часовой): %tH%n", now);       // %tH — час (00–23)
    System.out.printf("Час (12-часовой): %tI%n", now);      // %tI — час (1–12)
    System.out.printf("Минуты: %tM%n", now);                 // %tM — минуты (00–59)
    System.out.printf("Секунды: %tS%n", now);               // %tS — секунды (00–59)
    System.out.printf("Миллисекунды: %tL%n", now);          // %tL — миллисекунды (000–999)
    System.out.printf("Год (4 цифры): %tY%n", now);          // %tY — год в четырехзначном формате
    System.out.printf("Год (2 цифры): %ty%n", now);          // %ty — год в двузначном формате
    System.out.printf("Название месяца: %tB%n", now);        // %tB — полное название месяца
    System.out.printf("Месяц (2 цифры): %tm%n", now);        // %tm — месяц в двузначном формате
    System.out.printf("Название дня недели: %tA%n", now);    // %tA — полное название дня недели
}