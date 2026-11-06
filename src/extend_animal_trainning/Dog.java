package extend_animal_trainning;

public class Dog extends Animal{

    public Dog (String name, int age){
        super(name,age);
    }
    public String makeSound(){
        return "woof woof";
    }
    public String toString(){
        return "Name: " +getName() +" Age: " +getAge() +" Sound: " +makeSound();
    }
}
