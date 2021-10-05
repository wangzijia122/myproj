package cn.pistonint.tw.exchangelement;

import cn.pistonint.tw.demo04.printArr.printArr;
import cn.pistonint.tw.demo04.printArr.calculator;

public class exchelement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        printArr.printArray(arr);
        System.out.println("=====================");
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        printArr.printArray(arr);
        System.out.println("=====================");
        calculator calt = new calculator();
        System.out.println("平均值为："+calt.arrAvg(arr));
        System.out.println("求和为："+calt.arrSum(arr));
    }
}