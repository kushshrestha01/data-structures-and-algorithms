package hashtable;

public class Hashtable {

    public static void main(String[] args) {

        Hashtable ht = new Hashtable(16);
        Hashtable h1 = new Hashtable(16);
        ht.add("John", "Husband");
        ht.add("Cathy", "Boss");
        ht.add("Amanda", "The Real Boss");
        ht.add("Allie", "Kid");
        ht.add("Zach", "Kid");
        ht.add("Rosie", "Dog");
        ht.add("Justin", "Student");
        ht.add("Demi", "Dog");
        System.out.println(ht.get("Zach"));
        System.out.println(ht.contains("Justin"));
        System.out.println("done");
    }

    private Node[] map;

    public Hashtable(int size) {
        map = new Node[size];
    }

    public int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    public void add(String key, String value) {
        int hashkey = hash(key);

        if (this.map[hashkey] == null) {
            map[hashkey] = new Node(key,value);
        }
        else {
            Node temp = map[hashkey];
            map[hashkey] = new Node(key,value);
            map[hashkey].setNext(temp);
        }
    }

//    http://math.hws.edu/eck/cs124/javanotes4/c12/ex-12-3-answer.html
    public String get(String key){
        int bucket = hash(key);
        Node list = map[bucket];
        while (list != null) {
            if(list.getKey().equals(key)) {
                return list.getValue();
            }
            list = list.getNext();
        }
        return null;
    }

    public Boolean contains(String key){
        int bucket = hash(key);
        Node list = map[bucket];
        while(list != null) {
            if(list.getKey().equals(key)){
                return true;
            }
            list = list.getNext();
        }
        return false;
    }
}
