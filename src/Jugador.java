import org.jetbrains.annotations.NotNull;

public class Jugador {
    private String apodo;
    private Flota flota;
    private TableroPropio tableroPropio;
    private TableroEnemigo tableroEnemigo;
    public Jugador(String apodo, Flota flota, TableroPropio tableroPropio, TableroEnemigo tableroEnemigo){
        setApodo(apodo);
        setFlota(flota);
        setTableroPropio(tableroPropio);
        setTableroEnemigo(tableroEnemigo);
    }

    private void setFlota(@NotNull Flota flota){
        this.flota=flota;
    }

    private void setApodo(@NotNull String apodo){
        this.apodo=apodo;
    }

    private void setTableroPropio(@NotNull TableroPropio tableroPropio){
        this.tableroPropio=tableroPropio;
    }

    private void setTableroEnemigo(@NotNull TableroEnemigo tableroEnemigo){
        this.tableroEnemigo=tableroEnemigo;
    }
}
