public class Ingresso {
     protected float valor; 

     public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
     public String toString() {
        return "valor: " + valor;


     }
     public Ingresso(){

     }
    public Ingresso(float valor){ 
       this.valor = valor;
    }

}
