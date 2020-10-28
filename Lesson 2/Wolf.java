public class Wolf {
        private String nickName = "Rex";
        private String sex = "Male";
        private String colour = "black";
        private int age = 7;
        private int weight = 42;
        
        public String getNickName() {
            return nickName;
        }
        
        public void setNickName(String nickName) {
            this.nickName = nickName;
        }
        
        public String getSex() {
            return sex;
        }
        
        public void setSex(String sex) {
            this.sex = sex;
        }
        
        public String getColour() {
            return colour;
        }
        
        public void setColour(String colour) {
            this.colour = colour;
        }

        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            if (age > 8) {
                System.out.println("Некорректный возраст");
            }
            else {
                this.age = age;
            }
        }
        
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        
        public boolean hunt() {
            System.out.println("Hare hunting");
            return true;
        }

        public void go() {
            System.out.println("Max speed 7 km/h");
        }

        public void sit() {
            System.out.println("When tired");
        }

        public void howl() {
            System.out.println("howling at the moon");
        }

        public void run() {
            System.out.println("Max speed 50 km/h");
        }
}

