package org.g_enums;

public enum TopWood {

    Hard(0.90),
    Weak(0.10),
    Normal(0.45) ;

    private final double hardness;

    private TopWood(double value){
        this.hardness=value;
    }

    @Override
    public String toString() {
        switch(this){
            case Hard : return "Hard";
            case Weak : return "Weak";
            case Normal : return "Normal";
            default : throw new TypeNotPresentException("Value is not yet as string defined",new Throwable());
        }

    }

    public double getHardness(){

        return this.hardness;
    }


}
