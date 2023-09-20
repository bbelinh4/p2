package domain;

import java.util.List;

public class Escritorio {
    private List<Processo> processos;
    private List<Pessoa> pessoas;
    private List<Tribunal> tribunais;

    public List<Processo> getProcessos() {
        return processos;
    }
    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public List<Tribunal> getTribunais() {
        return tribunais;
    }
    public void setTribunais(List<Tribunal> tribunais) {
        this.tribunais = tribunais;
    }
    @Override
    public String toString() {
        return "Escritorio [processos=" + processos + ", pessoas=" + pessoas + ", tribunais=" + tribunais + "]";
    }

    
}
