package cn.pistonint.tw.demo06;

public class Phone1 {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand+","+one.price+","+one.color);
        System.out.println("===================");
        one.brand = "苹果";
        one.price = 8848;
        one.color = "高端黑";
        System.out.println(one.brand+","+one.price+","+one.color);
        System.out.println("===================");
        one.call("何居居");
        one.sendMessage();
    }
}
