public class Computador extends Produto{
    private int hd;
    private int memoria;
    private String processa;
    public void setHd(int hd){
        this.hd = hd;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    public void setProcessador(String processador){
        this.processa = processa;
    }
    public int getHd(){
        return this.hd;
    }
    public int getMemoria(){
        return this.memoria;
    }
    public String getProcessador(){
        return this.processa;
    }
}