
public class Main {

    public static void main(String[] args)
    {
        //reading file
        Reading_File read_file = new Reading_File();
        //send to array of lines and number lines from reading file
        Counting counting = new Counting(read_file.get_lines_from_file, read_file.number_lines);
    }
}
