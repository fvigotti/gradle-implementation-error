package net.me.consumer;

import org.apache.commons.csv.CSVFormat;

public class Main {

    public static void main(String[] args){

        // transitive dependency commons-csv is visible , as expected
        CSVFormat format = CSVFormat.DEFAULT;

        // commons-codec lib has not leaked, as expected:

        // cannot use Decoder class in compile scope
        //org.apache.commons.codec.Decoder decoder;

        // but available in runtime scope
        String decoderClazzName = "org.apache.commons.codec.Decoder";
        try{
            Class.forName(decoderClazzName);
            System.out.println("all fine");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
