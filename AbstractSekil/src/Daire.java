public class Daire extends Sekil {
    
    private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alanı = " + (yaricap * yaricap * Math.PI));
    }

    @Override
    void cevreHesapla() {
        System.out.println(getIsim() +  "çevresi = " + (2 * Math.PI * yaricap));
    }
    
    
}
