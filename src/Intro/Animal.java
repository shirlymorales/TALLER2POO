package Intro;
import java.util.Scanner;
public class Animal{

//atributos
 String nombre;
 int edad;

private Scanner lectura=new Scanner(System.in);
//metodo constructor
public Animal(){

}
public Animal(String nombre, int edad){
    this.nombre = nombre;this.edad = edad;
}

//metodos
public void registrarAnimal() {
    System.out.println("ingrese el nombre del animal");
    String nombre=lectura.nextLine();

    System.out.println("ingrese la edad del animal");
    int edad=lectura.nextInt();

}
public void mostrarAnimal(){

    System.out.println("El nombre del animal es " + nombre + "y su edad es " + edad);
}

public int duplicarEdad(int e) {
    int duplicar=e*2;
    return duplicar;
}



}