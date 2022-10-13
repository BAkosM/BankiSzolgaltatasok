public class Szamla extends BankiSzolgaltatas{
    private int aktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }
    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }
    public void befizet(int osszeg){
        this.aktualisEgyenleg =+ osszeg;
    }
    public boolean kivesz(int osszeg){
        if (osszeg > this.aktualisEgyenleg){
            return false;
        } else {
            this.aktualisEgyenleg =- osszeg;
            return true;
        }
    }
    public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos(),Szamla.this,kartyaszam);
    }
}
