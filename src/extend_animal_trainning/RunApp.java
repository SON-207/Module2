package extend_animal_trainning;

public class RunApp {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];

        animal[0] = new Dog("Cun",1);
        animal[1] = new Cat("meo",3);

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].toString());
        }
    }
}
