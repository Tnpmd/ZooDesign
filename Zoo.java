import java.util.ArrayList;
public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Singto jaaa"));
        animals.add(new Eagle("Pui jaaa"));
        animals.add(new Penguin("Uan jaaa"));
        animals.add(new Dolphin("Lomasichompu jaaa"));

        System.out.println("===== Animal sound =====\n");
        for (Animal animal : animals) {
            System.out.println(animal.getName() +  "  Say\t" + animal.makeSound()+"\n");
            System.out.println("----------------------------- \n");
        }

        System.out.println("\n==== Special Abilities ====\n");
        for (Animal animal : animals) {
            if (animal instanceof Flyable ) {
                Flyable f = (Flyable) animal;
                System.out.println(animal.getName() +  "\t" + f.fly()+"\n");
            System.out.println("----------------------------- \n");
            }
            if (animal instanceof Swimmable ) {
                Swimmable s = (Swimmable) animal;
                System.out.println(animal.getName() +  "\t" + s.swim()+"\n");
            System.out.println("----------------------------- \n");
            }
        }
    }
}
