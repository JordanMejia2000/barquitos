import org.jetbrains.annotations.NotNull;

public class Flota {
    private Barco[] barcos;

    public Flota(@NotNull int[] longitudes){
        barcos=new Barco[longitudes.length];
        for(int i=0; i< longitudes.length; i++){
            barcos[i]= new Barco(longitudes[i]);
        }
    }
}
