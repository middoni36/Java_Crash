package org.learn;

import java.util.ArrayList;
import java.util.List;

public class Guitar_Repo {

    List<Guitar> guitar_list;
    String id;
    public Guitar_Repo(String id){

        this.id=id;
        this.guitar_list=new ArrayList<>();

    }

    public void add_guitar(Guitar guitar_inst){

        this.guitar_list.add(guitar_inst);
    }

}
