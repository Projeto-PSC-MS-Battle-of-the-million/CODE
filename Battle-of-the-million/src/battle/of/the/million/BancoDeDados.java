package battle.of.the.million;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDeDados {
    
    public static boolean Write(String Caminho, String Texto){
        
        FileWriter arq = null;
        try {
            arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.println(Texto);
                gravarArq.close();
                return true;
                    } catch (IOException ex) {
            System.out.println("Erro ao Cadastrar Jogador!");
            return false;
        } }

public class Arquivo {
    public static String Read(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(C:\Users\gustavo.henrique\Desktop\CODE\Battle-of-the-million);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }

        static boolean Write(String arq, String texto) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }}
        
    
