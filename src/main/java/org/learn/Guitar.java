package org.learn;
import org.test.RandomGen;
import org.g_enums.*;

import java.util.Iterator;

public class Guitar {


    private String  note, id;
    private double price;

    private TopWood g_topwood;





    public Guitar(String notice,TopWood gtopwood){

        this.id=RandomGen.get_rand_str();
        this.price=RandomGen.get_rand_doub();
        this.note=notice;
        this.g_topwood=gtopwood;

    }

    @Override
    public String toString() {
        return "Guitar id = "+this.id+"\n"+ "Price = "+ this.price +"\nNotice = "+this.note+"\n"+"Top Wood ="+this.getG_topwood();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
}
