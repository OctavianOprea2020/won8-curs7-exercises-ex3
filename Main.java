package course07.exercises.ex3;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat.walk());
        System.out.println(myCat.talk());
        System.out.println(myCat.eat());

        Dog myDog = new Dog();
        System.out.println();
        System.out.println(myDog.walk());
        System.out.println(myDog.talk());
        System.out.println(myDog.eat());

        Mouse myMouse = new Mouse();
        System.out.println();
        System.out.println(myMouse.walk());
        System.out.println(myMouse.talk());
        System.out.println(myMouse.eat());

        Chicken myChicken = new Chicken();
        System.out.println();
        System.out.println(myChicken.walk());
        System.out.println(myChicken.talk());
        System.out.println(myChicken.eat());

        Duck myDuck = new Duck();
        System.out.println();
        System.out.println(myDuck.walk());
        System.out.println(myDuck.talk());
        System.out.println(myDuck.eat());
    }
}
