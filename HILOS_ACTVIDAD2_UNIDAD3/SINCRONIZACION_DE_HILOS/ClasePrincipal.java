package hilos;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        Hilo1 hilo1 = new Hilo1();//se instancia de esta manera cuando se utiliza la herencia 
        Hilo2 hilo2 = new Hilo2();//se instancia de esta manera cuando se utiliza la herencia 
        Hilo3 hilo3 = new Hilo3();//se instancia de esta manera cuando se utiliza la herencia 
        Hilo4 hilo4 = new Hilo4();//se instancia de esta manera cuando se utiliza la herencia 
        
        //Hilo1
        hilo1.start();//metodo para que empiece a ejecutar los hilos
        try {
            hilo1.sleep(10);//Pausa el hilo 
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        }
        
        //Hilo2
        hilo2.start();//metodo para que empiece a ejecutar los hilos
        try {
            hilo2.sleep(10);//Pausa el hilo por 10 milisegundos para poder realizar la sincronizacion
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
        
        //Hilo3
        hilo3.start();//metodo para que empiece a ejecutar los hilos
        try {
            hilo3.sleep(10);//Pausa el hilo por 10 milisegundos para poder realizar la sincronizacion
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3 " + e);
        }
        
        //Hilo4
        hilo4.start();//metodo para que empiece a ejecutar los hilos
        try {
            hilo4.sleep(10);//Pausa el hilo por 10 milisegundos para poder realizar la sincronizacion
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4 " + e);
        }
    }
    
}
