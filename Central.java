import lapin.*;



public class Central{
    private static rabbit rab[];
    private static int compteur = 0 ;
    public static void main(String[] argv){
        System.out.println("coucou");
        lapinfemale rabi = new lapinfemale() ;
        compteur = compteur + 1;
        rab[0] = rabi;
        System.out.println("coucou");
        afficher(rabi);
        System.out.println("coucou");
        actuellisation(compteur);
        //System.out.println("coucou");
        //int r = rabi.getAge();
        //System.out.println(r);
        rabi.genelitter();
        int g = rabi.getCompteur();
        maj(g);
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

    private static void killrabbit(int x){
        for (int i =0; i<x;i++){
            double r = Math.random();
            if (rab[i].getrateliv() > r){
                rab[i].setAlive(true);
            }
            else{
                rab[i].setAlive(false);
                rabfree(i);
            }

        }
    }

    private static void rabfree(int g){
        rabbit rip = rab[g];
        rab[g] = null;
        decal_gauche();

    }

    private static void decal_gauche(){
        for(int i =0; i<compteur ; i++){
            if(rab[i] == null){
                if (rab[i + 1] != null ){
                    while ( rab[i + 1 ]!=null){
                        rab[i] = rab[i + 1];
                        i=i+1;
                    }
                }
            }
        }
    }

    private static void actuellisation(int x){
        for (int i = 0; i <x;i++ ){
            rab[i].veillissement();
        }
    }

    public int uniform(int a , int b){
        int x = (int) Math.round( Math.random() * (b - a) );
        System.out.println("uniform " + x);
        return x;
    }
    public static void maj(int x){
        compteur = compteur + x;
        update(x);
        System.out.println(x);
        killrabbit(x);
    }
}