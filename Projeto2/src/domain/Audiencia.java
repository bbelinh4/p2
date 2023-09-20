package domain;

public class Audiencia {
    private String data;
    private String recomendação;
    private Processo Processos;

    public Audiencia(String data, String recomendação, Processo processos) {
        this.data = data;
        this.recomendação = recomendação;
        Processos = processos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRecomendação() {
        return recomendação;
    }

    public void setRecomendação(String recomendação) {
        this.recomendação = recomendação;
    }

    public Processo getProcessos() {
        return Processos;
    }

    public void setProcessos(Processo processos) {
        Processos = processos;
    }

    @Override
    public String toString() {
        return "Audiencia [data=" + data + ", recomendação=" + recomendação + ", Processos=" + Processos + "]";
    }
    
    
    
}
