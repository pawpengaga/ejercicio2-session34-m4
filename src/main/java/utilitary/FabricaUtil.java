package utilitary;

import java.util.Collection;

public class FabricaUtil {

  public static <T> void listarServicios(Collection<T> servicio_in){
    servicio_in.forEach(System.out::println);
  }

}