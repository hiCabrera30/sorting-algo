/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package control.sorting.algo;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author theon
 */
public class SortingAlgo {

    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int size = 10;
        Random random = new Random();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(size);
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Initializing sorting");
        
        sorter.sort(list);
        
        System.out.println(Arrays.toString(list));
        System.out.println("Sort completed");
    }
}
