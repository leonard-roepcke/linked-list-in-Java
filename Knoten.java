public class Knoten {
    private int daten;
    private Knoten next;
    private Knoten previous;
    public Knoten(){
        next = null;
        previous = null; 
        daten = 0;
    }

    public Knoten(Knoten previous){
        this.previous = previous;
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

    public void setPrevious(Knoten previous) {
        this.previous = previous;
    }
}


