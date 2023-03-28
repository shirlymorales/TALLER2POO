package Salud;
import java.util.Scanner;
public class Persona{

    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    float peso;
    float estatura;
    int edad;
    String sexo;

    Scanner lectura=new Scanner(System.in);

    public void pedirDatos(){

        System.out.println("Ingrese tipo de documento");
        tipoDoc=lectura.nextLine();
        System.out.println("Ingrese numero de documento");
        documento=lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=lectura.nextLine();
        System.out.println("Ingrese su peso actual");
        peso=lectura.nextFloat();
        System.out.println("Ingrese su estatura actual");
        estatura=lectura.nextFloat();
        System.out.println("Ingrese su edad");
        edad=lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su sexo");
        sexo=lectura.nextLine();
    
    }
    public void mostrarPersona(){

    }

    public void calcularImc(){

        float pesoActual;

        pesoActual=peso/(estatura*estatura);

if(pesoActual<20){
    System.out.println("El peso esta por debajo de lo ideal "+pesoActual);
}
else if(pesoActual>20 && pesoActual<=25){

    System.out.println("El peso es ideal " +pesoActual);
}

else {
    System.out.println("Tiene sobre peso "+pesoActual );
}
     
    }

    public void mayorEdad(){

        if(edad<18){
            System.out.println("usted es menor de edad");

        }

        else{
            System.out.println("Usted es mayor de edad");
        }

    }
    public Persona(){

    }
    public Persona( String tipoDoc, int documento, String nombre, String apellido, float peso, float estatura, int edad, String sexo){
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
}



