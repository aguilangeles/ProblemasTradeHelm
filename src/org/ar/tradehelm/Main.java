/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ar.tradehelm;

/**
 *
 * @author maria
 */
public class ProblemasTradeHelm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*==========================================================================================
         primer problema:
         ==========================================================================================*/

        Problem1 smallfrog = new Problem1();

        int solution = smallfrog.solution(10, 30, 85);

        System.out.println("la cantidad de saltos que deberá dar la rana es "
                + solution);

//       FIN DEL PRIMER PROBLEMA
        /*=========================================================================================
         Segundo problema
         ============================================================================*/
        int size = 4;

        Problem2 missedNumber = new Problem2(size);

        int[] numbers = missedNumber.getZeroIndex();

        System.out.println("Numeros en el array " + missedNumber.toString());

        int solution2 = missedNumber.solution(numbers, size);

        System.out.println("El número faltante es: " + solution2);

//        FIN DEL SEGUNDO PROBLEMA
    }

}
