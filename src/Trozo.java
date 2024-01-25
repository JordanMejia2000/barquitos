public class Trozo {
    private boolean tocado;

    public Trozo(){
        this.tocado=false;
    }


    public String toString(){
        return tocado ? "|T|" : "| |";
    }

}

