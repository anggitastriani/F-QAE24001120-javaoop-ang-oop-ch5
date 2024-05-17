package Tugas2B;

public class SuzukiKatana extends Car {
    String nama;
    String produsen;
    String jarakRoda;

    public void cetakNama(){
        System.out.println("Nama Mobil : " + nama);
    }

    public void cetakProdusen(){
        System.out.println("Produsen : " + produsen);
    }

    @Override
    public void cetakDimensi() {
        super.cetakDimensi();
        System.out.println("Jarak Sumbu Roda " + jarakRoda);
    }
}
