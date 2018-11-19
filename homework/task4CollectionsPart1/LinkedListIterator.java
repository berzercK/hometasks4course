package education.homework.task4CollectionsPart1;

import java.util.Iterator;

public class LinkedListIterator<Node> implements Iterator<Node> {

    private Node[] list;
    private int currentSize;
    private int currentIndex;

    public LinkedListIterator(Node[] list) {
        this.list = list;
        currentSize = list.length;
        currentIndex = 0;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < currentSize && list[currentIndex] != null;
    }

    @Override
    public Node next() {
        return list[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

//    @Override
//    public void forEachRemaining(Consumer action) {
//
//    }
}
