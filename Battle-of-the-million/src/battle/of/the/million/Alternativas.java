package battle.of.the.million;
public class Alternativas{
    
    //Atributos
    
    private boolean status;
    private String enunciado;
    private int id;
    //Metodo Construtor

    public Alternativas(boolean s, String e, int i) {
        this.status = s;
        this.enunciado = e;
        this.id = i;
    }
    
    
    
    //Metodos Especiais

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String e) {
        this.enunciado = e;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
