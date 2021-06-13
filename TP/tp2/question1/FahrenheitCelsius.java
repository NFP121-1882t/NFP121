package question1;
import  java.lang.String;
import java.lang.NumberFormatException;
import java.lang.Object;
import java.lang.Number;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String [] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;
        double celsius = 0;
        
        for (int i=0 ; i<=args.length ; i++){
        fahrenheit = Integer.parseInt(args[i]);
        celsius=fahrenheitEnCelsius( fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
    }
    
                                                                                
    }

    
    public static double fahrenheitEnCelsius(int f) {
        f=((f-32)*5)/9;
        double r = ((int)f*10)/10.0;
        return r; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }
   
}
  
        