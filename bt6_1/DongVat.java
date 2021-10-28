package SDetPro.bt6_1;

import java.security.SecureRandom;

public class DongVat {
    private String animalName;
    private int randomSpeed;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt();
    }
}
