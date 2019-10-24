package com.company;

public class CopyArrayForLoop {
    public static void main(String[] args){
        int[] sourceArray={1,2,3,4,5,6};
        System.out.println(sourceArray[0]);
        System.out.println(sourceArray);
        int[] targetArray=new int[sourceArray.length];
        for(int i=0;i<sourceArray.length;i++){
            targetArray[i]=sourceArray[i];
        }
        System.out.println(sourceArray);
        System.out.println("Hello world");
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println(targetArray);

    }
}
