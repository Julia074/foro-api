package foro.alura.api.controller;

import foro.alura.api.Usuario.DatosRegistroUsuario;
import foro.alura.api.Usuario.Usuario;
import foro.alura.api.Usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/Usuarios")
    public class UsuarioController {

        @Autowired
        private UsuarioRepository usuarioRepository;
        @PostMapping
        public void RegistroUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario){
            usuarioRepository.save(new Usuario(datosRegistroUsuario));
        }
    }

