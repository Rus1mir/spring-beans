package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    @Qualifier("cat")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Timer getTimer() {
        return timer;
    }

    @Autowired
    public void setTimer(Timer timer) {
        this.timer = timer;
    }


}
