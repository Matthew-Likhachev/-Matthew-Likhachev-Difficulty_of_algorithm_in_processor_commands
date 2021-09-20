import java.io.*;

public class Reading_File {
    String[] get_lines_from_file=null;      //lines array from text file
    int number_lines=0;                              //number of array's lines
    public  Reading_File(){
        String text_file_name = "Text.txt";     //Path and name of the text file
        BufferedReader buffered_reader = null;
        try{
            //create an object of the file
            File file = new File(text_file_name);
            //condition of the existing the file
            if(!file.exists()) {
                file.createNewFile();
            }

            //get number of lines from the txt file
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            lineNumberReader.skip(Long.MAX_VALUE);
            number_lines = 1 + lineNumberReader.getLineNumber();//+1 because dont get the last line
            lineNumberReader.close();
            get_lines_from_file = new String[number_lines];
            //special reader from file(reading line by line)
            buffered_reader = new BufferedReader(new FileReader(text_file_name));
            //writing file in lines array
            for (int i=0; i<number_lines;i++) {
                get_lines_from_file[i] = buffered_reader.readLine();
            }
            buffered_reader.close();
        }
        catch (IOException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        System.out.println("number of lines = "+number_lines);
        for (int i=0; i<number_lines;i++) {
            System.out.println(get_lines_from_file[i]);
        }
    }
}
