public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public boolean canWalk() {
        return false;
    }

    public boolean canSwim() {
        return false;
    }

    public String getName() {
        return name;
    }
}
