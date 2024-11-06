package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Producto {

  private long numSerie;
  private String nombreProducto;
  private String fechFabricacion; // Nos vamos a complicar la vida creando un formato para las fechas
  private Maquina mFabricante;
  private Operario oSupervisor;
  
  // Version del constructor sin datos externos para pruebas con fechas 
  public Producto(long numSerie, String nombreProducto) {
    this.numSerie = numSerie;
    this.nombreProducto = nombreProducto;
    this.fechFabricacion = formatearFecha();
  }
  
  // La fecha del producto siempre sera la fecha actual
  public Producto(long numSerie, String nombreProducto, Maquina mFabricante, Operario oSupervisor) {
    this.numSerie = numSerie;
    this.nombreProducto = nombreProducto;
    this.fechFabricacion = formatearFecha();
    this.mFabricante = mFabricante;
    this.oSupervisor = oSupervisor;
  }

  public long getNumSerie() {
    return this.numSerie;
  }

  public void setNumSerie(long numSerie) {
    this.numSerie = numSerie;
  }

  public String getNombreProducto() {
    return this.nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getFechFabricacion() {
    return this.fechFabricacion;
  }

  public void setFechFabricacion(String fechFabricacion) {
    this.fechFabricacion = fechFabricacion;
  }

  public Maquina getMFabricante() {
    return this.mFabricante;
  }

  public void setMFabricante(Maquina mFabricante) {
    this.mFabricante = mFabricante;
  }

  public Operario getOSupervisor() {
    return this.oSupervisor;
  }

  public void setOSupervisor(Operario oSupervisor) {
    this.oSupervisor = oSupervisor;
  }

  @Override
  public String toString() {
    return "{" +
      " numSerie='" + getNumSerie() + "'" +
      ", nombreProducto='" + getNombreProducto() + "'" +
      ", fechFabricacion='" + getFechFabricacion() + "'" +
      ", mFabricante='" + getMFabricante() + "'" +
      ", oSupervisor='" + getOSupervisor() + "'" +
      " }";
  }

  /************************ METODOS PRIVADOS ************************/

  private String formatearFecha(){
    LocalDateTime fechanueva = LocalDateTime.now();
    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String fechaFormateada = fechanueva.format(formateador);
    return fechaFormateada;
  }


}
