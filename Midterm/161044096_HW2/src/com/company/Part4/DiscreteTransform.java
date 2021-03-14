package com.company.Part4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * The abstract class to the Template method that
 * contains the input/output operations and main algorithm for calculations.
 */
public abstract class DiscreteTransform {

    /**
     * Output file name to write results.
     */
    private String outFile = "outFile.txt";

    /**
     * Calculating discrete transform algorithm.
     * @param filename
     */
    public void calculateTransform(String filename){

        List<Double> reel = new ArrayList<Double>();
        List<Double> imag = new ArrayList<Double>();

        try {
            readFile(filename,reel,imag);
            List<List<Double>> result = transform(reel,imag);
            writeToFile(result);
            if (customerWantsExtra())
                addExtra();
        } catch (IOException e) {
            System.err.println("File not found!");
        }

    }

    /**
     * Read files and split equations to real and imag.
     * @param filename
     * @param real
     * @param imag
     * @throws IOException if there is no file.
     */
    private void readFile(String filename,List<Double> real,List<Double> imag) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String sCurrentLine;
        List<String> s = new ArrayList<String>();
        while ((sCurrentLine = br.readLine()) != null)
            s.add(sCurrentLine);

        for (String line : s)
            parseALine(line,real,imag);

    }

    /**
     * Parse and add to list a string as real numbers and complex numbers
     * @param line
     * @param real
     * @param imag
     */
    private static void parseALine(String line,List<Double> real,List<Double> imag){
                String[] nums = line.split("\\s+");
                for(int i = 0; i<nums.length; i += 2)
                {
                    real.add(Double.parseDouble(nums[i]));
                    imag.add(Double.parseDouble(nums[i+1]));

                    //System.out.println(nums[i] + "  --  " + nums[i+1]);
                }

        //System.out.println("finish");
    }

    /**
     * Write to file.
     * @param res results of 1D Discreate Transfrom
     * @throws FileNotFoundException if there is no file.
     * @throws UnsupportedEncodingException if encoding is not support.
     */
    private void writeToFile(List<List<Double>> res) throws FileNotFoundException, UnsupportedEncodingException {

        int N = res.get(0).size();
        StringBuffer s=new StringBuffer("");
        for(int i=0; i<N; ++i){
            double reel = res.get(0).get(i);
            double img = 0.0;
            if (res.size()>1)
                img = res.get(1).get(i);
            s.append(reel ) ;
            if (res.size()>1) {

                if (img < 0) {
                    s.append(" - ");
                    img *= -1;
                } else
                    s.append(" + ");
                s.append(img + "i, ");
            }
            s.append("\n");
        }

        System.out.println("----  Results  ----");
        System.out.println(s);

        PrintWriter writer = new PrintWriter(outFile, "UTF-8");
        writer.print(s);
        writer.close();

    }

    /**
     * For customer to offer any new extra.
     * @return
     */
    protected boolean customerWantsExtra(){
        return false;
    }

    /**
     * Any extra operation.
     */
    protected void addExtra(){}

    /**
     * apply discreate transform implementation
     * @param real real numbers of equations
     * @param imag imaginar numbers of equations
     * @return discreate transform 1D results as real numbers list and imaginary numbers list.
     */
    protected abstract List<List<Double>> transform(List<Double> real, List<Double> imag);
}
