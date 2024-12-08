
import java.util.Arrays;

public class Central{
    private static rabfemale[] rab;
    private static int compteur = 0 ;
    private static int n = 1000000;
    private static rabfemale[][] tabyy;
    public static void main(String[] argv){
        int x = 2;
        System.out.println("début de l'initialisation avec " + x +" lapin");
        compteur = x;
        int f = 0;
        int h = 12;
        tabyy = new rabfemale[h][n];
        rab = new rabfemale[n];
        for(int i =0;i<compteur;i++){
            rab[i] = new rabfemale() ;
            rab[i].upAge();
        }
        System.out.println("début de la simulation :");
        while (f<h){  
            System.out.println("année : " + f);

            System.out.println("début de la selection naturelle");
            killrabbit(compteur);


            System.out.println("début de la reproduction");
            for(int i = 0;i<compteur;i++){
                rab[i].genelitter();
            }
            System.out.println("fin de la reproduction");
            System.out.println("veillissement");
            update(compteur);

            System.out.println("début de l'ajout des nouveau nés");
            for(int i = 0;i<compteur;i++){
                int g = rab[i].getkittens();
                rab[i].setkittens(0);
                maj(g);
                compteur = compteur+g;
            }

            tabyy[f] = Arrays.copyOf(rab,compteur + 1);
            
            f=f+1;    
    }
    affichertab(h,tabyy);
    }
    /*
      Debut Fonction d'affichage
     */

    private static void affichertab(int h, rabfemale[][] tabyg){
        int j = 0;
        for(int i =0; i<h;i++){
            while (tabyg[i][j]!=null){
                j=j+1;
            }
            System.out.println("nombre de lapin cette année " + i + " : " + j);
            j=0;
        }
    }

    private static void afficher(rabfemale rab){
        if(rab!=null){
            if (rab.isAlive()){
                System.out.println("Il est vivant");
            }
            else{
                System.out.println("Il est mort");
            }
        }
        else{
            System.out.println("inexistant");
        }
    }

    /*
      Fin Fonction d'affichage
     */



     /*
      Début des fonction de mise a jour de la population
     */


    private static void majrab(int x,int y){
        for(int i = y; i < y + x; i++){
            rab[i] = new rabfemale();
        }
    }
    private static void maj(int x){
        majrab(x,compteur);
    }

    private static void killrabbit(int x){
        for (int i =0; i<x;i++){
            double r = Math.random();
            if (rab[i].getrateliv() > r){
                rab[i].setAlive(true);
            }
            else{
                rab[i].setAlive(false);
            }
        }
    }

    private static void update(int x){
        int i = 0;
        while (i<x){
            if(rab[i].isAlive()){
                rab[i].upAge();
                i=i+1;
            }
            else{
                rabfree(i);
                compteur = compteur - 1;
                x=x-1;
            }
        }
    }

    /*
      Fin des fonction de mise a jour de la population
     */

     /*
      Début des fonction de libération de la population
     */


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

    /*
      Fin des fonction de libération de la population
     */
    
}