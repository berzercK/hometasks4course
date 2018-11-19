package education.homework.task4CollectionsPart1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
    }

//    public MyLinkedList(Collections<? extends E> c) {
//        this();
//        addAll(c);
//    }

    public E getFirst() {
        final Node<E> f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return f.element;
    }

    public E getLast() {
        final Node<E> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return l.element;
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++)
                node = node.nextNode;
            return node;
        } else {
            Node<E> node = last;
            for (int i = size - 1; i > index; i--)
                node = node.prevNode;
            return node;
        }
    }


    @Override
    public void add(Object element) {

    }

    @Override
    public void add(int index, Object element) {

    }

    public void clear() {
        for (Node<E> node = first; node != null; ) {
            Node<E> next = node.nextNode;
            node.element = null;
            node.nextNode = null;
            node.prevNode = null;
            node = next;
        }
        first = null;
        last = null;
        size = 0;

    }

    private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).element;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public E remove(int index) {

        return null;
    }

    @Override
    public E set(int index, Object element) {
        return null;
    }

@Override
    public int size() {
        return size;
    }

@Override
    public E[] toArray() {


        return null;
    }

    @Override
    public String toString() {


        return " ";
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    private static class Node<E> {
        private E element;
        private Node<E> nextNode;
        private Node<E> prevNode;


        public Node(E element, Node<E> nextNode, Node<E> prevNode) {
            this.element = element;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }
}
