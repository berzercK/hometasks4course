package education.homework.task4CollectionsPart1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {
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
    public boolean add(E element) {
        linkLast(element);
        return true;
    }


    @Override
    public void add(int index, E element) {
        checkElementIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    private void linkLast(E element) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(element, l, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.nextNode = newNode;
        size++;
//        modCount++;
    }

    private void linkBefore(E element, Node<E> node) {
        final Node<E> pred = node.prevNode;
        final Node<E> newNode = new Node<>(element, pred, node);
        node.prevNode = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.nextNode = newNode;
        size++;
//        modCount++;
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
//      md++
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
    public int indexOf(E e) {
        int index = 0;
        if (e == null) {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (e.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    private E unlink(Node<E> node) {
        final E element = node.element;
        final Node<E> next = node.nextNode;
        final Node<E> prev = node.prevNode;

        if (prev == null) {
            first = next;
        } else {
            prev.nextNode = next;
            node.prevNode = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prevNode = prev;
            node.nextNode = null;
        }

        node.element = null;
        size--;
//        modCount++;
        return element;
    }

/*    public void push(E e) {
        addFirst(e);
    }

    public E pop() {
        return removeFirst();
    }*/

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> node = node(index);
        E oldValue = node.element;
        node.element = element;
        return oldValue;
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


        Node(E element, Node<E> prevNode, Node<E> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }
}
