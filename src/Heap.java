import java.util.Collection;
import java.util.Comparator;

public class Heap<E> {
    protected Comparator<? super E> comparator;
    protected Object[] data;
    protected int size;
    protected boolean asc;

    public Heap(Collection<? extends E> data) {
        this(data, null, true);
    }

    public Heap(Collection<? extends E> data, boolean asc) {
        this(data, null, asc);
    }

    public Heap(Collection<? extends E> data,
                Comparator<? super E> comparator) {
        new Heap<>(data, comparator, true);
    }

    public Heap(Collection<? extends E> data,
                Comparator<? super E> comparator,
                boolean asc) {
        if (data == null || data.size() == 0) {
            throw new NullPointerException();
        }

        this.data = data.toArray();
        this.size = this.data.length;
        this.comparator = comparator;
        this.asc = asc;

        //init Heap
        init();
    }

    private void init() {
        for (int index = (size >> 1) - 1; index > 0; index--) {
            siftDown(index);
        }
    }

    @SuppressWarnings("unchecked")
    private void siftDown(int index) {
        int child;
        while ((child = (index << 1) + 1) < size) {
            if (child < size - 1 &&
                compare((E) data[child], (E) data[child + 1]) > 0) {
                child++;
            }
            if (compare((E) data[index], (E) data[child]) > 0) {
                swap(index, child);
                index = child;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        Object tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    @SuppressWarnings("unchecked")
    private int compare(Object e1, Object e2) {
        //compare and check type
        int result = comparator == null ?
                     ((Comparable<? super E>) e1).compareTo((E) e2) :
                     comparator.compare((E) e1, (E) e2);
        return asc ?
               result :
               Math.negateExact(result);
    }

    @SuppressWarnings("unchecked")
    public E remove() {
        if (size == 0) {
            return null;
        }
        int s = --size;

        Object top = data[0];
        data[0] = data[s];
        data[s] = null;

        if (s != 0) {
            siftDown(0);
        }

        return (E) top;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (size == 0) {
            return null;
        }

        return (E) data[0];
    }

    public int size() {
        return size;
    }
}
