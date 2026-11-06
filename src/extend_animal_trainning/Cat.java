package extend_animal_trainning;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name,age);
    }
    public String makeSound(){
        return "meow meow";
    }
    public String toString(){
        return "Name: " +getName() +" Age: " +getAge() +" Sound: " +makeSound();
    }
}
