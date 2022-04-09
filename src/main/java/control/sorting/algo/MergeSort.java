/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.sorting.algo;

/**
 *
 * @author Ian C. Cabrera
 */
public class MergeSort implements Sort {
    

    @Override
    public void sort(int[] list) {
        if (list.length < 2) {
            return;
        }
        
        int[] firstList = new int[list.length / 2];
        int[] secondList = new int[list.length - firstList.length];


        /* Populate first half */
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = list[i];
        }
        /* Populate second half */
        for (int i = firstList.length; i < list.length; i++) {
            secondList[i - firstList.length] = list[i];
        }
        
        this.sort(firstList);
        this.sort(secondList);
        
        this.merge(list, firstList, secondList);
    }
    
    private void merge(int[] list, int[] firstList, int[] secondList) {
        int firstIndex = 0,
            secondIndex = 0,
            listIndex = 0;
        
        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            list[listIndex++] = firstList[firstIndex] <= secondList[secondIndex]
                ? firstList[firstIndex++]
                : secondList[secondIndex++];
        }
        
        
        while(firstIndex < firstList.length) {
            list[listIndex++] = firstList[firstIndex++];
        }
        
        while(secondIndex < secondList.length) {
            list[listIndex++] = secondList[secondIndex++];
        }
    }
    
}
