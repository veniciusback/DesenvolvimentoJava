package br.edu.unoescsmo.lojatenis.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.lojatenis.model.Tenis;
import br.edu.unoescsmo.lojatenis.repository.TenisRepository;

@Service
public class TenisPadrao implements TenisRegra {

	@Autowired
	private TenisRepository tenisRepository;

	@Override
	public void salvar(Tenis tenis) {
		tenisRepository.save(tenis);
	}

	
	public List<Tenis> listar() {
		return tenisRepository.findAll();
	}

	
	@Override
	public List<Tenis> dadosGrid() {
		return tenisRepository.findAll();
	}
	
}
