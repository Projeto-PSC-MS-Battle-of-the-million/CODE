package battle.of.the.million;
public class Pergunta {
    
    //Atributos
    
    private int id;
    private String enunciado;
    private String alternativas;
    private boolean ativa;
    
    //Metodo Construtor

    public Pergunta(String e, int i) {
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

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    
   
    
}
