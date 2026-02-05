public class Pet {

    // private fields (encapsulation)
    private String name;
    private int age;
    private String type;

    // constructor
    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public void speak() {
        String sound = "";

        if (type.equalsIgnoreCase("Dog")) {
            sound = "Woof!";
        } else if (type.equalsIgnoreCase("Cat")) {
            sound = "Meow!";
        } else if (type.equalsIgnoreCase("Bird")) {
            sound = "Chirp!";
        }

        System.out.println(name + " (" + type + ", " + age + " years old) says: " + sound);
    }

    public void haveBirthday() {
        age++;
        System.out.println("\n" + name + " had a birthday!");
    }
}
