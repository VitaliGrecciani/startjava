public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfFirst = new Wolf();
        
        wolfFirst.setNickName("Kex");
        wolfFirst.setSex("female");
        wolfFirst.setAge(5);
        wolfFirst.setWeight(40);
        wolfFirst.setColour("white");
        System.out.println("nickName = " + wolfFirst.getNickName);
        System.out.println("sex = " + wolfFirst.getSex);
        System.out.println("age = " + wolfFirst.getAge);
        System.out.println("weight = " + wolfFirst.getWeight);
        System.out.println("colour = " + wolfFirst.getColour);
        System.out.println(wolfFirst.hunt());
        
        wolfFirst.go();
        wolfFirst.sit();
        wolfFirst.howl();
        wolfFirst.run();
        System.out.println("");
    }
}