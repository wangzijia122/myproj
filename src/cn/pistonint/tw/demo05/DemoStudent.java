package cn.pistonint.tw.demo05;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("何大仙");
        stu.setAge(18);
        stu.setMale(false);

        System.out.println("姓名："+ stu.getName());
        System.out.println("年龄："+ stu.getAge());
        System.out.println("是男性吗："+ stu.isMale());
    }
}
