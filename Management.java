import java.util.ArrayList;
import java.util.List;

public class Management {
    private final List<Animal> animals;

    public Management() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printMovableAnimals() {
        for (Animal animal : animals) {
            if (animal.canSwim() || animal.canWalk()) {
                System.out.println("- " + animal.getName());
            }
        }
    }
}
