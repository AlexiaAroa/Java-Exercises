package AliciaLoca_3;

public class Persona {
    private int locura;
    private int maxLocura;
    private int secretos;
    private boolean estaMundo;

    public Persona(int locura, int maxLocura, int secretos, boolean estaMundo) {
        this.locura = locura;
        this.maxLocura = maxLocura;
        this.secretos = secretos;
        this.estaMundo = estaMundo;
    }

    public void embellecer(int valorDado) {
        if (valorDado+locura <= maxLocura)
            locura += valorDado;
        else
            locura = maxLocura;

        if (secretos >= 10)
            secretos -= 10;
        else
            secretos = 0;
    }

    public boolean perteneceMundoMaravillas() {
        return estaMundo;
    }

    public boolean esPersonaNormal() {
        return locura < 10 && secretos >= 500;
    }

    public boolean esPersonaLinda() {
        return (75*maxLocura/100) < locura;
    }
}
