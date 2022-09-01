package CPS2232;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test extends Exception{
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader())) {
            return br.readLine();
        }
    }
}
