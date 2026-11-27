class Pair<K, V> {
    private final K key;
    private final V value;
    Pair(K key, V value) { this.key = key; this.value = value; }
    K getKey() { return key; }
    V getValue() { return value; }
}
class GenericsPair {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>(101, "Meera");
        System.out.println(student.getKey() + " -> " + student.getValue());
    }
}
