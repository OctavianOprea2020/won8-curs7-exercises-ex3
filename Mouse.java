package course07.exercises.ex3;

public class Mouse implements Animal {
    @Override
    public String walk() {
        return "Mouse-walking";
    }

    @Override
    public String talk() {
        return "Mouse talking: 'squeak! squeak!'";
    }

    @Override
    public String eat() {
        return "Mouse is eating cheese";
    }
}
