package services;

import java.io.FileWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exceptions.GenerarArchivoException;
import interfaces.IExportable;
import interfaces.IProducto;
import models.Maquina;
import models.Operario;
import models.Producto;

public class ProductoService implements IProducto, IExportable {

  private Map<Long, Producto> productos = new HashMap<>();

  /***************** METODOS PROPIOS *****************/
  
  @Override
  public void exportarDatos(String rutaDestino) throws GenerarArchivoException {
    try (FileWriter writer = new FileWriter(rutaDestino)) {

      writer.append("Producto, Maquina a cargo, Empleado a cargo\n");
      for (Map.Entry<Long, Producto> producto : productos.entrySet()) {

        Producto prodi = producto.getValue();
        writer.append(prodi.getNombreProducto() + ", ")
        .append(prodi.getMFabricante().getModeloMaquina() + ", ")
        .append(prodi.getOSupervisor().getNombreOperario() + "\n");
      }

      System.out.println("****************");
      System.out.println("ARCHIVO GENERADO");
      System.out.println("****************");
      
    } catch (Exception e) {
      throw new GenerarArchivoException("Error al generar archivo: " + e.getMessage());
    }
  }
  

  // METODOS PARA NADA NECESARIOS BORRAR DESPUES
  @Override
  public Operario getOperarioProducto(Producto prod) {
    Operario operarioActual = prod.getOSupervisor();
    return operarioActual;
  }
  
  @Override
  public Maquina getMaquinaProducto(Producto prod) {
    Maquina maquinaActual = prod.getMFabricante();
    return maquinaActual;
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
