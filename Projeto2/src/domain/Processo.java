package domain;

import java.util.Date;

public class Processo {
    private String numeroProcesso;
    private String tribunal;
    private String vara;
    private Date dataAbertura;
    public Date dataConclusão;
    public String cliente;
    
    public Processo(String numeroProcesso, String tribunal, String vara, Date dataAbertura, Date dataConclusão,
            String cliente) {
        this.numeroProcesso = numeroProcesso;
        this.tribunal = tribunal;
        this.vara = vara;
        this.dataAbertura = dataAbertura;
        this.dataConclusão = dataConclusão;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numeroProcesso;
    }

    public void setNumero(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getVara() {
        return vara;
    }

    public void setVara(String vara) {
        this.vara = vara;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataConclusão() {
        return dataConclusão;
    }

    public void setDataConclusão(Date dataConclusão) {
        this.dataConclusão = dataConclusão;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Processo [numero=" + numeroProcesso + ", tribunal=" + tribunal + ", vara=" + vara + ", dataAbertura="
                + dataAbertura + ", dataConclusão=" + dataConclusão + ", cliente=" + cliente + "]";
    }

    


    
}
