package br.edu.unoescsmo.lojatenis.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.lojatenis.model.Cor;
import br.edu.unoescsmo.lojatenis.repository.CorRepository;

@Service
public class CorPadrao implements CorRegra {

	@Autowired
	private CorRepository corRepository;

	@Override
	public void salvar(Cor cor) {
		corRepository.save(cor);
	}

	public List<Cor> listar() {
		return corRepository.findAll();
	}

	@Override
	public List<Cor> dadosGrid() {
		return corRepository.findAll();
	}
}
