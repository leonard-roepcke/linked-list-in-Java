public class Knoten {
    private int daten;
    private Knoten next;
    public Knoten(){
        next = null;
        daten = 0;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }

    public void setDaten(int daten) {
        this.daten = daten;
    }

    public int getDaten() {
        return daten;
    }

    public Knoten getNext() {
        return next;
    }
}
