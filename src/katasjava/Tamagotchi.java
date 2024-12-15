package katasjava;

public class Tamagotchi {
    private int hunger = 1;
    private int energy = 2;
    private int mood = 4;

    public String play() {
        hunger++;
        mood++;
        energy--;
        return getStatus();
    }

    public String eat() {
        hunger -= 2;
        energy--;
        return getStatus();
    }

    public String sleep() {
        energy += 2;
        return "(-_-) zZZ";
    }

    private String getStatus() {
        if (mood > 8) return ":-)";
        if (energy < 3) return "(-_-)";
        if (mood < 2) return "ఠ_ఠ";
        return ":-|";
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println(pet.play());
        System.out.println(pet.eat());
        System.out.println(pet.sleep());
    }
}




