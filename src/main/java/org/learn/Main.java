package org.learn;
import org.custThreads.CustomThreads;
import org.datastructure.List_Array;
import org.g_enums.TopWood;
import org.test.Custom_Iter;
import org.test.RandomGen;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.concurrent.ExecutorService;

public class Main {


    public static void main(String[] args) throws InterruptedException {



        guitarStarter();


        //testMapps();





        LinkedList<Integer> my_queue=new LinkedList<>();



        /*

        CustomThreads.FillThread fillThread_inst = new CustomThreads.FillThread(my_queue);
        CustomThreads.SumThread sumThread_inst = new CustomThreads.SumThread(my_queue);


         */












































    }



    public static void guitarStarter(){



        Guitar_Repo repo_guitar = new Guitar_Repo(RandomGen.get_rand_str(),new ArrayList<Guitar>());


        Guitar guit_m= new Guitar("test", TopWood.Weak);
        Guitar guit_y=new Guitar(new String("test"),TopWood.Weak);
        Guitar guit_i=new Guitar("Thats  mimo guitar",TopWood.Normal);


        System.out.println("Comparison is = " + (guit_m.equals(guit_y)));







        repo_guitar.add_guitar((guit_m));
        repo_guitar.add_guitar(guit_y);
        repo_guitar.add_guitar(guit_i);






        Custom_Iter<Guitar> gui_repo_iter = repo_guitar.getCust_iter(); // get guitar repo iterator






        while(gui_repo_iter.hasNext()){

            System.out.println(gui_repo_iter.next().toString());
        }





    }

    public static void testMapps() {


        Map<String,List> my_map = new HashMap<>();


        my_map.put("test",new ArrayList<String>());


        for (String key:my_map.keySet()) {

            System.out.println(my_map.get(key));

        }



    }
}