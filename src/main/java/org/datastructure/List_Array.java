package org.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public class List_Array implements Collection<String> {


    List<String> my_list;


    public List_Array(){

        this.my_list=new ArrayList<>();



    }




    @Override
    public int size() {
        return this.my_list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.my_list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        for (String a: this.my_list) {

            if (a == o){

                return true;

            }


            }


        return false ;


    }

    @Override
    public Iterator iterator() {
        return my_list.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(String s) {
        this.my_list.add(s);

        return true;

    }



    @Override
    public boolean remove(Object o) {

        boolean is_removed = false;

        if (this.is_obj_str(o)) {

            int index = this.my_list.indexOf(o);

            if (index >= 0) {

                     this.my_list.remove(index);
                     is_removed=true;

                       }



        }

        return is_removed;

    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {

        boolean is_equal=false;

        if (o == null || o.getClass() != this.getClass()){
            return is_equal ;
        }else{
            for (String elm: this.my_list) {

                is_equal= ((List_Array) o).contains(elm) ? true : false ;
                if ( !is_equal ){
                    break;
                               }          }
            }

        is_equal=true;

        return is_equal;


    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        this.my_list=new ArrayList<>();

        return true;

    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean is_obj_str(Object o){
        return (o instanceof String);
    }
}
