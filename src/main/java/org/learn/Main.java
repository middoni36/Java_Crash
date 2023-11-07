package org.learn;
import org.datastructure.List_Array;
import org.g_enums.TopWood;
import org.test.Custom_Iter;
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


        Custom_Iter<Guitar> gui_repo_iter = repo_guitar.getCust_iter(); // get guitar repo iterator


        System.out.println(gui_repo_iter.next().toString());

        System.out.println("*********************************************************");


        repo_guitar.add_guitar(new Guitar("thats ahmed guitar",TopWood.Normal));


        while(gui_repo_iter.hasNext()){

            System.out.println(gui_repo_iter.next().toString());
        }



























    }
}