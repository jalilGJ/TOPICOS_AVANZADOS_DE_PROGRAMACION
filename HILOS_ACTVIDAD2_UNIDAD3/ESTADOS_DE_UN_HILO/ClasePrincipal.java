package clases;
//estados de los hilos
public class ClasePrincipal {
    public static void main(String[] args) {
        //Hilo NUEVO o en estado NEW
        Hilo_Proceso hilo1 = new Hilo_Proceso();//se instancia de esta manera cuando se utiliza la herencia 
        Hilo_Proceso hilo2 = new Hilo_Proceso();//se instancia de esta manera cuando se utiliza la herencia 
        
        //Hilo en estado EJECUTABLE O RUNNABLE
        hilo1.start();//metodo para que empiece a ejecutar los hilos
        
        //Hilo en estado BLOQUEADO o no RUNNABLE
        try{//es necesario poner la sentencia try catch
        hilo1.sleep(1000);//bloquea el hilo por 1 segundos
        }catch(InterruptedException e){//Para atrapar un error en comun
            System.out.println("Error en el hilo1 " + e);
        }
        
        hilo2.start();
        
        //Hilo en estado MUERTO causado
        hilo2.stop();//muerte causada
        
        try{//es necesario poner la sentencia try catch
        hilo2.sleep(1000);//bloquea el hilo por un segundo
        } catch (InterruptedException e) {//Para atrapar un error en comun
            System.out.println("Error en el hilo 2 " + e);
        }
    }
}
