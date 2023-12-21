package org.learn;
import org.custThreads.CustomThreads;
import org.datastructure.List_Array;
import org.g_enums.TopWood;
import org.g_enums.Size;
import org.test.Custom_Iter;
import org.test.RandomGen;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.concurrent.ExecutorService;

public class Main {


    public static void main(String[] args) throws InterruptedException {



        guitarStarter();


        //testMapps();




















































    }



    public static void guitarStarter(){



        Guitar_Repo repo_guitar = new Guitar_Repo(RandomGen.get_rand_str(),new ArrayList<Guitar>());


        Guitar guit_m= new Guitar("test", TopWood.Weak,Size.S);
        Guitar guit_y=new Guitar("test",TopWood.Weak,Size.L);
        Guitar guit_i=new Guitar("Thats  mimo guitar",TopWood.Normal,Size.M);


        System.out.println("testing Guitar");


        System.out.println("Same References are  = "+ (guit_m.getNote() == guit_y.getNote()));







        repo_guitar.add_guitar((guit_m));
        repo_guitar.add_guitar(guit_y);
        repo_guitar.add_guitar(guit_i);



        Iterator<Guitar> iter_inst = repo_guitar.iterator();

        Iterator<Guitar> iter_inst_2 = repo_guitar.iterator();















        while(iter_inst.hasNext()){

            System.out.println(iter_inst.next().toString());
        }


        System.out.println(iter_inst_2.hasNext());





    }

    public static void testMaps() {


        Map<String,List> my_map = new HashMap<>();


        my_map.put("test",new ArrayList<String>());


        for (String key:my_map.keySet()) {

            System.out.println(my_map.get(key));

        }



    }


    public static void threads_test(){

        LinkedList<Integer> my_queue=new LinkedList<>();

        CustomThreads.FillThread fillThread_inst = new CustomThreads.FillThread(my_queue);
        CustomThreads.SumThread sumThread_inst = new CustomThreads.SumThread(my_queue);
    }
}