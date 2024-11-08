package lapin;


public class rabbit{
    private int age;
    private boolean alive;
    private boolean sex;    // false == male, true == female
    private double rateofliving;
    

    public int uniform(int a , int b){
        int x = (int) Math.round( Math.random() * (b - a) );
        System.out.println("uniform " + x);
        return x;
    }
    public rabbit(){
        age = 0;
        alive = true;
        setSex(0);
        setrate(age);
    }
    public rabbit(int s){
        age = 0;
        alive = true;
        setSex(s);
        setrate(age);
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
    public void whatSex(){
        if (sex == true){
            System.out.println("it's a rabbit girl");
        }
        else{
            System.out.println("It's a rabbit boy");
        }
    }
    public void setSex(int genre){
        if (genre == 1){
            sex = true;
        }
        else{
            sex = false;
        }
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
    public void veillissement(){
        setAge(age + 1);
    }
}