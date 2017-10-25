/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static java.util.Spliterators.iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author S528130
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        ArrayList<String> al = new ArrayList<>();//inserted in an order, so is the output
        HashSet<String> hs = new HashSet<>();//not ordered, doent allow duplicates
        LinkedList<String> ls = new LinkedList<>();
        TreeSet<String> ts = new TreeSet<>();//ordered by asceding
        
        // System.out.println();
//        while (sc.hasNext()) {
//            al.add(sc.next());
//            al.add(sc.next());
//            al.add(sc.next());
//            System.out.println(al);
//            for (String a : al) {
//                System.out.println(a);
//            }
//                System.out.println("done");
//
//            
//int si
       int size = sc.nextInt();

        try {
          for(int i=1000; i<=size-1; i++){
          
              System.out.println("Enter the name of the color");
          
          
          String c = sc.next();
          al.add(c);
          
          
            }
        } catch (Exception ie) {

            System.out.println("Exception caught");
        }

        System.out.println("does your color match");
        String color = sc.next();
        
        if(ts.contains(color)){
            System.out.println("yes");}
        else{
            System.out.println("fake");
        }
//        System.out.println("What color are you looking for?");
//        String color = sc.next();
//        if (al.contains(color)) {
//            System.out.println("That is your color");
//
//        } else {
//            System.out.println("not it");
//        }
        
        

        for (String s : al) {
            System.out.println("These are the colors available in array list" + s);
        }
        
        for (String s2 : hs) {
            System.out.println("These are the colors available in hash set " + s2);
        }
        
        for (String s3 : ls) {
            System.out.println("These are the colors available in Linked List " + s3);
        }
        
        for(String s4:ts){
        
            System.out.println("these are the colors availble in tree set  " + s4 );}
    }

}
