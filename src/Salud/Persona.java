package Salud;
import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    

    //reto 3
    // Métodos getter y setter para los atributos privados
   
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento: ");
        this.tipoDoc = lectura.nextLine();
        System.out.println("Ingrese el número de documento: ");
        this.documento = lectura.nextLine();
        System.out.println("Ingrese el nombre: ");
        this.nombre = lectura.nextLine();
        System.out.println("Ingrese el apellido: ");
        this.apellido = lectura.nextLine();
        System.out.println("Ingrese el peso en kg: ");
        this.peso = lectura.nextDouble();
        System.out.println("Ingrese la estatura en m: ");
        this.estatura = lectura.nextDouble();
        System.out.println("Ingrese la edad: ");
        this.edad = lectura.nextInt();
        System.out.println("Ingrese el sexo: ");
        this.sexo = lectura.next();
        lectura.close();
    }
    
    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + this.tipoDoc);
        System.out.println("Número de documento: " + this.documento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Estatura: " + this.estatura + " m");
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Sexo: " + this.sexo);
    }
    
    /*public String calcularImc() {
        double pesoActual = this.peso / Math.pow(this.estatura, 2);
        if (pesoActual < 20) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
        return apellido;
    }*/

    public String calcularImc(){
        double estaturaAl = estatura * estatura;
        double imc = peso / estaturaAl;
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    
    public void mayorEdad() {
        if (this.edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    


   
}


