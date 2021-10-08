package cn.pistonint.tw.demo06;

public class Phone3 {
    public static void main(String[] args) {
        Phone two = getPhone();
        two.brand = "苹果";
        two.price = 8848;
        two.color = "高端黑";
        System.out.println(two.brand+","+two.price+","+two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848;
        one.color = "高端黑";
        return one;
    }
}
