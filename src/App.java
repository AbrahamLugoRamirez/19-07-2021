import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String marca1 = "Toyota";
        String color1 = "Roja";
        String placa1 = "THY-734";
        String motor1 = "Diesel";

        carro carro1 = new carro(marca1, color1, placa1, motor1);

        String marca2 = "VW";
        String color2 = "Negro";
        String placa2 = "GYL-234";
        String motor2 = "GAS";

        carro carro2 = new carro(marca2, color2, placa2, motor2); 
    }
    
}
