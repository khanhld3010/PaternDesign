public class FactoryDemo {
    static void main(String[] args) {
        Animal a1 = FactoryAnimal.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = FactoryAnimal.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
