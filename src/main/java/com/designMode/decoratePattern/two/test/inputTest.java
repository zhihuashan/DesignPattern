package com.designMode.decoratePattern.two.test;

import com.designMode.decoratePattern.two.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class inputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./text.txt")));
            while ((c=in.read()) >= 0){
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
