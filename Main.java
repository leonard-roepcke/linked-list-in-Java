public class Main {       // start gehört zur Klasse

    public static void main(String[] args) {
        System.out.println("Linked List Program");
        Knoten start = new Knoten();
        start.setNext(new Knoten());
        start.getNext().setDaten(5);
        start.getNext().setNext(new Knoten());
        start.getNext().getNext().setDaten(10);

        System.out.println("First node data: " + start.getDaten());
        System.out.println("Second node data: " + start.getNext().getDaten());
        System.out.println("Third node data: " + start.getNext().getNext().getDaten());
    }
}
