package models;

public class Operario {

  private long idOperario;
   private String nombreOperario;

  public Operario(long idOperario, String nombreOperario) {
    this.idOperario = idOperario;
    this.nombreOperario = nombreOperario;
  }

  public long getIdOperario() {
    return this.idOperario;
  }

  public void setIdOperario(long idOperario) {
    this.idOperario = idOperario;
  }

  public String getNombreOperario() {
    return this.nombreOperario;
  }

  public void setNombreOperario(String nombreOperario) {
    this.nombreOperario = nombreOperario;
  }

  @Override
  public String toString() {
    return "{" +
      " idOperario='" + getIdOperario() + "'" +
      ", nombreOperario='" + getNombreOperario() + "'" +
      " }";
  }

}
