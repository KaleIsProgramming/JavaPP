public class MyList implements IDataStructure {
    private double value;
    private MyList next;

    public MyList(double initialValue) {
        this.value = initialValue;
        this.next = null;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public MyList getNext() {
        return next;
    }

    public void setNext(MyList next) {
        this.next = next;
    }

    public void changeat(double oldVal, double newVal) {
        MyList current = this;
        while (current != null) {
            if (current.value == oldVal) {
                current.value = newVal;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public void add(double value) {
        MyList current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new MyList(value);
    }

    @Override
    public double max() {
        MyList current = this;
        double maxVal = current.value;
        while (current != null) {
            if (current.value > maxVal) {
                maxVal = current.value;
            }
            current = current.next;
        }
        return maxVal;
    }

    @Override
    public double min() {
        MyList current = this;
        double minVal = current.value;
        while (current != null) {
            if (current.value < minVal) {
                minVal = current.value;
            }
            current = current.next;
        }
        return minVal;
    }

    @Override
    public boolean contains(double value) {
        MyList current = this;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear(double value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public void sort() {
        if (this.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            MyList current = this;
            MyList nextNode = current.next;

            while (nextNode != null) {
                if (current.value > nextNode.value) {
                    double temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                    swapped = true;
                }
                current = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        MyList current = this;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}