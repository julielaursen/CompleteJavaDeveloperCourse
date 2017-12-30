package JuliePackage;

/**
 * Created by Julie on 12/29/2017.
 */
public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
