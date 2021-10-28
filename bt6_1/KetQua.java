package SDetPro.bt6_1;

public class KetQua {

    public static void main(String[] args) {
        SuTu suTu = new SuTu();
        Ngua ngua = new Ngua();
        Cho cho = new Cho();

        if(ngua.getRandomSpeed() > suTu.getRandomSpeed() && ngua.getRandomSpeed() > cho.getRandomSpeed()){
            System.out.println("Chien thang la " + ngua.getClass().getSimpleName() + ", voi van toc la " + ngua.getRandomSpeed());
        }else if (suTu.getRandomSpeed() > ngua.getRandomSpeed() && suTu.getRandomSpeed() > cho.getRandomSpeed()){
            System.out.println("Chien thang la " + suTu.getClass().getSimpleName() + ", voi van toc la " + suTu.getRandomSpeed());
        }else {
            System.out.println("Chien thang la " + cho.getClass().getSimpleName() + ", voi van toc la " + cho.getRandomSpeed());
        }
    }
}
