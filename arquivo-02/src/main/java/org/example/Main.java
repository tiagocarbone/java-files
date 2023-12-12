package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            // br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            try{
                if(br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }


        }


    }
}