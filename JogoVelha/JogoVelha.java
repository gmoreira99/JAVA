/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package modelo;

import java.util.Observable;
/**
 *
 * @author guilh
 */
public class JogoVelha extends Observable{

	private String[][] tabuleiro;

	public JogoVelha(){
		tabuleiro = new String[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				tabuleiro[i][j] = "";
			}
		}
	}

	public void setTabuleiro(String[][] tabuleiro){
		this.tabuleiro = tabuleiro;
                setChanged();
                notifyObservers();
	}

	public String[][] getTabuleiro(){
		return tabuleiro;
	}

	public void setJogada(String jogada, int i, int j){
		tabuleiro[i][j] = jogada;
                setChanged();
		notifyObservers();
	}

	public String verificaFimDeJogo(){
		for(int i=0;i<3;i++){
			if(tabuleiro[i][0].equals(tabuleiro[i][1])&&tabuleiro[i][0].equals(tabuleiro[i][2])){
				return tabuleiro[i][i];
			}else
			if(tabuleiro[0][i].equals(tabuleiro[1][i])&&tabuleiro[0][i].equals(tabuleiro[2][i])){
				return tabuleiro[i][i];
			}
		}
		if(tabuleiro[0][0].equals(tabuleiro[1][1])&&tabuleiro[0][0].equals(tabuleiro[2][2])){
			return tabuleiro[0][0];
		}else
                if(tabuleiro[0][2].equals(tabuleiro[1][1])&&tabuleiro[0][2].equals(tabuleiro[2][0])){
			return tabuleiro[0][2];
                }else        
			return "empate";
	}

    public void reset() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
			tabuleiro[i][j] = "";
            }
	}
        setChanged();
        notifyObservers();
    }
    
}
