package org.custThreads;

import java.util.List;

public class CustomThreads {


    static class SumThread implements Runnable{

        private List<Integer> shared_list;
        private int size;

        private int cur_sum;



        public SumThread(List<Integer> mylist){


            this.shared_list=mylist;
            this.cur_sum=0;
            this.size= mylist.size();


        }

        @Override
        public void run() {


            while(true){

                if (this.has_new_values()){

                    System.out.println("The current Sum is =  "+calculate_sum());

                }


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {


                    System.out.println();
                    throw new RuntimeException(e);
                }

            }

        }

        private int calculate_sum(){
            for (int num : shared_list){

                this.cur_sum =+ num;
            }

            return this.cur_sum;
        }


        private boolean has_new_values(){

            if (this.size < this.shared_list.size()){
                this.size=this.shared_list.size();
                return true;
            }

            return false;

        }


    }



    public CustomThreads( ){




    }






}
