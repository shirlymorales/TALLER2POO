package polimorfismo;
import java.util.Scanner;


public class Juegoppt implements Juego {

    private String nombres;
    private String nombres1;
    private int jugador1;
    private int jugador2;
    private String[]opciones= {"piedra","papel","tijera"};

    Scanner lectura=new Scanner(System.in);
    
    public void iniciar(){
        System.out.println("Ingrese su nombre jugador 1:");
        nombres = lectura.nextLine();
        System.out.println("Ingrese su nombre jugador 2:");
        nombres1 = lectura.nextLine();
    }
    public void jugar (){
        System.out.println("Jugador 1: elige Piedra (0), Papel (1) o Tijera (2)");
        jugador1 = lectura.nextInt();
        while (jugador1 < 0 || jugador1 > 2) {

        }
        System.out.println("Jugador 2: elige Piedra (0), Papel (1) o Tijera (2)");
        jugador2 = lectura.nextInt();
        while (jugador2 < 0 || jugador2 > 2) {
            
        }
    }
    
    public void finalizar(){
        System.out.println("Jugador 1 eligio"+opciones[jugador1]);
        System.out.println("Jugador 2 eligio"+opciones[jugador2]);
        if (jugador1 == jugador2) {
            System.out.println("empate");
    }
 else if ((jugador1 == 0 && jugador2 == 2) ||
(jugador1 == 1 && jugador2 == 0) ||
(jugador1 == 2 && jugador2 == 1)) {
System.out.println("Jugador 1 gana");}
    else{
        System.out.println("Jugador 2 gana");
    }
    lectura.close();
}

}