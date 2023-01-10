import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputVar = new Scanner(System.in);
        int number = (int) inputVar.nextInt();
        System.out.println("Tabela de multiplicação de "+ number);
        for(int i = 1; i <= 10;i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
