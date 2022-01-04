package lab2;

public class Human {
    private int age;
    private double weight;
    private double height;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return gender.equalsIgnoreCase("Male");
    }
}
