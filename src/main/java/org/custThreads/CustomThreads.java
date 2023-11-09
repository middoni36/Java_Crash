package org.custThreads;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CustomThreads {




    /**
     * Sum Thread :
     * 1) Take a queue as input
     * 2) check if there are new element
     * 3) calculate the sum and save in this.cur_sum
     * */

    public static class SumThread implements Runnable{

        private Queue<Integer> shared_queue;
        private int size;

        private String thr_name;

        private int cur_sum;



        public SumThread(Queue<Integer> my_queue){




            this.thr_name="Sum";


            this.shared_queue=my_queue;
            this.cur_sum=0;
            this.size= my_queue.size();

            new Thread(this).start();





        }

        @Override
        public void run() {


            System.out.println(this.thr_name+" Thread started ....");


            while(true){

                if (this.has_new_values()){

                    System.out.println("The current Sum is =  "+calculate_sum());

                }


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {


                    System.out.println("RunTime Exception Happened ...");
                    throw new RuntimeException(e);
                }

            }

        }

        private int calculate_sum(){


            this.cur_sum += this.shared_queue.remove();  // remove will  throw exception if is empty unlike poll will return null

            return this.cur_sum;
        }


        private boolean has_new_values(){

              return !this.shared_queue.isEmpty();
        }


    }



    /*
     *
     *
     *
     *
     *
     */

    public static class FillThread implements Runnable {



        private String thr_name;


        private Scanner imput_reader;

        private Queue<Integer> shared_queue;












        public FillThread( Queue shared_queue){



            this.thr_name="Fill";
            this.shared_queue=shared_queue;
            this.imput_reader= new Scanner(System.in);




            new Thread(this).start();








        }


        @Override
        public void run() {

            boolean stop= false;
            System.out.println(this.thr_name+" Thread started ....");



            while(!stop){

                try {
                    System.out.println("Please Add A Number : ");
                    this.shared_queue.add(Integer.parseInt(this.imput_reader.nextLine()));

                }catch ( NumberFormatException e){

                    System.out.println("Exception Happened Fill Thread stopped ..");
                    stop=true;
                }


            }




        }






    }












}
