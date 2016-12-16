
public class Main {

    public static void main(String[] args) {
        RH_Hash myHash = new RH_Hash<Integer, Double>();
        myHash.isEmpty();
        myHash.push(32,42);
        myHash.push(8,2);
        myHash.push(123,456);
        myHash.push(3,103);
        myHash.get(8);
        myHash.isEmpty();
    }
}
