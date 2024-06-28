
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Pasaje {
    
    private int idPasaje;
    private Pasajeros pasajero;
    private Ruta ruta;
    private Colectivos colectivo;
    private LocalDate fechaViaje;
    private LocalTime horaViaje;
    private int asiento;
    private double precio;

    public Pasaje(int idPasaje, Pasajeros Pasajero, Ruta Ruta, Colectivos colectivo, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio, boolean estado) {
        this.idPasaje = idPasaje;
        this.pasajero = Pasajero;
        this.ruta = Ruta;
        this.colectivo = colectivo;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje(Pasajeros Pasajero, Ruta Ruta, Colectivos colectivo, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio, boolean estado) {
        this.pasajero = Pasajero;
        this.ruta = Ruta;
        this.colectivo = colectivo;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje() {
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Pasajeros getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajeros pasajero) {
        this.pasajero = pasajero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta Ruta) {
        this.ruta = Ruta;
    }

    public Colectivos getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivos colectivo) {
        this.colectivo = colectivo;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public LocalTime getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(LocalTime horaViaje) {
        this.horaViaje = horaViaje;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID Pasaje= " + idPasaje + ", Pasajero= " + pasajero.getApellido() + " " + pasajero.getNombre() + ", Ruta= " + ruta.getOrigen() + " - " + ruta.getDestino() + ",Colectivo= " + colectivo.getMatricula() + ", Fecha Viaje= " + fechaViaje + ", Hora Viaje= " + horaViaje + ", Asiento= " + asiento + ", Precio= " + precio;
    }

}
