package com.example.review;

public class ArrayOperations {
    
    public static void main(String args[]){

        //int a;
        //a=10;

        //int[] a=new int[5];
        //a[0]=10;
        //int[] a={11,34,56,78,32};


        //String nom;
        String[] nom=new String[3];

        for(int x=0; x<nom.length; x++){
            nom[x] = "Juan";
        }
        for(int x=0; x<nom.length; x++){
            System.out.println(nom[x]);
        }
        for(String n:nom){
            System.out.println(n);
        }
        String[] names = new String[3]; //apunta a null
        //String names[] = new String[3]; //crea 3 espacios de memoria vacios 
                                          //luego apunta anull
        
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";
        
        int[] numbers = {100, 200, 300};
        
        for (String name:names){
           System.out.println("Name: " + name); 
        }
        
        for (int number:numbers){
           System.out.println("Number: " + number); 
        }           
    }
}
