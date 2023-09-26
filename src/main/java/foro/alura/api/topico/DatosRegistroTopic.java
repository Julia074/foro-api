package foro.alura.api.topico;



import foro.alura.api.Curso.Curso;

import java.time.LocalDateTime;

public record DatosRegistroTopic(String titulo, String mensaje, String autor,
                                 Curso curso, StatusTopico status,
                                 LocalDateTime fechaCreacion, String Respuestas) {


}
