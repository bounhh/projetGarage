import java.util.ArrayList;
import java.util.List;

/**
 * Created by BOUNHH on 17-12-2016.
 */
public class Garage {
    private List<Vehicule> voitures;

    public String toString(){
        String result = "+";
        for (int i=0;i<this.voitures.size();i++)
            result = result + " " + this.voitures.get(i).toString();
        return result;
    }

    public void add(Vehicule voit){
        voitures = new ArrayList<Vehicule>();
        voitures.add(voit);
    }
}
