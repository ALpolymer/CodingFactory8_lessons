package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
        Animal rex = new Dog("Rex", 3);
        System.out.println(rex);
        rex.speak();
        System.out.println(rex.toString());

        Animal fifi = new Cat("Fifi", 5);

        fifi.speak();
        System.out.println(fifi.toString());

        Animal doe =  new Animal("Doe" , 4);
        doe.speak();
        System.out.println(doe.toString());

        Dog myDog = new Dog("Rex1", 5);
        Animal.doSpeak(myDog);
    }
}
