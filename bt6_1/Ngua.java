package SDetPro.bt6_1;

import java.security.SecureRandom;

public class Ngua extends DongVat {
    private int randomSpeed;

    @Override
    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt(75);
    }
}
