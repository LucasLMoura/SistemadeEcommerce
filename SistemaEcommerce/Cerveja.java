public class Cerveja extends Produto {
    private double teor;
    private String validade;
    public void setTeor(double teor){
        this.teor = teor;
    }
    public void setValidade(String Validade){
        this.validade = validade;
    }
    public double getTeor(){
        return this.teor;
    }
    public String getValidade(){
        return this.validade;
    }
}