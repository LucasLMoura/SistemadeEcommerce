public class Televisao extends Produto{
    private double peso;
    private double tamanho;
    private String resolucao;
    public void setPeso(double Peso){
        this.peso = peso;
    }
    public void setTamanho(double Tamanho){
        this.tamanho = tamanho;
    }
    public void setResolucao(String Resolucao){
        this.resolucao = resolucao;
    }
    public double getPeso(double Peso){
        return this.peso;
    }
    public double getTamanho(double Tamanho){
        return this.tamanho;
    }
    public String getResolucao(){
        return this.resolucao;
    }
}