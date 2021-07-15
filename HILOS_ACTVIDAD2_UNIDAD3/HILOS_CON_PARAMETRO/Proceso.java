package clases;
//proceso a ejecutar
public class Proceso extends Thread{//se hereda de la clase que java ofrece Thread
    
    int num_int;//valor que tomara en el parametro(variable global)
    
    public Proceso(String NombreHilo){
        super(NombreHilo);     
    }
    
    @Override//permite editar el metodo (polimorfismo)
    public void run(){//metodo  que ya incluye la clase Thread
        for(int i = 0; i <= num_int; i++){//estructura repetitiva con el parametro num_int
            System.out.println(i + this.getName());
        }
        System.out.println("");//salto de linea
    }
    
    public void ValorDeLaCondicion(int valor){//recibe el valor atravez de 
        this.num_int = valor;// se retorna el valor
    }
    
}
