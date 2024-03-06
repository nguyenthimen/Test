/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NebulaF
 */
public class calculator {
    boolean check(String s){

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
    public String subtract(String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            int int_a = Integer.parseInt(a);            
            int int_b = Integer.parseInt(b);
            String s = String.valueOf(int_a - int_b);
            return s;
        }
    }
}
