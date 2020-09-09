package com.company;

import java.util.Random;

public class Main {



    //Задача с циклами
    public static void main(String[] args) {

        Random rand = new Random();


        int sum =0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
        }
        for(int  i: arr){
            sum= sum+ i;

        }
        System.out.println("for");
        System.out.println(sum);
        int counter = 0;
        sum=0;
        System.out.println("while");
        while(counter<9){
            counter++;
            sum = sum+arr[counter];

        }

        sum =0;
        counter =0;
        do
        {
            counter++;
            sum= sum+arr[counter];
        } while(counter<9);
        System.out.println("do while");
        System.out.println(sum);

    }



    //Задача с гармоническим рядом
    static void grm(int n) {

        double i, summ = 0.0;
        for (i = 1; i < n; i++) {

            System.out.println(1/i);
            summ = summ + 1 / i;

        }
        System.out.println(summ);
    }



    //Сортировка
    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int a = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < a) {
                i++;
            }

            while (array[j] > a) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    static void sort(){
        Random rand = new Random();
        int[] arr = new int[10];
        int low= 0;
        int high = arr.length-1;
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Отсортированый массив:");
        quickSort(arr,low,high);
        for(int i:arr){
            System.out.println(i);
        }
    }


    //Задача с факториалом
    static void Fact(int n){
        int fact = 1;
        for (int i = 1; i <=n; i ++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
