public class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    private String kartyaszam;
    public Kartya(Tulajdonos tulajdonos,Szamla szamla,String kartyaszam){
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaszam = kartyaszam;
    }
    public String getKartyaszam() {
        return kartyaszam;
    }
    public boolean vasarlas(int osszeg){
        if (osszeg > szamla.getAktualisEgyenleg()){
            return false;
        } else {
            return true;
        }
    }    
}
