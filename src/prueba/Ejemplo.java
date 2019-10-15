package prueba;

import Prueba2.Perro;
import Prueba2.Raza;

public class Ejemplo {


    /*Creadión de la clase principal*/
    /*variables principales*/
    /*creacion de un string*/
    /*creacion de una nueva clase*/
    /*constructores*/
    /*Metodos setters y getters*/
    /*Metodo toString*/

    public static void main(String[] args){
        int numero=0;
        float decimal=0.5f;
        double decimalLargo=0.6;
        char letra='a';
        String frase="hola Onliners!";
        boolean condicion=true;
        Perro chispa = new Perro();
        System.out.println(chispa);
        Perro pet = new Perro(Raza.BELGA, "blanco", 4.6, 2.54);
        System.out.println(pet);

    }

}
