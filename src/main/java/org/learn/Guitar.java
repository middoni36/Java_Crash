package org.learn;
import org.test.RandomGen;
public class Guitar {


    private String  note, id;
    private double price;


    public Guitar(String notice){

        this.id=RandomGen.get_rand_str();
        this.price=RandomGen.get_rand_doub();
        this.note=notice;

    }

    @Override
    public String toString() {
        return "Guitar id = "+this.id+"\n"+ "Price = "+ this.price +"\nNotice = "+this.note;
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
}
