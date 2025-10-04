public class Main {       

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElement(5);
        list.addElement(10);

        System.out.println(list.getAllDaten());

        list.removeElement(1);
        list.insertElementAt(1, 3);

        System.out.println(list.getAllDaten());

    }
}
