public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();

        int[] arreglo = {5,7,30,12,9};
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        System.out.println("Arreglo ordenado en orden ascendente:");
        metodosOrdenamiento.printArreglo(arregloOrdenado);

        int[] arregloOrdenadoDesc = metodosOrdenamiento.sortByBubbleDesc(arreglo);
        System.out.println("Arreglo ordenado en orden descendente:");
        metodosOrdenamiento.printArreglo(arregloOrdenadoDesc);

        //ORDENARA LAS PALABARAS ALFABETICAMENTE DE LA CADEAN DE TEXTO
        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArreglo(palabrasOrdenadas);

    }
}
  