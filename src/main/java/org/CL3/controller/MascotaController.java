package org.CL3.controller;

import org.CL3.model.Mascota;
import org.CL3.repository.IMascotaRepository;
import org.CL3.repository.ITipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {

	@Autowired
	private IMascotaRepository mascotaRepo;
	@Autowired
	private ITipoRepository tipoRepo;

	@GetMapping("/mascota/cargar")
	public String cargarMascota(Model model) {
		model.addAttribute("mascota", new Mascota());
		model.addAttribute("tipos", tipoRepo.findAll());
		return "registro_Zacarias_Perez";
	}

	@PostMapping("/mascota/guardar")
	public String guardar(@ModelAttribute Mascota mascota, Model model) {

		mascotaRepo.save(mascota);
		model.addAttribute("comboTipo", tipoRepo.findAll());
		model.addAttribute("correcto", "inserción correctamente");
		return "registro_Zacarias_Perez";

	}

}
