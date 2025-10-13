package ConsoleApplications.DataBaseOperation;
class MyMap {
    private String[] keys;
    private String[] values;
    private int size;

    MyMap() {
        keys = new String[100];   // fixed capacity
        values = new String[100];
        size = 0;
    }

    public void set(String key, String value) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public String get(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) return values[i];
        }
        return null;
    }

    public void unset(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                for (int j = i; j < size - 1; j++) {
                    keys[j] = keys[j + 1];
                    values[j] = values[j + 1];
                }
                size--;
                return;
            }
        }
    }
    public int count(String value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] != null && values[i].equals(value)) {
                count++;
            }
        }
        return count;
    }


    public MyMap copy() {
        MyMap copy = new MyMap();
        for (int i = 0; i < size; i++) {
            copy.set(keys[i], values[i]);
        }
        return copy;
    }
}
