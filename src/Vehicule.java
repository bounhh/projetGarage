import com.bounhh.option.Option;

import java.util.List;

/**
 * Created by BOUNHH on 16-12-2016.
 */
public class Vehicule {
    private Double prix;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;

    public String toString(){
        return this.nomMarque.toString();
    }
    public void addOption (Option opt){
        this.options.add(opt);
    }
    public Marque getMarque(){
        return this.nomMarque;
    }
    public List<Option> getOptions(){
        return this.options;
    }
    public Double getPrix (){
        return prix;
    }

}
