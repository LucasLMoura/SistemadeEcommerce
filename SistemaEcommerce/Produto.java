abstract class Produto  {
    private String fabric;
    private String nome;
    private double preco;
    public void setFabric(String Fabric){
        this.fabric = fabric;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getFabric(){
        return this.fabric;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
} 