package com.goit.gojavaonline;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Random;

public class SearchMaksMinElement {

    public static void main(String... args) {

        Random rndm = new Random();
        int[]box = new int[15];
        for (int i = 0;i<box.length; i++)
          box[i] = rndm.nextInt(200);
        System.out.print("chisla vashego masiva: ");
        for (int element:box)
            System.out.print(element + ",");
    {
        int min = box[0];
        for (int element:box) {
            if (min > element)
                min = element;
        }
        System.out.println("  Minimalnoe chislo " + min);
    } //ostavil takoy variant,chtobi ne zabivat chto imenno uprowaet element
        int max = box[0];
        for (int i = 0;i<box.length; i++)
        {
            if( max < box[i])
            max= box [i];
        }
        System.out.println("Maksimolnoe chislo "+max);


        Arrays.sort(box);
        System.out.print("sortirovka: ");
        for (int element: box){
            System.out.print(element+",");
        }

    }
}