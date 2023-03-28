package Intro;

import java.util.jar.Attributes.Name;

public class Prueba {

    public static void main(String[] args) {

        //int duracion;

        
    

        
        Animal panda=new Animal();

        panda.registrarAnimal(); //llamar el metodo
        panda.mostrarAnimal();


        Animal tigre=new Animal("Tony", 5);
        tigre.mostrarAnimal();
       // Movie avatar=new Movie("avatar", 560, "ficcion", "James Cameron");
      //  Movie minions=new Movie("minions", 120, "infantil", "kyle balda");
    
    }
    
}