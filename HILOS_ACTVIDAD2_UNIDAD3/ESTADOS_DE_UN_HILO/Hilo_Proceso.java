package clases;

public class Hilo_Proceso extends Thread {//se hereda de la clase que java ofrece Thread

    @Override//permite editar el metodo (polimorfismo)
    public void run() {//metodo  que ya incluye la clase Thread
        for (int i = 0; i <= 5; i++) {//estructura repetitiva 
            System.out.println(i + " " + getName());//se imprime solo el valor de i
            
            try{//es necesario encerrar con esta sentencia el Estado sleep
            Hilo_Proceso.sleep(1000);//Pausa el hilo por 1 segudno estado BLOQUEADO
            }catch(InterruptedException e){//atrapa el error
                System.out.println("Error dentro de la clase " + e);//Para saber el error 
            }
        }
    }
}
