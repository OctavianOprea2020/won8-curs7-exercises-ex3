package course07.exercises.ex3;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "Duck-walking'";
    }

    @Override
    public String talk() {
        return "Duck talks: 'quack! quack!'";
    }

    @Override
    public String eat() {
        return "Duck is eating wheat";
    }
}
