public class LinkedList {
    private Knoten start;
    public LinkedList(){
        start = new Knoten();
    }

    public int getfirstData(){
        if(start != null){
            return start.getDaten();
        }
        else{
            return 0;
        }
    }

    public int getAllDaten(){
        Knoten current = start;
        int sum = 0;
        while(current != null){
            sum += current.getDaten();
            current = current.getNext();
        }
        return sum;
    }

    public int getElementAt(int index){
        Knoten current = start;
        int count = 0;
        while(current != null){
            if(count == index){
                return current.getDaten();
            }
            count++;
            current = current.getNext();
        }
        return -1;
    }

    public void addElement(int data){
        Knoten newNode = new Knoten();
        newNode.setDaten(data);
        if(start == null){
            start = newNode;
        } else {
            Knoten current = start;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
        
}
