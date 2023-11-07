package org.test;

import java.util.Iterator;
import java.util.List;

public class Custom_Iter<C> implements Iterator<C> {


    private int index;
    private List<C> iter_inst;

    public Custom_Iter(List<C> mylist){
        this.index=0;
        this.iter_inst=mylist;
    }


    @Override
    public boolean hasNext() {

        return this.iter_inst.size() > this.index;

    }

    @Override
    public C next() {
        return this.iter_inst.get(this.index++);
    }


    public boolean hasPrevious(){

        return 0  < this.index;
    }

    public C previous(){

        return this.iter_inst.get(--this.index);

    }
}
