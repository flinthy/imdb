package sohfilmes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Ator extends Pessoa implements List<Ator> {
    private final String papel;

    public Ator(String nome, String dataNascimento, String papel) {
        super(nome, dataNascimento);
        this.papel = papel;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("Ator: %s, Papel: %s", super.getNome(), papel);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Ator> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Ator ator) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Ator> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Ator> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Ator get(int index) {
        return null;
    }

    @Override
    public Ator set(int index, Ator element) {
        return null;
    }

    @Override
    public void add(int index, Ator element) {

    }

    @Override
    public Ator remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Ator> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Ator> listIterator(int index) {
        return null;
    }

    @Override
    public List<Ator> subList(int fromIndex, int toIndex) {
        return null;
    }
}