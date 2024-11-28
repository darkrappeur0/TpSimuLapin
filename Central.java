



public class Central{
    private static lapinfemale[] rab;
    private static int compteur = 0 ;
    private static int n = 100000;
    public static void main(String[] argv){
        int x = 100;
        System.out.println("début de l'initialisation avec" + x +" lapin");
        
        compteur = x;
        int f = 0;
        while (f<10){
            System.out.println("début de la simulation :");
            f=f+1;
            System.out.println("année : " + f);
            rab = new lapinfemale[n];
            
        
        for(int i =0;i<compteur;i++){
            lapinfemale rab_i = new lapinfemale() ;
            rab[i] = rab_i;
        }
        System.out.println("fin de l'initialisation");

        //System.out.println("début de l'affichage des lapin");
        for(int i = 0;i<compteur;i++){
            afficher(rab[i]);
            System.out.println(i);
        }
        //System.out.println("fin de l'affichage des lapin");
        //System.out.println("début de la selection naturelle");
        //killrabbit(compteur);

        //System.out.println("début de l'affichage des lapin");
        for(int i = 0;i<compteur;i++){
            afficher(rab[i]);
        }
        System.out.println("fin de l'affichage des lapin");
        System.out.println("début de la reproduction");
        for(int i = 0;i<compteur;i++){
            rab[i].genelitter();
        }
        System.out.println("fin de la reproduction");
        System.out.println("veillissement");
        actuellisation(compteur);

        System.out.println("début de l'affichage des lapin");
        System.out.println(compteur);
        for(int i = 0;i<compteur;i++){
            afficher(rab[i]);
        }
        System.out.println("fin de l'affichage des lapin");



        System.out.println("début de l'ajout des nouveau nés");
        for(int i = 0;i<compteur;i++){
            int g = rab[i].getkittens();
            maj(g);
        }
        System.out.println(compteur);
        for(int i = 0;i<compteur;i++){
            afficher(rab[i]);

        }
        
        
        
    }
    }

    private static void afficher(lapinfemale rab){
        if (rab.isAlive()){
            System.out.println("Il est vivant");
        }
        else{
            System.out.println("Il est mort");
        }
        
    }

    private static void update(int x,int y){
        for(int i = y; i < y + x; i++){
            rab[i] = new lapinfemale();
            compteur = compteur + 1;
            System.out.println(compteur);
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
                rab[i].isDead();
                
            }

        }
    }

    private static void rabfree(int g){
        decal_gauche(g);
    }

    private static void decal_gauche(int g){
        for(int i =g; i<compteur ; i++){  
            while ( rab[i + 1 ]!=null){
                rab[i] = rab[i + 1];
                i=i+1;
            }
            if(rab[i + 1 ]==null){
                rab[i] = null;
            }
                
        }
        
    }

    private static void actuellisation(int x){
        int i = 0;
        while (i<x){
            if(rab[i].isAlive()){
                rab[i].veillissement();
                i=i+1;
            }
            else{
                rabfree(i);
                compteur = compteur - 1;
                x=x-1;
            }
        }
    }

    public int uniform(int a , int b){
        int x = (int) Math.round( Math.random() * (b - a) );
        System.out.println("uniform " + x);
        return x;
    }
    public static void maj(int x){
        update(x,compteur);
        
    }
}