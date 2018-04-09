public class Animal {
    public void callme() {
        System.out.println("In call me of Animal");
    }

    public void callanimal() {
        System.out.println("I am an animal.");
    }

    public static class Dog extends Animal {
        public void callme() {
            System.out.println("In call me of Dog");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = (Animal) dog;
        animal.callme();
        /*
        Up-casting because Animal is the supertype of Dog
        , this casting is called up-casting.
         */

        Animal animal2 = new Dog();
        animal2.callme();
        animal2.callanimal();
        /*
        Another type of up-casting;
        The up-casting makes sub-type able to use methods written for parent class.

        So: the reference is important, because it directly links an instance to the
        reference class's methods.
         */
    }
}
