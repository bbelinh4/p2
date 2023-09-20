package domain;

public class Pessoa {
    private Integer idPessoa;
    private String email;
    public String nomePessoa;
    
    public TipoPessoa TipoPessoas;

    public Pessoa(Integer idPessoa, String email, String nomePessoa, TipoPessoa tipoPessoas) {
        this.idPessoa = idPessoa;
        this.email = email;
        this.nomePessoa = nomePessoa;
        TipoPessoas = tipoPessoas;
    }
    public Integer getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public TipoPessoa getTipoPessoas() {
        return TipoPessoas;
    }
    public void setTipoPessoas(TipoPessoa tipoPessoas) {
        TipoPessoas = tipoPessoas;
    }
    @Override
    public String toString() {
        return "Pessoa [id=" + idPessoa + ", email=" + email + ", nome=" + nomePessoa + ", TipoPessoas=" + TipoPessoas + "]";
    }
    
    
    
}