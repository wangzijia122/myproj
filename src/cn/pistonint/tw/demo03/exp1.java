package cn.pistonint.tw.demo03;
import java.util.*;

public class exp1 {
    public static void main(String[] args){
        HashMap h2=new HashMap();
        for(int i=0;i<10;i++)
            h2.put(new Element(i), new Figureout()); //把1到10的哈希值作为key(下标), 调用Figureout方法存放对应的随机值
        System.out.println("h2:");
        System.out.println("Get the result for Element:");
        Element test=new Element(5);  //获取5的哈希值
        if(h2.containsKey(test)) //如果5的哈希值存在于hashmap的key组里
            System.out.println(h2.get(test)); //则输出5的哈希值对应的随机值
        else
            System.out.println("Not found");
    }
}

class Element{
    int number;
    public Element(int n){
        number=n;
    }
    public int hashCode(){
        return number;
    }
    public boolean equals(Object o){  //判断值与哈希值的原值是否相等
        return (o instanceof Element) && (number==((Element)o).number);
    }
}

class Figureout{
    Random r=new Random();
    boolean possible=r.nextDouble()>0.5;
    public String toString(){
        if(possible)
            return "OK!";
        else
            return "Impossible!";
    }
}