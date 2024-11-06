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
    if(productos.containsKey(producto.getNumSerie())){
      System.out.println("El producto ya existe...");
    } else {
      productos.put(producto.getNumSerie(), producto);
      System.out.println("Producto registrado con exito!");
    }
  }

  @Override
  public Producto leer(long id) {
    Producto productoBuscado = productos.get(id);
    if (productoBuscado == null) {
      System.out.println("El producto que busca no existe....");
      return null;
    }
    return productoBuscado;
  }

  @Override
  public void actualizar(Producto producto) {
    Producto nuevoProducto = productos.get(producto.getNumSerie());
    if (nuevoProducto == null) {
      System.out.println("El producto que busca editar no existe...");
    } else {
      productos.put(producto.getNumSerie(), producto);
    }
  }

  @Override
  public void eliminar(long id) {
    if(productos.containsKey(id)){
      productos.remove(id);
      System.out.println("Producto ELIMINADO exitosamente!!");
    } else {
      System.out.println("El ID del producto que busca no figura en nuestra base de datos...");
    }
  }

  @Override
  public Collection<Producto> listarObjeto() {
    return productos.values();
  }



}
