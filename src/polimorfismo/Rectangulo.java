package polimorfismo;

public class Rectangulo {
    private float lado,base,altura;
    public Rectangulo(float lado, float altura, float base){
        this.lado=lado;
        this.altura=altura;
        this.base=base;
    }
    

    public float getLado() {
        return lado;
    }




    public void setLado(float lado) {
        this.lado = lado;
    }




    public float getBase() {
        return base;
    }




    public void setBase(float base) {
        this.base = base;
    }




    public float getAltura() {
        return altura;
    }




    public void setAltura(float altura) {
        this.altura = altura;
    }




    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("la altura del rectangulo es:"+altura+",su area es: "+area+"y su base es:"+base);
    }

}
