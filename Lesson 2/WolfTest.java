public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfFirst = new Wolf();
        System.out.println("nickName = " + wolfFirst.nickName);
        System.out.println("sex = " + wolfFirst.sex);
        System.out.println("age = " + wolfFirst.age);
        System.out.println("weight = " + wolfFirst.weight);
        System.out.println("color = " + wolfFirst.color);
        System.out.println(wolfFirst.hunt());
        wolfFirst.go();
        wolfFirst.sit();
        wolfFirst.howl();
        wolfFirst.run();
        System.out.println("");
    }
}