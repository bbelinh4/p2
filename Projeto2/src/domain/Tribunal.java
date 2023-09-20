package domain;

public class Tribunal{
    private Integer codigo;
    private String nomeTri;

    public Tribunal(Integer codigo, String nomeTri) {
        this.codigo = codigo;
        this.nomeTri = nomeTri;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNomeTri() {
        return nomeTri;
    }
    public void setNomeTri(String nomeTri) {
        this.nomeTri = nomeTri;
    }
    @Override
    public String toString() {
        return "Tribunal [codigo=" + codigo + ", nome=" + nomeTri + "]";
    }

    

}
