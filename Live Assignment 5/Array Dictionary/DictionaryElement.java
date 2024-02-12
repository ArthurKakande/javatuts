// DictionaryElement class
public class DictionaryElement {
    private Object key;
    private Object value;

    // Constructor
    public DictionaryElement(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public Object getKey() {
        return key;
    }

    // Getter for value
    public Object getValue() {
        return value;
    }
}