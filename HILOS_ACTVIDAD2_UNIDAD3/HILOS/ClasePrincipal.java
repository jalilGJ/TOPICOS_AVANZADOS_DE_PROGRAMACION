package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        Proceso1 M_Hilo1= new Proceso1();//se instancia de esta manera cuando se utiliza la herencia 
        Thread hilo2 = new Thread(new Proceso2());//se instancia desde la clase Thread
        //la clase que ofrece java, se intancia de esta manera, ya que se utiliza implements Runnable 
        //en el parametro seva a especificar dentro de que clase va a buscar el proceso a realizar        
    //se cran primeramente los objetos posteriormente se ejecutan   
        
        M_Hilo1.start();//metodo para que empiece a ejecutar los hilos
        hilo2.start();//metodo para que empiece a ejecutar los hilos
        
    }
}
