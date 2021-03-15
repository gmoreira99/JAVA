/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import modelo.JogoVelha;
import javax.swing.JButton;

/**
 *
 * @author guilh
 */
public class Handler implements ActionListener{

	private JogoVelha jogo;
        private int linha;
        private int coluna;

	public  Handler(JogoVelha jogo){
		this.jogo = jogo;
                linha = 0;
                coluna = 0;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Sair")){
            System.exit(0);
        }else
        if(e.getActionCommand().equals("Limpar")){
            jogo.reset();
        }else
            setLinha(((JButton)e.getSource()).getName());
            setColuna(((JButton)e.getSource()).getName());
            jogo.setJogada(e.getActionCommand(), linha, coluna);
    }

    
    public void setLinha(String name){
        linha = (name.charAt(0))-48;
    }
    
    public void setColuna(String name){
        coluna = (name.charAt(1))-48;
    }
    
    public int getLinha(String posicao){
        return linha;
    }
    
    public int getColuna(String posicao){
        return coluna;
    }
}
