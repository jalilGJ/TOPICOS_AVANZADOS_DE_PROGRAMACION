package clases;
//Hilo basico segunda opcion para crear
public class Proceso2 implements Runnable {//le agreagamos a nuestra la clase el implements de la interface RUNNABLE

    @Override///permite editar el metodo (polimorfismo)
    public void run() {// se hace uso del metodo Ran por defecto
        for (int i = 0; i <= 5; i++) {//mientras i sea menor o igual a 5
            System.out.println("Cargando 2");//si se cumple la condicion se imprime el mensaje proceso 1
        }
    }

}

