/*
Elver Iram Jiménez Rodríguez A01196327
Luis Mario de Leija Piñón         A01410385
Luis  Montiel Rocha                 A01410588
Pablo Serrano Hernandez        A01410753
Rubén Daniel Baez Muñíz        A01411504
*/
package spp.pkg404teamnotfound.p2.problema4;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        double promedio =promedio();
            System.out.println("El promedio de esta matriz es: "+promedio);
        valorMax();
        valorMen();
        sumaDiagonal();
        sumaDebajo();
        sumaEncima();
    }
    public static double promedio(){
     double promedio;
     int suma=0,cont=0;
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=0;i<matrix.length;i++){
              for(int j=0; j<matrix[i].length;j++){
                suma=suma+matrix[i][j];
                cont++;
        }
    }
    
    promedio =suma/cont;
        return promedio;    
    }
    
    public static void valorMax(){
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        int mayor=matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(mayor<matrix[i][j]){
                    mayor=matrix[i][j];
                }
            }
        }
        System.out.println("El mayor es: "+mayor);
    }
    
    public static void valorMen(){
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,5,12},
                                 {16,15,14,13}};
        int menor=matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(menor>matrix[i][j]){
                    menor=matrix[i][j];
                }
            }
        }
        System.out.println("El menor es: "+menor);
    }
    
    public static void sumaDiagonal(){
     int suma=0;
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=0;i<matrix.length;i++){
            suma=suma+matrix[i][i];
        }
        System.out.println("La suma de la diagonal es: "+suma);
    }
    
    public static void sumaDebajo(){
        int suma=0;
        int[][] matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                suma =suma+matrix[i][j];
            }
            
        }System.out.println("La suma de los números debajo de la diagonal es: "+suma);
    }
    
    public static void sumaEncima(){
        int suma=0;
        int[][] matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for(int j=0;j<matrix.length;j++){
            for(int i=j-1;i>=0;i--){
                suma=suma+matrix[i][j];
            }
        }
        System.out.println("La suma de los números sobre la diagonal es: "+suma);
    }
}