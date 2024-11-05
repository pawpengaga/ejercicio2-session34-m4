package models;

public class Maquina {

  private long idMaquina;
  private String modeloMaquina;

  public Maquina(long idMaquina, String modeloMaquina) {
    this.idMaquina = idMaquina;
    this.modeloMaquina = modeloMaquina;
  }

  public long getIdMaquina() {
    return this.idMaquina;
  }

  public void setIdMaquina(long idMaquina) {
    this.idMaquina = idMaquina;
  }

  public String getModeloMaquina() {
    return this.modeloMaquina;
  }

  public void setModeloMaquina(String modeloMaquina) {
    this.modeloMaquina = modeloMaquina;
  }

  @Override
  public String toString() {
    return "{" +
      " idMaquina='" + getIdMaquina() + "'" +
      ", modeloMaquina='" + getModeloMaquina() + "'" +
      " }";
  }


}
