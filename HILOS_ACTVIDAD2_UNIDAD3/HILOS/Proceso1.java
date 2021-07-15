package clases;
//Hilo basico primera opcion para crear
public class Proceso1 extends Thread{//se hereda de la clase que java ofrece Thread
    
    @Override//permite editar el metodo (polimorfismo)
    public void run(){//metodo  que ya incluye la clase Thread
        for(int i = 0; i <= 5; i++){//mientras i sea menor o igual a 5 
            System.out.println("Cargando 1");//si se cumple la condicion se imprime el mensaje proceso 1
        }
    }
}
