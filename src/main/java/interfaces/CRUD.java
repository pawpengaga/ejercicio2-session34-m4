package interfaces;

import java.util.Collection;

public interface CRUD<T> {

  public void crear(T objeto);
  public T leer(long id);
  public void actualizar(T objeto);
  public void eliminar(long id);
  public Collection<T> listarObjeto();

}
