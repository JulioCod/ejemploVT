package Prueba2;

public class Perro {

    private Raza raza;
    private String color;
    private double tamanio;
    private double peso;

    /*constructores*/
    public Perro(){
        this.raza=Raza.PASTOR;
        this.color="marron";
        this.tamanio=5.23;
        this.peso=2.35;

    }

    public Perro(Raza raza, String color, double tamanio, double peso){
        this.raza=Raza.BELGA;
        this.color="marron";
        this.tamanio=tamanio;
        this.peso=peso;
    }

    public Raza getRaza(){
        return this.raza;
    }
    public void setRaza(Raza raza){
        this.raza=raza;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public double getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(double tamanio){
        this.tamanio=tamanio;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

    public String toString(){
        return "Raza: "+this.raza+", color: "+this.color+", tamaño: "+this.tamanio+", peso: "+this.peso;
    }


}
