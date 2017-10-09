package javaio;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        String destFile = "my_second_file.html";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) { // try with
            bw.append("Dhaka");
            bw.newLine();
            bw.append("Is");
            bw.newLine();
            bw.append("The");
            bw.newLine();
            bw.append("Capital");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Writing is complete.........");
        }
    }
}
