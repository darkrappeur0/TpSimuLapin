

public class rabfemale{
    private int litterThisYear;
    private int kittens = 0;
    private int age ;
    private boolean alive;
    private double rateofliving;

    public rabfemale(){
        age = 0;
        alive = true;
        setrate(age);
        litterThisYear = 0;
        kittens = 0;
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

    public int uniform(int a , int b){
        int x = (int) Math.round( Math.random() * (b - a)  + a);
        return x;
    }
    public int uniformlitter(int a, int b){
        int x =  (int)Math.round( (Math.random() * (b - a)  + a ) * 0.5 );
        return x;
    }

    private void newlitter(){
        litterThisYear = litterThisYear + 1;
        int v = uniformlitter(3,6 );
        kittens = kittens +  v;
    }

    public void genelitter(){
        boolean verif = true;
        while( (isAlive()) && (verif) ){
            if (getAge() >= 1){
                int nblitter = uniform(3,9);
                for (int i =0; i<nblitter; i++){
                    newlitter();
                    killrabbit2();
                    
                }
                verif = false;
            }
            else{
                verif = false;
            }
        }
    }

    public void upAge(){
        age=age+1;
    }

    private void killrabbit2(){
          double r = Math.random();
            if (0.9 > r){
                   setAlive(true);
            }
            else{
                setAlive(false);
            }
        
    }



    public int getLitterTY(){
        return litterThisYear;
    }
    public int getkittens(){
        return kittens;
    }
    public int getAge(){
        return age;
    }
    public boolean isAlive(){
        return alive;
    }
    public double getrateliv(){
        return rateofliving;
    }



    public void setkittens(int i){
        kittens = i;
    }
    public void setAlive(boolean a){
        alive = a;
    }
    
    
}