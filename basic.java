/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaproject;

/**
 *
 * @author ayse0
 */
public class Javaproject {

    public static void main(String[] args) {
        System.out.println("merhaba dünya");
        //unutmamak için not tutuyorum.
        System.out.println("ben ayse turan");
        
        int x = 10;
        int y;
        int ayse;
        ayse = 10;
        System.out.println("merhaba dünya "+ ayse );
        ayse = 20;
        System.out.println("merhaba dünya " + ayse );
        
        double pi=3.14;
        String s="benim ismim ayse";
        System.out.println("evet "+s +"pi: " +pi);
        System.out.println("pi :"+pi);

        double myDouble=9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
        
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the length of the txt string is:" +txt.length());  //length metin uzunluğunu verir
    
        String metin ="Hello World";
        System.out.println(metin.toUpperCase());  //hepsi büyük 
        System.out.println(metin.toLowerCase());   //hepsi küçük

        String a ="please locate where 'locate' occurs !";
        System.out.println(a.indexOf("locate"));  //locate dizesi kaçıncı
        
        String firstName = "john";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);  //boşluk 
        
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);
        
        String d = "10";
        int e = 20;
        String f = d + e;
        System.out.println(f);  //int ve string ise ikisini string gibi düşünür
        
        int g = 10;
        int h = 9;
        System.out.println( g>h );
        
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!"); }
        else {
            System.out.println("Not old enough to vote.");
            }  
        
        int v =0;
        while(v<5){
            System.out.println(v);
         v++;
         }
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); 
        
              
    }
}
