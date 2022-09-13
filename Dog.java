package course07.exercises.ex3;

public class Dog implements Animal {
    @Override
    public String walk() {
        return "Dog-walking";
    }

    @Override
    public String talk() {
        return "Dog talks: 'woof! woof!'";
    }

    @Override
    public String eat() {
        return "Dog is eating bones";
    }
}
