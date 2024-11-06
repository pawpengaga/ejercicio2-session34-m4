package interfaces;

import java.util.Collection;

import models.Operario;


public interface IOperario extends CRUD<Operario> {

  public Collection<Operario> leerPorNombre(String nombre);

}
