package org.g_enums;

public enum Size {
    S(3),
    M(6),
    L(7),
    XL(14);

    private final int size_cm;

    private Size(int size_cm){
        this.size_cm=size_cm;
    }

    @Override
    public String toString() {
         switch (this) {
             case S : return "SMALL";
             case M : return  "MEDIUM";
             case L : return "LARGE";
             case XL : return "EXTRA-LARGE";
             default: throw new TypeNotPresentException("Value Doesn't have a String",new Throwable());

         }
    }
}
