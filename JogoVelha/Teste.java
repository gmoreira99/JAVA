/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package controle;

//import modelo.JogoVelha;
//import visao.Janela;

/**
 *
 * @author guilh
 */
public class Teste {
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       JogoVelha jogo = new JogoVelha();
       Handler handler = new Handler(jogo);
       Janela janela = new Janela(jogo, handler);
       janela.setSize(500,500);
       janela.setVisible(true);
    }
    
}
