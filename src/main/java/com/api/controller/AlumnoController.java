package com.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.entity.Alumno;
import com.api.repository.ARepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

	@Autowired
	private ARepository arepository;
	
	
	// Creo al Alumno
	@PostMapping("/crear")
	public Alumno crear(@RequestBody Alumno alumno ) {
		
		
		return arepository.save(alumno);
	}
	
	// listo los Alumnos que estan en la BBDD	
	@GetMapping("/listar")
	public List<Alumno> listarAlumnos(){
		
		return arepository.findAll();
	}
	
	
	// Elimino Alumnos
	@DeleteMapping("/eliminar/{id}")
	public boolean eliminar(@PathVariable() Long id) {
		
	arepository.deleteById(id);
	
	return true;
	}
	
	// edito un Alumno
	@PutMapping("/editar/{id}")
	public ResponseEntity<Alumno> editar(@PathVariable(value = "id") Long id, @RequestBody Alumno alumno) {
		
		Alumno alum = arepository.findById(id).
				orElseThrow();
		
		
		alum.setNombre(alumno.getNombre());
		alum.setApellido(alumno.getApellido());
		alum.setMateria(alumno.getMateria());
		alum.setNota_final(alumno.getNota_final());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(arepository.save(alum));
	}
	
	
	
	
}
