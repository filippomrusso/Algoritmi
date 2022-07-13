public class Insertion_sort {

    public static void main(String[] args) {

        int[] carte = {4,6,3,10,5};
        int key;

        for(int i = 1; i < carte.length; i++){
            key = carte[i];                     // Seleziona il numero da riordinare
            int j = i-1;                        // Indice dell'elemento precedente al numero da riordinare

            while((j>=0)&&(carte[j]>key)){
                carte[j+1] = carte[j];          // Shifting a destra dell elemento maggiore
                j = j-1;
                carte[j+1] = key;               //
            }
        }

        for(int i = 0; i<carte.length; i++){
            System.out.println(carte[i]);
        }

    }

}
