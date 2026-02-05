public class PetShop {

    public static void main(String[] args) {

        // create pets
        Pet pet1 = new Pet("Buddy", 3, "Dog");
        Pet pet2 = new Pet("Luna", 5, "Cat");
        Pet pet3 = new Pet("Tweety", 1, "Bird");

        // make them speak
        pet1.speak();
        pet2.speak();
        pet3.speak();

        // birthday
        pet1.haveBirthday();
        System.out.println(pet1.getName() + " is now " + pet1.getAge() + " years old.");
    }
}
