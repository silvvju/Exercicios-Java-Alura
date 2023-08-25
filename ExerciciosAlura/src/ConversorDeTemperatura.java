import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double Tcelsius = leitura.nextDouble();
        double Tfahrenheit = (int) ((Tcelsius*1.8)+32);

        System.out.println("A temperatura em Fahrenheit é " +Tfahrenheit);
    }

}