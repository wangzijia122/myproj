package cn.pistonint.tw.demo06;

public class Phone2 {
    public static void main(String[] args) {
        Phone two = new Phone();
        two.brand = "三星";
        two.price = 8888;
        two.color = "极夜黑";

        method(two);
    }

    public static void method(Phone param) {
        System.out.println(param.brand+","+param.price+","+param.color);
    }
}
