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

    public void setElementAt(int index, int data){
        Knoten current = start;
        int count = 0;
        while(current != null){
            if(count == index){
                current.setDaten(data);
                return;
            }
            count++;
            current = current.getNext();
        }
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

    public void removeElement(int index){
        if(start == null) return;
        if(index == 0){
            start = start.getNext();
            return;
        }
        Knoten current = start;
        Knoten previous = null;
        int count = 0;
        while(current != null && count < index){
            previous = current;
            current = current.getNext();
            count++;
        }
        if(current != null){
            previous.setNext(current.getNext());
        }
    }

    public void insertElementAt(int index, int data){
        Knoten newNode = new Knoten();
        newNode.setDaten(data);
        if(index == 0){
            newNode.setNext(start);
            start = newNode;
            return;
        }
        Knoten current = start;
        Knoten previous = null;
        int count = 0;
        while(current != null && count < index){
            previous = current;
            current = current.getNext();
            count++;
        }
        if(previous != null){
            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }
        
}
