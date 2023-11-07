package org.learn;

import org.test.Custom_Iter;

import java.util.*;

public class Guitar_Repo  {

    private List<Guitar> guitar_list;
    private String id;

    private Custom_Iter<Guitar> cust_iter;





    public Guitar_Repo(String id, List<Guitar> repo_collec){


        this.id=id;
        this.guitar_list=repo_collec;
        this.cust_iter = new Custom_Iter<>(repo_collec);

    }

    public void add_guitar(Guitar guitar_inst){

        this.guitar_list.add(guitar_inst);
    }


    public List<Guitar> getGuitar_list() {
        return this.guitar_list;
    }


    public Custom_Iter<Guitar> getCust_iter() {
        return cust_iter;
    }
}
