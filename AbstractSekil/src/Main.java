
public class Main {

    public static void main(String[] args) {
        
        Sekil kare = new Kare(5, "Kare");
        Sekil daire = new Daire(3, "Daire");
        Sekil ucgen = new Ucgen(3, 4, 5, "Üçgen");
        
        kare.alanHesapla();
        kare.cevreHesapla();
        
        daire.alanHesapla();
        daire.cevreHesapla();
        
        ucgen.alanHesapla();
        ucgen.cevreHesapla();
        
    }
    
}
