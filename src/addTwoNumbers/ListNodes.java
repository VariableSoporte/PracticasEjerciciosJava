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
public class ListNodes {

    public int val;
    public ListNodes next;

    public ListNodes() {
    }

    public ListNodes(int val) {
        this.val = val;
    }

    public ListNodes(int val, ListNodes next) {
        this.val = val;
        this.next = next;
    }
}
