package views;

import exceptions.GenerarArchivoException;
import models.Maquina;
import models.Operario;
import models.Producto;
import services.MaquinaService;
import services.OperarioService;
import services.ProductoService;

public class FabricaApp {

  public static void main(String[] args) throws GenerarArchivoException {

    System.out.println("---------------------------------------------------------------\n");

    OperarioService operarioService = new OperarioService();
    MaquinaService maquinaService = new MaquinaService();
    ProductoService productoService = new ProductoService();

    operarioService.crear(new Operario(9999, "Ana Banana"));
    maquinaService.crear(new Maquina(545645, "Toshiba 2TB"));
    productoService.crear(new Producto(10000, "CD de musica", maquinaService.leer(545645), operarioService.leer(9999)));

    productoService.exportarDatos("ejercicio2/hola.csv");
    
  }

}
