public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        obj.setName("Suraj");
        obj.getName();
//        obj.name="Suraj";
//        name has private access in RWOnly
//        System.out.println(name);
    }
}