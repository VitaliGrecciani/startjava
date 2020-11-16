public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Striker Eureka", "Mark-5", "Australia", "TY/Escape Hatch", "XIG Supercell Chamber", 76.2f, 1.850f, 10, 9);
        System.out.println(jaegerOne);
        jaegerOne.drift();
        jaegerOne.move();

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", "Piston", "Midnight Orb 9", 76.2f, 1.722f, 9, 6);
        System.out.println(jaegerTwo);
        jaegerTwo.drift();
        jaegerTwo.move();
    }
}