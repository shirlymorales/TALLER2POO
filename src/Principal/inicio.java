package Principal;

import java.util.Scanner;

import Salud.Persona;

public class inicio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona();

        
        // Pedir los datos de la persona
        persona1.pedirDatos();
        
        // Mostrar los datos de la persona
        persona1.mostrarPersona();
        
        // Calcular el IMC de la persona

        //persona1.calcularImc();

        // Calcular el IMC de la persona y mostrar el resultado
        String resultadoImc = persona1.calcularImc();
        if (resultadoImc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (resultadoImc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
        
        // Determinar si la persona es mayor de edad
        persona1.mayorEdad();
        



        lectura.close();
    }

    
}