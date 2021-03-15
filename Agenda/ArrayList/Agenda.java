/*
Autor: Guilherme Moreira;
Classe Agenda: cria uma agenda com uma coleção "array" de contatos; adiciona e remove um contato; retorna a descriçao de um ou de todos os contatos e a quantidade de contatos na agenda;
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda{

	private ArrayList<Contato> agenda;

	public Agenda(){
		agenda = new ArrayList<>();
	}

	public void setAgenda(ArrayList<Contato> agenda){
		this.agenda = agenda;
	}

	public ArrayList<Contato> getAgenda(){
		return agenda;
	}

	public String adicionarContato(Contato novoContato){
		Contato aux = new Contato();
		Iterator<Contato> it = agenda.iterator();
		while(it.hasNext()){
			aux=it.next();
			if(novoContato.getNome().equals(aux.getNome()) || novoContato.getTelefone().equals(aux.getTelefone()) || novoContato.getEmail().equals(aux.getEmail()))
				return "Entrada Invalida";
		}
		agenda.add(novoContato);
		return "Novo Contato Adicionado";
	}

	public int totalContato(){
		return agenda.size();
	}

	public String exibirContato(String nome){
		Contato aux = new Contato();
		String exibir = "";	
		Iterator<Contato> it = agenda.iterator();
		while(it.hasNext()){
			aux = it.next();
			if(aux.getNome().equals(nome)){
				exibir += "Nome: " + aux.getNome() + "\nTelefone: " + aux.getTelefone() + "\nE-mail: " + aux.getEmail();
				return exibir;
			}
		}
		return "Contato Nao Encontrado";
	}

	public String excluirContato(String nome){
		Iterator<Contato> it = agenda.iterator();
		Contato aux = new Contato();
		while(it.hasNext()){
			aux=it.next();
			if(aux.getNome().equals(nome)){
				agenda.remove(aux);
				return "Contato Excluido";
			}
		}
		return "Contato Nao Encontrado";
	}

	public String exibirContatos(){
		String exibir = "";
		Iterator<Contato> it = agenda.iterator();
		Contato aux = new Contato();
		while(it.hasNext()){
			aux=it.next();
			exibir += "\n\t-----\n";	
			exibir += "Nome: " + aux.getNome() + "\nTelefone: " + aux.getTelefone() + "\nE-mail: " + aux.getEmail();
		}
		return exibir;
	}	
}
