public class HitelSzamla extends Szamla{
    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
    public int getHitelKeret() {
        return hitelKeret;
    }
    @Override
    public boolean kivesz(int osszeg){
        if (osszeg > getAktualisEgyenleg()+this.hitelKeret){
            return false;
        } else {
            befizet(-osszeg);
            return true;
        }
    }
}
