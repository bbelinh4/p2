package domain;

public class Custo {
    private String data;
    private String descricao;
    private String valor;
    private Processo Processo;
    public Custo(String data, String descricao, String valor, domain.Processo processo) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        Processo = processo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Processo getProcesso() {
        return Processo;
    }
    public void setProcesso(Processo processo) {
        Processo = processo;
    }
    @Override
    public String toString() {
        return "Custo [data=" + data + ", descricao=" + descricao + ", valor=" + valor + ", Processo=" + Processo + "]";
    }

    
    


}
