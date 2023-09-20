package domain;

public class Vara {
    private String nomeVara;
    private Tribunal Tribunal;
    
    public Vara(String nomeVara, domain.Tribunal tribunal) {
        this.nomeVara = nomeVara;
        Tribunal = tribunal;
    }
    public String getNomeVara() {
        return nomeVara;
    }
    public void setNomeVara(String nomeVara) {
        this.nomeVara = nomeVara;
    }
    public Tribunal getTribunal() {
        return Tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        Tribunal = tribunal;
    }
    @Override
    public String toString() {
        return "Vara [nome=" + nomeVara + ", Tribunal=" + Tribunal + "]";
    }

    

}
