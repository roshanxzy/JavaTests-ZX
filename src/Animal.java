public class Animal {
    public void callme() {
        System.out.println("In call me of Animal");
    }

    public void callanimal() {
        System.out.println("I am an animal.");
    }

    public static void teach(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; //Down-casting
            dog.callme();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; //Down-casting
            cat.callme();
        }
    }

    public static class Dog extends Animal {
        public void callme() {
            System.out.println("Woof Woof");
        }
    }

    public static class Cat extends Animal {
        public void callme() {
            System.out.println("Meow Meow");
        }
    }

    public static void main(String[] args) {
        // Up-casting.
        Dog dog = new Dog(); //Declare
        Animal animal1 = (Animal) dog; //Up-casting
        animal1.callme(); //Still use the instance/object's method
        animal1.callanimal(); //Can also use the super type's method
        /*
        Up-casting because Animal is the supertype of Dog
        , this casting is called up-casting.
         */

        Animal animal2 = new Dog(); //Up-casting
        animal2.callme(); //Still use the instance/object's method
        animal2.callanimal(); //Can also use the super type's method
        /*
        Another type of up-casting;
        The up-casting makes sub-type able to use methods written for super types.

        So: the reference is important, because it directly links an instance to the
        reference class's methods.
         */

        // Down-casting.
        Animal animal3 = new Dog(); //Up-casting
        Dog dog1 = (Dog) animal3; //Down-casting
        dog1.callme();
        /*
        The compiler sees that animal3 is actually a Dog, so the casting is successful
         */

        // Wrong down-casting.
        /*
        Dog dog2 = new Animal();
        Animal is not necessarily a dog
        Will not compile
         */


        Animal animal4 = new Animal();
        //Dog dog2 = (Dog) animal4;
        /*
        Compiled but with ClassCastException
        The compiler sees that animal4 is not really a Dog but an Animal
        */

        Animal animalD = new Dog();
        Animal animalC = new Cat();

        Animal.teach(animalC);


    }
}
