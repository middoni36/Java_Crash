package org.test;

import java.util.Iterator;
import java.util.List;

public class Myiterator<C> implements Iterator<C> {


    private int index;
    private List<C> iter_inst;

    public Myiterator(List<C> mylist){
        this.index=0;
        this.iter_inst=mylist;
    }


    @Override
    public boolean hasNext() {

        return this.iter_inst.get(++this.index) != new NullPointerException();

    }

    @Override
    public C next() {

        return this.iter_inst.get(this.index++);
    }
}
