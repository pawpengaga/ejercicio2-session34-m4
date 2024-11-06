package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.IExportable;
import interfaces.IProducto;
import models.Producto;

public class ProductoService implements IProducto, IExportable<Producto> {

  private Map<Long, Producto> productos = new HashMap<>();

  /***************** METODOS PROPIOS *****************/
  
  @Override
  public void exportarDatos(Producto claseServicio, String rutaDestino) {
  }
  
  @Override
  public void getOperarioProducto() {
  }
  
  @Override
  public void getMaquinaProducto() {
  }

  /***************** CRUD GENERAL *****************/
  
  @Override
  public void crear(Producto producto) {
  }

  @Override
  public Producto leer(long id) {
    return null;
  }

  @Override
  public void actualizar(Producto producto) {
  }

  @Override
  public void eliminar(long id) {
  }

  @Override
  public Collection<Producto> listarObjeto() {
    return null;
  }



}
