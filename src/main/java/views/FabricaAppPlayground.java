package views;

import models.Producto;

public class FabricaAppPlayground {
  public static void main(String[] args) {

    System.out.println("------------------------------------------------------------------\n");

    Producto prod = new Producto(23333, "Cd de musica");
    System.out.println(prod);
  
  }
}
