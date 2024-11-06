package interfaces;

// import java.util.List;
// import models.Operario;

import models.Producto;

public interface IProducto extends CRUD<Producto> {

  // public List<Producto> getProductosByOperario(Operario op);
  public void getOperarioProducto();
  public void getMaquinaProducto();

  /*
   * IDEAS:
   * Listar la maquina y el operario desde aqui
   * No se ya se me olvido
   */

}
