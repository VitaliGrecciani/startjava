public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String equipment;
    private String energyCore;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт.");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов.");
    }

    public String toString() {
        return "Jaeger{ "
                + "modelName:'" + this.modelName + '\''
                + ", mark: " + this.mark
                + ", origin: " + this.origin
                + ", equipment: " + this.equipment
                + ", energyCore: " + this.energyCore
                + ", height: " + this.height + 'm'
                + ", weight: " + this.weight + "Tons"
                + ", speed: " + this.speed
                + ", armor: " + this.armor
                + '}';
    }
}