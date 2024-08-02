
package entidades;

import java.time.LocalTime;
import java.util.Objects;


public class Horario {
    
    private int idHorario;
    private Ruta ruta;
    private LocalTime horaLLegada;
    private LocalTime horaSalida;
    private boolean estado;

    public Horario(Ruta ruta, LocalTime horaLLegada, LocalTime horaSalida, boolean estado) {
        this.ruta = ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario(int idHorarios, Ruta ruta, LocalTime horaLLegada, LocalTime horaSalida, boolean estado) {
        this.idHorarios = idHorarios;
        this.ruta = ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }
    

    public Horario(int idHorarios, Ruta Ruta, LocalTime horaSalida, boolean estado) {
        this.idHorario = idHorarios;
        this.ruta = Ruta;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario(Ruta Ruta, LocalTime horaSalida, boolean estado) {
        this.ruta = Ruta;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario() {
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorarios) {
        this.idHorario = idHorarios;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta Ruta) {
        this.ruta = Ruta;
    }

    public LocalTime getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(LocalTime horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    

    @Override
    public String toString() {
        if(idHorario != -1){
            return horaSalida + " - " + horaLLegada;
        }
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.horaLLegada);
        hash = 29 * hash + Objects.hashCode(this.horaSalida);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.horaLLegada, other.horaLLegada)) {
            return false;
        }
        return Objects.equals(this.horaSalida, other.horaSalida);
    }
    
    

}
