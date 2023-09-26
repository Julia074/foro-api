package foro.alura.api.controller;

import foro.alura.api.topico.DatosRegistroTopic;
import foro.alura.api.topico.Topico;
import foro.alura.api.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void RegistroTopicos(@RequestBody DatosRegistroTopic DatosRegistroTopico){
        topicoRepository.save(new Topico(DatosRegistroTopico));
    }
}
