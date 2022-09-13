package course07.exercises.ex3;

public class Cat implements Animal {

    @Override
    public String walk() {
        return "Cat-walking";
    }

    @Override
    public String talk() {
        return "Cat talks: 'meow! meow!'";

    }

    @Override
    public String eat() {
        return "Cat is eating mice";
    }
}
