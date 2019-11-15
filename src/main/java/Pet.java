/**
 * Zwierzątko
 */
public class Pet {
    /**
     * Imię
     */
    private String name;

    /**
     * Waga
     */
    private double weight;

    /**
     * Wysokość
     */
    private double height;

    /**
     * Wiek
     */
    private int age;

    /**
     * @return Wiek zwierzątka
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age Ustawia wiek zwierzątka
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return Wysokość zwierzątka
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height Ustawia wysokość zwierzątka w metrach
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return Waga zwierzątka
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight Ustawia wagę zwierzątka
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return Imię zwierzątka
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Ustawia imię zwierzątka
     */
    public void setName(String name) {
            this.name = name;
    }

    /**
     * Metoda symylująca spanie zwierzątka
     * @param time czas snu w godzinach
     */
    public void sleep(double time){
        this.weight = this.weight - this.weight * 0.1 * time;
        this.height = this.height + this.height * 0.05 * time;
    }

    public void feed(double weight){
        this.weight = this.weight + weight;
    }

    public double getBMI(){
        return this.weight / (this.height * this.height);
    }
}
