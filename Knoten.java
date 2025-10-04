public class Knoten<typ> {
    private typ daten;
    private Knoten<typ> next;
    public Knoten(){
        next = null;
        daten = null;
    }

    public void setNext(Knoten<typ> next) {
        this.next = next;
    }

    public void setDaten(typ daten) {
        this.daten = daten;
    }

    public typ getDaten() {
        return daten;
    }

    public Knoten<typ> getNext() {
        return next;
    }
}
