class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (isEmpty()) {
            return -1;
        }
        Node temp = this.head;

        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return -1;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return -1;
        }

        return temp.value;
    }
    public void insertHead(int val) {
        if (isEmpty()) {
            this.head = new Node(val, null);
            this.tail = this.head;
        } else {
            Node temp = new Node(val, this.head);
            this.head = temp;
        }
    }

    public void insertTail(int val) {
        if (isEmpty()) {
            this.tail = new Node(val, null);
            this.head = this.tail;
        } else {
            Node temp = new Node(val, null);
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    public boolean remove(int index) {
        if (isEmpty()) {
            return false;
        } else if (index == 0) {
            if (head == tail) {
                head = null;
                tail = head;
                return true;
            } else {
                this.head = this.head.next;
                return true;
            }
        }

        Node temp = this.head;

        for (int i = 0; i < (index - 1); i++) {
            if (temp == null) {
                return false;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return false;
        } else if (temp == tail) {
            return false;
        } else {
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            return true;
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node cur = this.head;
        while (cur != null) {
            list.add(cur.value);
            cur = cur.next;
        }
        return list;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}

class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
