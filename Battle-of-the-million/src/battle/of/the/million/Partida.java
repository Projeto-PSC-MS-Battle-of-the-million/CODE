package battle.of.the.million;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Partida extends Jogador{

    //Atributos
    
    

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
                    
               
                
            }else{
                System.out.println("O Player " + j[1].getApelido() + " jogara primeiro");
                
               
            }
            
    }
    public void Quiz(Pergunta [] p,  ArrayList<Alternativas> alt){
       //  Alternativas [] a Lista de entrada do Gustavo
        Random  i = new Random();
        
           int num = i.nextInt(9);
           char letter='@';
           System.out.println("\n" + p[num].getEnunciado() + "\n");
          
           
             ArrayList<Alternativas> AlternativasSelecionadas = new ArrayList<Alternativas>();
       
            for(int y=0; y<alt.size();y++)
            {
             if(alt.get(y).getId()==num)
             {
                 AlternativasSelecionadas.add(alt.get(y));
             }
            }
            
            for(int y=0; y<AlternativasSelecionadas.size();y++)
            {
                 letter++;
                 System.out.print("[" + letter + "] ");
                 System.out.println(AlternativasSelecionadas.get(y).getEnunciado());
            }
           
           
         /*  for(int y=0; y < 40; y++){
              
               if(a[y].getId() == x ){
                   
                   
              
                 
}}*/
           
    if(this.EscolherResposta(AlternativasSelecionadas))
    {
        Quiz(p,alt);
    }
    else
    {
        System.out.println("Você errou! agora é a vez do jogador ");
    }
        
        }
    
    
    
}
    
