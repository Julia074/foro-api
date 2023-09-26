package foro.alura.api.Respuestas;

import foro.alura.api.Curso.Curso;
import foro.alura.api.topico.Topico;

import java.time.LocalDateTime;

public record DatosRespuestas(String mensaje, Curso curso, Topico topico,
                              LocalDateTime fechaCreacion ) {
}
