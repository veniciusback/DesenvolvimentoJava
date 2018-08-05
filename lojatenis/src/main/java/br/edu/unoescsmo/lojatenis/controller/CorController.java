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

import br.edu.unoescsmo.lojatenis.model.Cor;
import br.edu.unoescsmo.lojatenis.regras.CorRegra;
import br.edu.unoescsmo.lojatenis.repository.CorRepository;

@Controller
@RequestMapping("/cor")
public class CorController {

	@Autowired
	private CorRegra corRegra;

	@Autowired
	private CorRepository corRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Cor cor, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cor/novo";

		}
		corRegra.salvar(cor);
		return "redirect:/cor/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Cor cor, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cor/visualizar";

		}
		corRegra.salvar(cor);
		return "redirect:/cor/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("cors", corRegra.dadosGrid());
		return "cor/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cors", corRepository.findAll());
		return "cor/novo";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("cor", corRepository.findById(codigo).get());
		return "cor/visualizar";
	}
	
	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		corRepository.deleteById(codigo);
		return "redirect:/cor/listar";
	}
}
