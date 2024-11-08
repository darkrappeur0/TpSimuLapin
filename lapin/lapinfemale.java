package lapin;

public class lapinfemale extends rabbit{
    private int litterThisYear;
    private int kittens;
    private static int compteurlap;

    

    private void newlitter(){
        litterThisYear = litterThisYear + 1;
        int v = uniform(3,6);
        kittens = kittens +  v;
        compteurlap = compteurlap + v;
    }
    public void genelitter(){
        if (super.getAge() >= 1){
            int nblitter = uniform(3,9);
            for (int i =0; i<nblitter; i++){
                newlitter();
            }
        }
    }
    public int getLitterTY(){
        return litterThisYear;
    }
    public int getkittens(){
        return kittens;
    }
    public lapinfemale(){
        //super.rabbit(1);
        litterThisYear = 0;
        kittens = 0;
    }
    public int getCompteur(){
        return compteurlap;
    }
}