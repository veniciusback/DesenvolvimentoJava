package br.edu.unoescsmo.lojatenis.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.lojatenis.model.Tenis;
import br.edu.unoescsmo.lojatenis.regras.TenisRegra;
import br.edu.unoescsmo.lojatenis.repository.CorRepository;
import br.edu.unoescsmo.lojatenis.repository.MarcaRepository;
import br.edu.unoescsmo.lojatenis.repository.TenisRepository;

@Controller
@RequestMapping("/tenis")
public class TenisController {

	@Autowired
	private TenisRegra tenisRegra;

	@Autowired
	private TenisRepository tenisRepository;
	
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	

	@Autowired
	private CorRepository corRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Tenis tenis, BindingResult erros) {
		if (erros.hasErrors()) {
			return "tenis/novo";

		}
		tenisRegra.salvar(tenis);
		return "redirect:/tenis/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("teniss", tenisRegra.dadosGrid());
		return "tenis/lista"; 
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("marcas", marcaRepository.findAll());
		model.addAttribute("cors", corRepository.findAll());

		return "tenis/novo";
	}
	
	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("tenis", tenisRepository.findById(codigo).get());
		model.addAttribute("marcas", marcaRepository.findAll());
		model.addAttribute("cors", corRepository.findAll());
		return "tenis/visualizar";
	}


	@PostMapping("/alterar")
	public String alterar(@Valid Tenis tenis, BindingResult erros) {
		if (erros.hasErrors()) {
			return "tenis/visualizar";

		}
		tenisRegra.salvar(tenis);
		return "redirect:/tenis/listar";
	}
	
	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		tenisRepository.deleteById(codigo);
		return "redirect:/tenis/listar";
	}
}
