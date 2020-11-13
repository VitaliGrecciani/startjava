public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setEquipment("TY/Escape Hatch");
        jaegerOne.setEnergyCore("XIG Supercell Chamber");
        jaegerOne.setHeight(76.2f);
        jaegerOne.setWeight(1.850f);
        jaegerOne.setSpeed(10);
        jaegerOne.setArmor(9);
        System.out.println(jaegerOne);
        jaegerOne.drift();
        jaegerOne.move();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Crimson Typhoon");
        jaegerTwo.setMark("Mark-4");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setEquipment("Piston");
        jaegerTwo.setEnergyCore("Midnight Orb 9");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.722f);
        jaegerTwo.setSpeed(9);
        jaegerTwo.setArmor(6);
        System.out.println(jaegerTwo);
        jaegerTwo.drift();
        jaegerTwo.move();
    }
}