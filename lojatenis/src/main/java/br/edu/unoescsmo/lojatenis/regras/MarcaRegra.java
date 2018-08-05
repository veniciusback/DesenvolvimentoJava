package br.edu.unoescsmo.lojatenis.regras;

import java.util.List;

import br.edu.unoescsmo.lojatenis.model.Marca;

public interface MarcaRegra {

	void salvar(Marca tenis);


	List<Marca> listar();
	
	List<Marca> dadosGrid();
	
}
