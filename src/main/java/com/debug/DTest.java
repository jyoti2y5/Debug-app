package com.debug;

public class DTest {
    public static void main(String[] args) {
        System.out.println("Welcome to my Debug Application");
        int marks[]={87,67,97,45,88};
        int finalSum =grandSum(marks);
        System.out.println("Final Sum: "+finalSum);
        if(finalSum==297){
            System.out.println("please Concentrate and Remove error");
        }else{
            System.out.println("Congratulations! No error in your Code");
        }
    }
    public static int grandSum(int arr[]){
        int sum=0;
        for(int i=1; i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
