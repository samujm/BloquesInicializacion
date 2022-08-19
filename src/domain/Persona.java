package domain;

public class Persona {

    //SE MANDAN A LLAMAR ANTES DEL CONSTRUCTOR DE LA CLASE
    private final int idPersona;
    private static int contadorPersonas;

    /*---------------------- BLOQUE DE INICIALIZACIÓN ESTATICO: Se ejecuta antes del constructor y antes de cualquiero bloque de inicialización NO estatico  ---------------------*/
    /*Solo se ejecuta la primera vez que se carga en memoria, solo 1 vez*/
    static {//No se destruye
        System.out.println("Ejecución bloque estatico");
        //Se inicializan variables SOLO estaticas
        ++Persona.contadorPersonas;
        // idPersona = 10; //NO ES ESTATICA, NO SE PUEDE INICIALIZAR
    }

    /*---------------------- BLOQUE DE INICIALIZACIÓN NO ESTATICO: Se ejecuta antes del constructor de la clase  -------------------------------------*/
    /*Se ejecuta cada que se crea un nuevo objeto de la clase*/
    {//Se destruye por que es dinamico
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;//Asigna y despues suma
    }
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    

}
