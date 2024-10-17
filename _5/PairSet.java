package _5;

class CapacityException extends RuntimeException {
    public CapacityException(String errorMessage) {
        super(errorMessage);
    }
}

class KeyNotFoundException extends RuntimeException {
    public KeyNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}

class KeyExistsException extends RuntimeException {
    public KeyExistsException(String errorMessage) {
        super(errorMessage);
    }
}

// Вариант 5

// Ассоциативное множество, хранящее пары вида "Символ - Целое число"
public class PairSet {
    private char keys[];
    private int values[];
    private int capacity;
    private int size;

    private int getInsertPosition(char key) {
        int start = 0;
        int end = size - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (key > keys[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }

    private int getPosition(char key) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == keys[mid]) {
                return mid;
            }

            if (key < keys[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public PairSet(int capacity) {
        if (capacity < 1) throw new CapacityException("Размер ассоциативного множества должен быть как минимум единица");
        this.keys = new char[capacity];
        this.values = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean contains(char key) {
        return getPosition(key) == -1 ? false : true;
    }

    public void insert(char key, int value) {
        if (size + 1 > capacity) {
            throw new CapacityException("Размер ассоциативного множества превышен");
        } else if (contains(key)) {
            throw new KeyExistsException("Элемент уже содержится в ассоциативном множестве");
        }

        size++;

        var insertPosition = getInsertPosition(key);

        for (int i = capacity - 1; i > insertPosition; --i) {
            keys[i] = keys[i - 1];
            values[i] = values[i - 1];
        }

        keys[insertPosition] = key;
        values[insertPosition] = value;
    }

    public void remove(char key) {
        if (!contains(key)) {
            throw new KeyNotFoundException("Элемент не содержится в ассоциативном множестве");
        }

        int i;

        for (i = getPosition(key); i < size - 1; ++i) {
            keys[i] = keys[i + 1];
            values[i] = values[i + 1];
        }

        keys[i] = 0;
        values[i] = 0;

        size--;
    }

    public int get(char key) {
        var pos = getPosition(key);
        if (pos != -1) {
            return values[pos];
        }

        throw new KeyNotFoundException("Элемент не найден");
    }

    public void display() {
        for (int i = 0; i < size; ++i) {
            System.out.println(keys[i] + ": " + values[i]);
        }
    }
}
