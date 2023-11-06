package org.learn;
import org.datastructure.List_Array;
import org.g_enums.TopWood;
import org.test.RandomGen;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {


    public static void main(String[] args) {



        Guitar_Repo repo_guitar = new Guitar_Repo(RandomGen.get_rand_str(),new ArrayList<Guitar>());

        Guitar guit_m= new Guitar("That's Mehdi Guitar", TopWood.Weak);
        Guitar guit_y=new Guitar("Thats yassine guitar",TopWood.Hard);
        Guitar guit_i=new Guitar("Thats  mimo guitar",TopWood.Normal);



        repo_guitar.add_guitar((guit_m));
        repo_guitar.add_guitar(guit_y);
        repo_guitar.add_guitar(guit_i);


        ListIterator<Guitar> grepo_iterator= ((ArrayList<Guitar>)repo_guitar.getGuitar_list()).listIterator();

        /*
        for (ListIterator<Guitar> iter=grepo_iterator; iter.hasNext();){


            System.out.println("***********************************************");

            System.out.println(iter.next().toString());

        }

        while(grepo_iterator.hasPrevious()){
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println(grepo_iterator.previous().toString());
        }


        */

            System.out.println(repo_guitar.next().toString());

            System.out.println(repo_guitar.next().toString());









        List_Array inst_la= new List_Array();
        List_Array sec_la=new List_Array();
        inst_la.add("hello");
        sec_la.add("hello");













    }
}