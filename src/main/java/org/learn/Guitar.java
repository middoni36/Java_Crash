package org.learn;
import org.test.RandomGen;
import org.g_enums.*;

import java.util.Iterator;

public class Guitar implements Comparable<Guitar> {


    private String  note, id;
    private double price;

    private TopWood g_topwood;

    private Size g_size;





    public Guitar(String notice,TopWood gtopwood,Size g_size ) {

        this.id=RandomGen.get_rand_str();
        this.price=RandomGen.get_rand_doub();
        this.note=new String(notice);
        this.g_topwood=gtopwood;
        this.g_size=g_size;

    }

    @Override
    public String toString() {
        return "Guitar id = "+this.id+"\n"+ "Price = "+ this.price +" Euro \nNotice = "+this.note+"\n"+"Top Wood ="+this.getG_topwood();
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getG_topwood() {
        return g_topwood.toString();
    }

    public String getG_size(){return this.g_size.toString();}

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }else {
            Guitar G_inst =(Guitar)obj;

            return G_inst.getG_size().toString().equals(this.getG_size().toString()) && G_inst.g_topwood.toString().equals(this.g_topwood.toString()) && G_inst.price ==this.price;

        }
    }

    @Override
    public int compareTo(Guitar o) {
        return 0;
    }
}
