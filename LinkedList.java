public class LinkedList {
    private Knoten start;
    private Knoten end;
    
    public LinkedList(){
        start = new Knoten();
        end = start;
    }
    
    public void addElement(int data){
        Knoten newNode = new Knoten(end);
        
        end.setNext(newNode);
        
    }

    public int getLastData(){
        if(end != null){
            return end.getDaten();
        }
        else{
            return 0;
        }
    }

    // bis hierhin für Presientation

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
    
    public String getAllDaten() {
        Knoten current = start;
        String result = "";
        while (current != null) {
            result += current.getDaten() + " ";
            current = current.getNext();
        }
        return result;
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
    

    // bis hierhin für Presientation
    
    public int getfirstData(){
        if(start != null){
            return start.getDaten();
        }
        else{
            return 0;
        }
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

        
}
