package com.example.aws.springbootdynamodbcrud.controller;

import com.example.aws.springbootdynamodbcrud.entity.Paciente;
import com.example.aws.springbootdynamodbcrud.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController 
{

    @Autowired
    private PacientesRepository pacienteRepository;

    @PostMapping
    public Paciente save(@RequestBody Paciente paciente)
    {
        return pacienteRepository.save(paciente);
    }

    @GetMapping("/{id}")
    public Paciente findById(@PathVariable(value = "id") String id)
    {
        return pacienteRepository.findById(id);
    }

    @GetMapping
    public List<Paciente> findAll()
    {
        return pacienteRepository.findAll();
    }

    @PutMapping("/{id}")
    public Paciente update(@PathVariable(value = "id") String id,
    @RequestBody Paciente paciente)
    {
        return pacienteRepository.update(id, paciente);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") String id)
    {
        return pacienteRepository.delete(id);
    }
}
