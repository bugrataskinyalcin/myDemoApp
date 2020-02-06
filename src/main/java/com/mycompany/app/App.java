package com.mycompany.app;

import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
 public static boolean search(ArrayList<Integer> array,ArrayList<String> array2, int e,String s) {
        if (array == null|array2==null) return false;

        int x=0;
        int y=0;

        //calculate the number of e inside array
        for (int elt : array) {
            if (elt == e) x++;
        }

        //calculate the number of s inside array;
        for (String elt : array2) {
            if (elt.equals(s)) y++ ;
        }

        //return xy
        if(x==y) return true;
        else return false;
      }


}
