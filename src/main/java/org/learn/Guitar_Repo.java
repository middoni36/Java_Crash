package org.learn;

import org.test.Myiterator;

import java.util.*;

public class Guitar_Repo extends Myiterator<Guitar> {

    private List<Guitar> guitar_list;
    private String id;




    public Guitar_Repo(String id, List<Guitar> repo_collec){
        super(repo_collec);

        this.id=id;
        this.guitar_list=repo_collec;

    }

    public void add_guitar(Guitar guitar_inst){

        this.guitar_list.add(guitar_inst);
    }


    public List<Guitar> getGuitar_list() {
        return this.guitar_list;
    }


}
