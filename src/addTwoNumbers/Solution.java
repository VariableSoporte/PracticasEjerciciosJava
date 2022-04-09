/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addTwoNumbers;

/**
 *
 * @author Luxor
 */
public class Solution {
    public ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
        ListNodes retorno = new ListNodes(0);
        int sobrante = 0;
        ListNodes sop = retorno;
        while (l1 != null || l2 != null){
            int numUno = (l1 != null ) ? l1.val : 0;
            int numDos = (l2 != null ) ? l2.val : 0;
            int suma = numUno + numDos + sobrante;
            sobrante = suma / 10;
            sop.next = new ListNodes(suma%10);
            sop = sop.next;
            if ( l1 != null )
                l1 = l1.next;
            if ( l2 != null )
                l2 = l2.next;
        }
        if ( sobrante > 0 ){
            sop.next = new ListNodes(sobrante);
        }
        return retorno.next;
    }


}
