package question3;
import  java.lang.String;
/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

   
    public String login() {
    return ""+ nom.toLowerCase() +"-"+ prenom.toLowerCase()+""+matricule.toLowerCase();

    }

   

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
     public String getNom() {
        return nom;
    }
    public String nom() {
        return nom;
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    
    public String getPrenom() {
        return prenom;
    }

    public String prenom() {
        return prenom;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    
    public String getMatricule() {
        return matricule;
    }

    public String matricule() {
        return matricule;
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
