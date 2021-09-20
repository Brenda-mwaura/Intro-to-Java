/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        scan.close();
        System.out.println("Brenda");
        FirstClass JavaClass=new FirstClass();
       System.out.println( JavaClass.sum(a, b));
       System.out.println(JavaClass.product(9, 6));
       System.out.println(JavaClass.square(a));
       for(int i=0;i<=10;i++){
           if(i%2==0){
        System.out.println(i);
    }}
        // TODO code application logic here
    }
    
}
