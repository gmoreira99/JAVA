/*
Autor: Guilherme Moreira;
Classe NovaAgenda: cria uma agenda com uma coleção "hash map" de contatos; adiciona e remove um contato; retorna a descriçao de um ou de todos os contatos e a quantidade de contatos na agenda; 
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class NovaAgenda{

	private HashMap<String, Contato> agenda;

	public NovaAgenda(){
		agenda = new HashMap<>();
	}

	public void setAgenda(HashMap<String, Contato> agenda){
		this.agenda = agenda;
	}

	public HashMap<String, Contato> getAgenda(){
		return agenda;
	}

	public String adicionarContato(Contato novoContato){
		if(agenda.containsKey(novoContato.getNome()))		
			return "Entrada Invalida";
		else{
			agenda.put(novoContato.getNome(), novoContato);
			return "Contato Adicionado";
		}
	}

	public int totalContato(){
		return agenda.size();
	}

	public String exibirContato(String nome){
		Contato aux = new Contato();
		String exibir = "";
		if(agenda.containsKey(nome))
			aux = agenda.get(nome);
		else
			return "Contato Nao Encontrado";
		exibir += "Nome: " + aux.getNome() + "\nTelefone: " + aux.getTelefone() + "\nE-mail: " + aux.getEmail();
		return exibir;
	}

	public String excluirContato(String nome){
		Contato aux = new Contato();
		if(agenda.containsKey(nome)){
			agenda.remove(nome);
			return "Contato Excluido";
		}
		else
			return "Contato Nao Encontrado";
	}

	public String exibirContatos(){
		String aux;
		Set<String> keys = agenda.keySet();
		Iterator<String> it = keys.iterator();
		String exibir = "";
		while(it.hasNext()){
			aux = it.next();
			exibir += "\n\t-----\n";		
			exibir += "Nome: " + agenda.get(aux).getNome() + "\nTelefone: " + agenda.get(aux).getTelefone() + "\nE-mail: " + agenda.get(aux).getEmail() + "\n";
		}
		return exibir;
	}
}