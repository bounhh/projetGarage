/**
 * Created by BOUNHH on 17-12-2016.
 */
public class Moteur {
    private TypeMoteur type;
    private String cylindre;
    private Double prix;

    public Moteur(String cylindre, Double prix){
        this.cylindre = cylindre;
        this.prix = prix;
    }
    public String toString(){
        return type.toString();
    }
    public Double getPrix(){
        return prix;
    }

}
