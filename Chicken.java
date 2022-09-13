package course07.exercises.ex3;

public class Chicken implements Animal{
    @Override
    public String walk() {
        return "Chicken-walking";
    }

    @Override
    public String talk() {
        return "Chicken talks: 'cluck! cluck!'";
    }

    @Override
    public String eat() {
        return "Chicken is eating corn";
    }
}
