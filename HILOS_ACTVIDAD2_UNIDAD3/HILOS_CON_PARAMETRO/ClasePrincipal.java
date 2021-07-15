package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo1");//se instancia de esta manera cuando se utiliza la herencia 
        Proceso hilo2 = new Proceso(" Hilo2");//se instancia de esta manera cuando se utiliza la herencia 
        Proceso hilo3 = new Proceso(" Hilo3");//se instancia de esta manera cuando se utiliza la herencia 
        
        hilo1.ValorDeLaCondicion(5);//se usa el metodo que resive los valores con parametros
        hilo2.ValorDeLaCondicion(10);//se le asigna un valor para el hilo 
        hilo3.ValorDeLaCondicion(5);
        
        hilo1.start();//metodo para que empiece a ejecutar los hilos
        hilo2.start();//metodo para que empieza a ejecutar los hilos
        hilo3.start();//metodo para que empieza a ejecutar los hilos
    }
    
}
