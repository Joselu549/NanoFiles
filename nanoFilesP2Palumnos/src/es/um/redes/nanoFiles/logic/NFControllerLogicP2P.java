package es.um.redes.nanoFiles.logic;

import java.net.InetSocketAddress;



import es.um.redes.nanoFiles.util.FileInfo;

public class NFControllerLogicP2P {
  /*
   * TODO: Se necesita un atributo NFServer que actuará como servidor de ficheros de este peer
   */



  protected NFControllerLogicP2P() {}

  /**
   * Método para ejecutar un servidor de ficheros en segundo plano. Debe arrancar el servidor en un
   * nuevo hilo creado a tal efecto.
   * 
   * @return Verdadero si se ha arrancado en un nuevo hilo con el servidor de ficheros, y está a la
   *         escucha en un puerto, falso en caso contrario.
   * 
   */
  protected boolean startFileServer() {
    /*
     * TODO: Comprobar que no existe ya un objeto NFServer previamente creado, en cuyo caso el
     * servidor ya está en marcha. Si no lo está, crear objeto servidor NFServer y arrancarlo en
     * segundo plano creando un nuevo hilo. Finalmente, comprobar que el servidor está escuchando en
     * un puerto válido (>0) e imprimir mensaje informando sobre el puerto, y devolver verdadero.
     * Las excepciones que puedan lanzarse deben ser capturadas y tratadas en este método. Si se
     * produce una excepción de entrada/salida (error del que no es posible recuperarse), se debe
     * informar sin abortar el programa
     */



    return false;
  }

  /**
   * Método para descargar un fichero del peer servidor de ficheros
   * 
   * @param serverAddressList La lista de direcciones de los servidores a los que se conectará
   * @param targetFileNameSubstring Subcadena del nombre del fichero a descargar
   * @param localFileName Nombre con el que se guardará el fichero descargado
   */
  protected boolean downloadFileFromServers(InetSocketAddress[] serverAddressList,
      String targetFileNameSubstring, String localFileName) {
    boolean downloaded = false;

    if (serverAddressList.length == 0) {
      System.err.println("* Cannot start download - No list of server addresses provided");
      return false;
    }
    /*
     * TODO: Crear un objeto NFConnector para establecer la conexión con cada servidor de ficheros,
     * y usarlo para descargar un trozo (chunk) del fichero mediante su método "downloadFileChunk".
     * Se debe comprobar previamente si ya existe un fichero con el mismo nombre en esta máquina, en
     * cuyo caso se informa y no se realiza la descarga. Si todo va bien, imprimir mensaje
     * informando de que se ha completado la descarga. Las excepciones que puedan lanzarse deben ser
     * capturadas y tratadas en este método. Si se produce una excepción de entrada/salida (error
     * del que no es posible recuperarse), se debe informar sin abortar el programa
     */



    return downloaded;
  }

  /**
   * Método para obtener el puerto de escucha de nuestro servidor de ficheros
   * 
   * @return El puerto en el que escucha el servidor, o 0 en caso de error.
   */
  protected int getServerPort() {
    int port = 0;
    /*
     * TODO: Devolver el puerto de escucha de nuestro servidor de ficheros
     */



    return port;
  }

  /**
   * Método para detener nuestro servidor de ficheros en segundo plano
   * 
   */
  protected void stopFileServer() {
    /*
     * TODO: (FuncOpcional) Enviar señal para detener nuestro servidor de ficheros en segundo plano
     */



  }

  protected boolean serving() {
    boolean result = false;



    return result;

  }

  protected boolean uploadFileToServer(FileInfo matchingFile, String uploadToServer) {
    boolean result = false;



    return result;
  }

}
