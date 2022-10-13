public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public static double alapKamat;
    public MegtakaritasiSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
        this.kamat = alapKamat;
    }
    public double getKamat(){
        return kamat;
    }
    public void setKamat(double kamat){
        this.kamat = kamat;
    }
    @Override
    public boolean kivesz(int osszeg){
        if (osszeg > getAktualisEgyenleg()){
            return false;
        } else {
            return true;
        }
    }
    public void kamatJovairas(){
        befizet(getAktualisEgyenleg()*(int)kamat);;
    }
}
