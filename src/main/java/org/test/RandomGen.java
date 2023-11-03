package org.test;
import java.util.Base64;
import java.util.Random;
import java.util.Base64.Encoder;

public class RandomGen {


    private static Random rand_gen= new Random();
    private static Encoder encoder_inst= Base64.getUrlEncoder();

    public static int get_rand_int(){

        return RandomGen.rand_gen.nextInt(500);

    }

    public static double get_rand_doub(){
        return RandomGen.rand_gen.nextDouble();

    }

    public static String get_rand_str(){

        byte[] random_bytes =new byte[50];
        RandomGen.rand_gen.nextBytes(random_bytes);


        return RandomGen.encoder_inst.encode(random_bytes).toString();

    }
}
