class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;
    
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;

    }

    public int popback(){
        size--;
        return arr[size];
    }

    public void resize() {
        capacity *= 2;
        int[] tmp = new int[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
            arr = tmp;
    }
    public int getSize(){
        return size;
    } 
    

    public int getCapacity() {
        return capacity;
    }
}

