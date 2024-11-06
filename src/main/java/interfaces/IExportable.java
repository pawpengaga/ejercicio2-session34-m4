package interfaces;

import exceptions.GenerarArchivoException;

public interface IExportable {

  public void exportarDatos(String rutaDestino) throws GenerarArchivoException;

}
