import lapin.*;



public class Central{
    private static rabbit rab[]={};
    public static void main(String[] argv){
        System.out.println("coucou");

        lapinfemale rabi = new lapinfemale() ;
        //rab[0] = rabi;
        afficher(rabi);
        rabi.veillissement();
        int r = rabi.getAge();
        System.out.println(r);
        rabi.genelitter();
        update(rabi.getCompteur());
        System.out.println(rabi.getCompteur());
    }
    private static void afficher(rabbit rab){
        System.out.println(rab.getAge());
        System.out.println(rab.isAlive());
        if (rab.isAlive()){
            System.out.println("Il est vivant");
        }
        else{
            System.out.println("Il est mort");
        }
        rab.whatSex();
    }
    private static void update(int x){
        for(int i = 0; i < x; i++){
            rab[i] = new rabbit();
        }
    }

    private void killrabbit(){
        
    }
}