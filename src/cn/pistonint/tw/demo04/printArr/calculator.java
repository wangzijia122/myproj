package cn.pistonint.tw.demo04.printArr;

public class calculator {
    public int arrSum(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }
    public int arrAvg(int[] Array) {
        int avg = arrSum(Array) / Array.length;
        return avg;
    }
}

