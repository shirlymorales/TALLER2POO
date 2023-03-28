package polimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){ 
    float lado,area,altura,base;
    Scanner lectura=new Scanner(System.in);
    System.out.println("Ingrese el valor del lado del cuadrado");
   lado=lectura.nextFloat();
   
   Cuadrado c2=new Cuadrado(lado);
   c2.calcularArea();


   System.out.println("Ingrese el area del triangulo:");
   area=lectura.nextFloat();
   
   System.out.println("Ingrese la altura del triangulo:");
   altura=lectura.nextFloat();

   Triangulo r3=new Triangulo (area, altura);
   r3.calcularArea();


   System.out.println("Ingrese el area del rectangulo:");
   area=lectura.nextFloat();
   
   System.out.println("Ingrese la altura del rectangulo:");
   altura=lectura.nextFloat();

   System.out.println("Ingrese la base del rectangulo:");
   base=lectura.nextFloat();

   Rectangulo c3=new Rectangulo(lado, altura, base);
   c3.calcularArea();


   System.out.println("Ingrese el area del circulo:");
   area=lectura.nextFloat();


Circulo f1=new Circulo(area);
f1.calcularArea();



lectura.close();

}

    
}