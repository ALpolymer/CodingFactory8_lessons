package gr.aueb.cf.ch15;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        System.out.println("I am a cat!");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Type: Cat";
    }
}
