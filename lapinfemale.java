

public class lapinfemale{
    private int litterThisYear;
    private int kittens = 0;
    private static int compteurlap = 0;
    private int age ;
    private boolean alive;
    private double rateofliving;

    public int uniform(int a , int b){
        int x = (int) Math.round( Math.random() * (b - a) );
        System.out.println("uniform " + x);
        return x;
    }

    private void newlitter(){
        litterThisYear = litterThisYear + 1;
        int v = uniform(3,6);
        kittens = kittens +  v;
        compteurlap = compteurlap + v;
    }
    public void genelitter(){
        if(isAlive()){
        if (getAge() >= 1){
            int nblitter = uniform(3,9);
            for (int i =0; i<nblitter; i++){
                newlitter();
            }
        }
        }
    }
    public int getLitterTY(){
        return litterThisYear;
    }
    public int getkittens(){
        return kittens;
    }
    public void setkittens(int i){
        kittens = i;
    }
    public lapinfemale(){
        age = 0;
        alive = true;
        setrate(age);
        litterThisYear = 0;
        kittens = 0;
    }
    public int getCompteur(){
        return compteurlap;
    }
    public void isDead(){
        compteurlap = compteurlap - 1;
    }



    public int getAge(){
        return age;
    }
    public void setAge(int age1){
        age = age1;
    }
    public boolean isAlive(){
        return alive;
    }
    public void setAlive(boolean rip){
        alive = rip;
    }
    public void setrate(int age1){
        if (age < 1){
            rateofliving = 0.35;
        }
        else{
            if (age < 10){
                rateofliving = 0.60;
            }
            else{
                rateofliving = rateofliving - 0.10;
            }
        }
        
    }
    public double getrateliv(){
            return rateofliving;
    }
    public void veillissement(){
        setAge(age + 1);
    }
}