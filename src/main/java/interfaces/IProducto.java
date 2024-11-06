package interfaces;

import models.Maquina;
import models.Operario;

// import java.util.List;
// import models.Operario;

import models.Producto;

public interface IProducto extends CRUD<Producto> {

  // public List<Producto> getProductosByOperario(Operario op);
  public Operario getOperarioProducto(Producto prod);
  public Maquina getMaquinaProducto(Producto prod);

  /*
   * IDEAS:
   * Listar la maquina y el operario desde aqui
   * No se ya se me olvido
   */

}
