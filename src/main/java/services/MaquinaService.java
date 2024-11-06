package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.IMaquina;
import models.Maquina;


public class MaquinaService implements IMaquina {

  private Map<Long, Maquina> maquinas = new HashMap<>();

  @Override
  public void crear(Maquina maquina) {
    if(maquinas.containsKey(maquina.getIdMaquina())){
      System.out.println("La maquina ya existe...");
    } else {
      maquinas.put(maquina.getIdMaquina(), maquina);
      System.out.println("Maquina registrada con exito!");
    }
  }

  @Override
  public Maquina leer(long id) {
    Maquina maquinaBuscada = maquinas.get(id);
    if (maquinaBuscada == null) {
      System.out.println("La maquina que busca no existe...");
      return null;
    }
    return maquinaBuscada;

  }

  @Override
  public void actualizar(Maquina maquina) {
    Maquina nuevaMaquina = maquinas.get(maquina.getIdMaquina());
    if (nuevaMaquina == null) {
      System.out.println("La maquina que busca editar no existe...");
    } else {
      maquinas.put(maquina.getIdMaquina(), maquina);
    }


  }

  @Override
  public void eliminar(long id) {
    if(maquinas.containsKey(id)){
      maquinas.remove(id);
      System.out.println("Maquina ELIMINADA exitosamente!!");
    } else {
      System.out.println("El ID de la maquina que busca no figura en nuestra base de datos...");
    }
  }

  @Override
  public Collection<Maquina> listarObjeto() {
    return maquinas.values();
  }

}
