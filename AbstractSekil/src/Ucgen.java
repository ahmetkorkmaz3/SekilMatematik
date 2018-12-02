public class Ucgen extends Sekil {
    
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(int kenar1, int kenar2, int kenar3, String isim) {
        super(isim);
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    void alanHesapla() {
        double u = (kenar1 + kenar2 + kenar3) / 2.0;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println(getIsim() + " alanı = " + alan);
    }

    @Override
    void cevreHesapla() {
        System.out.println(getIsim() + " çevresi = " + (kenar1 + kenar2 + kenar3));
    }
    
    
    
}
