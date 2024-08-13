package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.model.usuario;
import com.crud.repository.UsuariosRepository;

@Controller
@RequestMapping("/usuarios") // http: localhost:8080/usuarios
public class usuarioController {

	private final Logger log = LoggerFactory.getLogger(usuario.class);

	@Autowired
	private UsuariosRepository usuariosRepository;

	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("usuarios", usuariosRepository.findAll());

		return "home";
	}

	@GetMapping("/create") // http:localhost:8080/usuarios/create
	public String create() {
		return "create";

	}

	@PostMapping("/save")
	public String save(usuario usuario) {
		log.info("Informacion del objeto usuario {}", usuario);
		usuariosRepository.save(usuario);
		return "redirect:/usuarios";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		usuario u = usuariosRepository.getOne(id);
		log.info("Objeto recuperado {}", u);
		model.addAttribute("usuario", u);
		return "edit";

	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		usuario u = usuariosRepository.getOne(id);
		log.info("Objeto eliminado {}", u);
		usuariosRepository.delete(u);
		return "redirect:/usuarios";
	}
	

}
