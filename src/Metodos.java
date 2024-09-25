public class Metodos {


    public Metodos(){
        System.out.println("Se creo la clase metodo");
    }

    public int [] sortByBubble(int[] arreglo){

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo [i] = arreglo[j];
                    arreglo [j] = aux;
                    
                }
                
            }
            
        }
        return arreglo;
    }

    public int[] sortByBubbleDesc(int[] arreglo) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }

    public String [] sortByBubblePalabras(String[] palabras){

        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j])>0) {
                    String aux = palabras[i];
                    palabras [i] = palabras[j];
                    palabras [j] = aux;
                    
                }
                
            }
            
        }
        return palabras;
    }


    public void printArreglo(int[] arreglo){  //este for es un breach 
        for (int elemento : arreglo){ 
            System.out.print( " "+ elemento);
        }
        System.out.println("");
    }
    public void printArreglo(String[] arreglo){  //este for es un breach 
        for (String elemento : arreglo){ 
            System.out.print( " "+ elemento);
        }
    }
}

