public class Repulogep {
    public int azonosito;
    public int tankMeret;

    public Repulogep(int azonosito, int tankMeret) {
        this.azonosito = azonosito;
        this.tankMeret = tankMeret;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(int azonosito) {
        this.azonosito = azonosito;
    }

    public int getTankMeret() {
        return tankMeret;
    }

    public void setTankMeret(int tankMeret) {
        this.tankMeret = tankMeret;
    }
}
class UtasSzallitoRepulo extends Repulogep implements IPassanger{

    public UtasSzallitoRepulo(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public int utasokSzama() {
        return 100;
    }
}
class CsomagSzallitoRepulo extends Repulogep implements IFreighter{

    public CsomagSzallitoRepulo(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public int csomagokSulya() {
        return 500;
    }
}
class KatonaiRepulogep extends Repulogep implements IPassanger,IFreighter{

    public KatonaiRepulogep(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public int csomagokSulya() {
        return 200;
    }

    @Override
    public int utasokSzama() {
        return 30;
    }
}
