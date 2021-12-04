package battle.of.the.million;

import java.util.Random;

public class Partida extends Jogador{

    //Atributos
    
  boolean A,B,C,D;

    //Métodos Construtor
    
   public Partida(String nome, String n, String h, int v, boolean s) {
        super(nome, n, h, v, s);
    }

    //Métodos
   
    public void random(Jogador [] j){
       Random aleatorio = new Random();
            j[0].setSorte(aleatorio.nextInt(100));
            j[1].setSorte(aleatorio.nextInt(100));
            
            if(j[0].getSorte()== j[1].getSorte()){
                random(j);
            }else if (j[0].getSorte()> j[1].getSorte()){
                
                System.out.println("O Player " + j[0].getApelido() + " jogara primeiro");
                    j[0].setVez(true);
                    j[1].setVez(false);
            }else{
                System.out.println("O Player " + j[1].getApelido() + " jogara primeiro");
                    j[1].setVez(true);
                    j[0].setVez(false);
            }
            
    }
    public void Quiz(Pergunta [] p, Alternativas [] a, Partida s, Jogador [] j){
        
        Random  i = new Random();
        
        int x;
            x = i.nextInt(9);
           char letter='@';
           
           if(p[x].getPergstatus() == false){
           s.Quiz(p, a, s, j);
            }else{
           System.out.println("\n" + p[x].getEnunciado() + "\n");
           p[x].setPergstatus(false);}
          
           for(int y=0; y < 40; y++){
              
               if(a[y].getId() == x ){
                   
                    letter++;
                
                       String Stringletter = Character.toString(letter);

                   System.out.print("[" + Stringletter + "] ");
               System.out.println(a[y].getEnunciado());
                 
               if(Stringletter.equalsIgnoreCase("A")){ 
                   A = a[y].getStatus();
               }else if(Stringletter.equalsIgnoreCase("B")){
                   B = a[y].getStatus();
               }else if(Stringletter.equalsIgnoreCase("C")){
                   C = a[y].getStatus();
               }else {
                   D = a[y].getStatus();
               }
}
           }
           s.EscolherResposta(s, j, j, p, a);
           

    }
    
    //Métodos Especiais

    public boolean getA() {
        return A;
    }

    public void setA(boolean A) {
        this.A = A;
    }

    public boolean getB() {
        return B;
    }

    public void setB(boolean B) {
        this.B = B;
    }

    public boolean getC() {
        return C;
    }

    public void setC(boolean C) {
        this.C = C;
    }

    public boolean getD() {
        return D;
    }

    public void setD(boolean D) {
        this.D = D;
    }
    
}
    
