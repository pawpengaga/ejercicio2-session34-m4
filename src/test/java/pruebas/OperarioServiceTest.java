package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Operario;
import services.OperarioService;

public class OperarioServiceTest {

  private OperarioService operarioService;

  @BeforeEach
  public void setUp(){
    operarioService = new OperarioService();
    Operario op = new Operario(1, "Ana Banana");
    operarioService.crear(op);
  }

  @AfterEach
  public void clean(){
    operarioService.eliminar(1);
  }

  @Test
  @DisplayName("Prueba metodo crear")
  public void testcrearOperario(){
    // Nos aseguramos que por dentro todo funcione
    assertEquals(1, operarioService.listarObjeto().size());
    assertEquals("Ana Banana", operarioService.leer(1).getNombreOperario());
    
    System.out.println("EL TEST HA PASADO CORRECTAMENTE");
  }

  @Test
  @DisplayName("Verificamos un updateo")
  public void testActualizarOperario(){

    Operario opActual = new Operario(1, "Maria Sandia");
    operarioService.actualizar(opActual);

    assertEquals("Maria Sandia", operarioService.leer(1).getNombreOperario());

    System.out.println("Actualizacion pasada!!");

  }

  @Test
  @DisplayName("Verificamos una eliminacion")
  public void testEliminarOperario(){
    operarioService.eliminar(1);
    assertNull(operarioService.leer(1));

    System.out.println("Eliminacion pasada!!");
  }

}
