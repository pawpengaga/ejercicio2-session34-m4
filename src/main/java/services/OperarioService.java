package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.IOperario;
import models.Operario;

public class OperarioService implements IOperario {

  private Map<Long, Operario> operarios = new HashMap<>();

  @Override
  public void crear(Operario operario) {
    if(operarios.containsKey(operario.getIdOperario())){
      System.out.println("El operario ya existe...");
    } else {
      operarios.put(operario.getIdOperario(), operario);
      System.out.println("Operario registrado con exito!");
    }
  }

  @Override
  public Operario leer(long id) {
    Operario operarioBuscado = operarios.get(id);
    if (operarioBuscado == null) {
      System.out.println("El operario que busca no existe...");
      return null;
    }
    return operarioBuscado;
  }

  @Override
  public void actualizar(Operario operario) {
    Operario nuevoOperario = operarios.get(operario.getIdOperario());
    if (nuevoOperario == null) {
      System.out.println("El operario que busca editar no existe...");
    } else {
      operarios.put(operario.getIdOperario(), operario);
    }

  }

  @Override
  public void eliminar(long id) {
    if(operarios.containsKey(id)){
      operarios.remove(id);
      System.out.println("Operario ELIMINADO exitosamente!!");
    } else {
      System.out.println("El ID del operario que busca no figura en nuestra base de datos...");
    }
  }

  @Override
  public Collection<Operario> listarObjeto() {
    return operarios.values();
  }

  

}
