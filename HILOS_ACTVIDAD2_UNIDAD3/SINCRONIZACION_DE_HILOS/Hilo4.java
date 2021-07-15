package hilos;

public class Hilo4 extends Thread {//se hereda de la clase que java ofrece Thread

    @Override//permite editar el metodo (polimorfismo)
    public void run() {//metodo  que ya incluye la clase Thread
        for (int i = 0; i <= 5; i++) {
            System.out.println("K");//parte a imprimir para la sincronizacion con salto de linea
            
            try {//es necesario encerrar con esta sentencia el Estado sleep
                Hilo4.sleep(1000);//Pausa el hilo por 1 segudno 
            } catch (InterruptedException e) {//atrapa el error
                System.out.println("Error en la clase Hilo4 " + e);
            }
        }
    }

}
