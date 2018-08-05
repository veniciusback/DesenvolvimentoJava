package br.edu.unoescsmo.lojatenis.regras;

import java.util.List;

import br.edu.unoescsmo.lojatenis.model.Cor;

public interface CorRegra {

	void salvar(Cor tenis);


	List<Cor> listar();
	
	List<Cor> dadosGrid();

}
