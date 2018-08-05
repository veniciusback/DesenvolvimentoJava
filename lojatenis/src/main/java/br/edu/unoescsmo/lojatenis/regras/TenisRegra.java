package br.edu.unoescsmo.lojatenis.regras;

import java.util.List;

import br.edu.unoescsmo.lojatenis.model.Tenis;

public interface TenisRegra {

	void salvar(Tenis tenis);


	List<Tenis> listar();
	
	List<Tenis> dadosGrid();

}
