package lapin;

public class lapinfemale extends rabbit{
    private int litterThisYear;
    private int kittens;

    private void newlitter(MersenneTwister m){
        litterThisYear = litterThisYear + 1;
        kittens = kittens + m.next(1);
    }
    public void genelitter(){
        MersenneTwister m = new MersenneTwister(1025);
        int nblitter = uniform(3,9);
        for (int i =0; i<nblitter; i++){
            newlitter(m);
        }
    }
    public int getLitterTY(){
        return litterThisYear;
    }
    public int getkittens(){
        return kittens;
    }
    public lapinfemale(){
        super.lapin(1);
        litterThisYear = 0;
        kittens = 0;
    }
    
    
}