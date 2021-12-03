package battle.of.the.million;

import java.util.Random;

public class Partida extends Jogador{

    //Atributos
    
    Partida s = new Partida("null","null","null",0,false);

    //Métodos Construtor
    
   public Partida(String nome, String n, String h, float v, boolean s) {
        super(nome, n, h, v, s);
    }

    //Métodos
   
    public void random(Jogador [] j){
       Random aleatorio = new Random();
            j[0].setVez(aleatorio.nextInt(100));
            j[1].setVez(aleatorio.nextInt(100));
            
            if(j[0].getVez() == j[1].getVez()){
                random(j);
            }else if (j[0].getVez() > j[1].getVez()){
                
                System.out.println("O Player " + j[0].getApelido() + " jogara primeiro");
                    
                j[0].EscolherResposta();
                
            }else{
                System.out.println("O Player " + j[1].getApelido() + " jogara primeiro");
                
                j[1].EscolherResposta();
            }
            
    }
    public void Quiz(Pergunta [] p, Alternativas [] a){
        
        Random  i = new Random();
        
           int x = i.nextInt(9);
           char letter='@';
           System.out.println("\n" + p[x].getEnunciado() + "\n");
          
           
           for(int y=0; y < 40; y++){
              
               if(a[y].getId() == x ){
                   
                    letter++;
                
                     

                   System.out.print("[" + letter + "] ");
               System.out.println(a[y].getEnunciado());
                 
}
           }}
    
    
    
}
    
