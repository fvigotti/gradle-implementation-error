package net.me.consumer;

import org.apache.commons.csv.CSVFormat;

public class Main {

    public static void main(String[] args){

        // transitive dependency commons-csv is visible , as expected
        CSVFormat format = CSVFormat.DEFAULT;

        // commons-codec lib has leaked:  available in compile & runtime scopes:

        org.apache.commons.codec.Decoder decoder;

        //  available in runtime scope
        String decoderClazzName = "org.apache.commons.codec.Decoder";
        try{
            Class.forName(decoderClazzName);
            System.out.println("all fine");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
