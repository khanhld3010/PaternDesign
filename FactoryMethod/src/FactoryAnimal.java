public class FactoryAnimal {
    public static Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
