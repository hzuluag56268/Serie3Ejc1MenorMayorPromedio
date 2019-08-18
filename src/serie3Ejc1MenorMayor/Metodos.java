package serie3Ejc1MenorMayor;

public class Metodos {

    Nodo primerNumero;
    int tamano;
    int datoMayor, datoMenor, promedio;
    String datos;

    public Metodos() {
        primerNumero = null;
        tamano = 0;
        datoMayor = 0;
        datoMenor = 99999;
        datos = "";

    }

    public boolean sinDatos() {
        return primerNumero == null;
    }

    public void insertarNumero(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        nuevoNodo.siguiente = primerNumero;
        primerNumero = nuevoNodo;
        tamano++;
    }


    public void mostrarDatoMayor() {
        Nodo indice = primerNumero;
        while (indice != null) {
            if (indice.numero > datoMayor) {
                datoMayor = indice.numero;
            }
            indice = indice.siguiente;
        }
        System.out.println("El numero mayor es " + datoMayor + ".");
    }
    public void mostrarMenorValor(){
        Nodo indice = primerNumero;
        while(indice != null){
            if(indice.numero < datoMenor){
                datoMenor = indice.numero;
            }
            indice = indice.siguiente;

        }
        System.out.println("El numero menor es " + datoMenor + ".");
    }

    public void mostrarTodo() {
        Nodo recolector = primerNumero;
        while (recolector != null) {
            datos += recolector.numero + ", ";
            recolector = recolector.siguiente;
        }
        System.out.println(datos);
        datos = "";
    }
    public void promedio(){
        Nodo apuntador = primerNumero;
        int sumatoria = 0;
        while(apuntador != null){
            sumatoria += apuntador.numero;
            apuntador = apuntador.siguiente;
        }
        System.out.println("El promedio es " + sumatoria / tamano + ".");
    }
}
