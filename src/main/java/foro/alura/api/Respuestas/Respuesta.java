package foro.alura.api.Respuestas;
import foro.alura.api.Usuario.Usuario;
import foro.alura.api.topico.Topico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "respuestas")
@Entity(name = "Respuesta")
public class Respuesta {
    @Id
    private Long id;
    private String mensaje;
    @ManyToOne(optional = false)
    @JoinColumn(name ="topico",referencedColumnName = "id")
    private Topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    @ManyToOne(optional = false)
    @JoinColumn(name ="autor",referencedColumnName = "id")
    private Usuario autor;
    private Boolean solucion = false;


    public Respuesta(DatosRespuestas respuestas) {
        this.mensaje = respuestas.mensaje();
        this.topico = respuestas.topico();
        this.fechaCreacion = respuestas.fechaCreacion();


    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Respuesta other = (Respuesta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}