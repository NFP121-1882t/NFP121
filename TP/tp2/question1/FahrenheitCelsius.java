package question1;
import  java.lang.String;
import java.lang.NumberFormatException;
import java.lang.Object;
import java.lang.Number;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String [] args) {
        // pour tous les param�tres de la ligne de commande
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
        return r; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
    }
   
}
  
        