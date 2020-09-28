public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("Возраст больше двадцати");
        }

        boolean itsMale = true;
        if (itsMale){
            System.out.println("Мужчина");
        }

        if(!itsMale){
            System.out.println("Женщина");
        }

        double height = 1.00;
        if (height < 1.80) {
            System.out.println("Рост меньше  1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char firstLetter = 'Z';
        if (firstLetter == 'М') {
            System.out.println("The name probably Michail");
        } else if (firstLetter == 'И') {
            System.out.println("The name probably Ivan");
        } else {
            System.out.println("The name can probably be anything");
        }
    }
}