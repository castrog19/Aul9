public class IngressoVIP extends Ingresso {
    private float valorAdicional;



    public float getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString(){
        return "Valor do ingresso Vip: " + (valor +  valorAdicional);
    }


    public IngressoVIP(){

    }
    public IngressoVIP(float valorAdicional, float valor){
        this.valor = valor;
        this.valorAdicional = valorAdicional;
    }
}
