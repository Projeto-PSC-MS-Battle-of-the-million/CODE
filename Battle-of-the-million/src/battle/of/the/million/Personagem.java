package battle.of.the.million;
import java.util.Scanner;
public  class Personagem {
    
    //Atributos
    
    private  String nome, habilidades;
    private int vida = 100;
    private boolean status;
    Scanner input = new Scanner(System.in);

    //Método Constutor
    
    public Personagem(String n, String h, int v, boolean s) {
        
        this.nome = n;
        this.habilidades = h;
        this.vida = v; 
        this.status = s;
    }

    //Métodos
    
    public void ApresentarPersonagens(int aux){
       
             if (this.getStatus() == true){
                
          System.out.print("[" +(aux + 1) + "] " + "Nome: " + this.getNome() + " --> Habilidade: " + this.getHabilidades() + "\n");
         
        }
        
        }
        
    //Métodos Especiais 
    
    public float getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String h) {
        this.habilidades = h;
    }
    
}
