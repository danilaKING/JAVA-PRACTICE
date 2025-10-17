import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Введите своё имя: ");
    String username = input.next();
    System.out.println("Привет, " + username + ".");

}