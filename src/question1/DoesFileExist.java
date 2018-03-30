/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DoesFileExist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean check;
        String path = null;
        check = doesFileExist("test.txt");
        System.out.println(check);
        if(check){
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            try {
                String line = br.readLine();
                while (line != null) {
                    line = line.replace(", ", "\n");
                    line = line.replace(" �C ", "\n");
                    System.out.println(line);
                    line = br.readLine();
                }
            } finally {
                br.close();
            }
        }
    }
    
    private static boolean doesFileExist(String path){
        boolean check = false;
        try{
            File f = new File(path);
            check = f.exists();
            
        }catch(NullPointerException e){
            
        } 
        return check;
    }
    
}
