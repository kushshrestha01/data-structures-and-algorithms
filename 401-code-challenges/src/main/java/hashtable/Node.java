package hashtable;

public class Node {

    private String key;
    private String value;
    private Node next;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node(String key, String value){
        this.key = key;
        this.value =value;
    }
}
