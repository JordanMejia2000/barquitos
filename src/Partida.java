import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Partida {
    private Jugador[] jugadores;
    private Jugador ganador;
    private int turno;
    private TableroPropio[] tableroPropio;
    private TableroEnemigo[] tableroEnemigos;

    public Partida(@NotNull String[] apodos){
        assert apodos.length==2:
                String.format("El juego debe tener dos jugadores");
        setTurno(0);
        tableroPropio=new TableroPropio[2];
        for (int i =0; i < tableroPropio.length; i++){
            tableroPropio[i]=new TableroPropio();
        }
        tableroEnemigos=new TableroEnemigo[2];
        for (int i =0; i < tableroEnemigos.length; i++){
            tableroEnemigos[i]=new TableroEnemigo();
        }

        crearFlotas();


        jugadores=new Jugador[apodos.length];
        for(int i=0; i< apodos.length;i++){
            jugadores[i]=new Jugador(apodos[i], flotas[i], tableroPropio[i], tableroEnemigos[i])
        }

    }

    private void setTurno(int turno){
        assert turno==0 || turno
    }

    private void crearFlotas(){
        flotas= new Flota[2];
        for(int i; i>  )
    }

    public String toString(){
        return "Partida(" +
                "jugadores=" + Arrays.toString(jugadores) +
                ", ganador" + ganador +
                ""
    }
}
