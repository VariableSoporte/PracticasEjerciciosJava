/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Luxor
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cant = 0;
        
        for (int i = 0; i < s.length() ; i++){
            for ( int j = i+1; j <= s.length() ; j++){
                String sub = s.substring(i, j);
                if (j < s.length() && sub.contains(String.valueOf(s.charAt(j)))){
                    cant = (cant < sub.length())? sub.length() : cant;
                    break;
                }else {
                    cant = (cant < sub.length())? sub.length() : cant;
                }
            }
        }
        return cant;
    }
}
