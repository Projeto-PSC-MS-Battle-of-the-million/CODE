package battle.of.the.million;
public class Pergunta {
    
    //Atributos
    
    private int id;
    private String enunciado;
    private boolean pergstatus = true;
    private String alternativas;
    
    //Metodo Construtor

    public Pergunta(String e, int i, boolean p) {
        this.id = i;
        this.enunciado = e;
    }
    
    //Metodos Especiais

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

    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String a) {
        this.alternativas = a;
    }

    public boolean getPergstatus() {
        return pergstatus;
    }

    public void setPergstatus(boolean p) {
        this.pergstatus = p;
    }
    
    
   
    
}
