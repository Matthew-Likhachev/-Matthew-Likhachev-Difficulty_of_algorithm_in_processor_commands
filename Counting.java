
public class Counting {
    private  long number_of_elementary_itteration=0;
     private String[] all_file;
     private int number_lines;
     public Counting(String[] file, int lines){
         all_file=file;
         number_lines=lines;
         Cheking();
     }

     private void Cheking(){
         //line by line
         for (int line = 0; line < number_lines; line++) {
             //all chars in each line
             for (int charackters = 0; charackters < all_file[line].length() ; charackters++) {
                 //find character '='
                 if (all_file[line].charAt(charackters)=='=' && all_file[line].charAt(charackters+1)!='='){
                    number_of_elementary_itteration++;
                 }
                 //find character '++'
                 if (all_file[line].charAt(charackters)=='+' && all_file[line].charAt(charackters+1)=='+'){
                     number_of_elementary_itteration++;
                 }
                 //find character '--'
                 if (all_file[line].charAt(charackters)=='-' && all_file[line].charAt(charackters+1)=='-'){
                     number_of_elementary_itteration++;
                 }
                 //find character '+'
                 if (all_file[line].charAt(charackters)=='+' && all_file[line].charAt(charackters+1)==' ' && all_file[line].charAt(charackters-1)==' '){
                     number_of_elementary_itteration++;
                 }
                 //find character '-'
                 if (all_file[line].charAt(charackters)=='-' && all_file[line].charAt(charackters+1)==' ' && all_file[line].charAt(charackters-1)==' '){
                     number_of_elementary_itteration++;
                 }
                 //find character '*'
                 if (all_file[line].charAt(charackters)=='*'){
                     number_of_elementary_itteration++;
                 }
                 //find character '<'
                 if  (all_file[line].charAt(charackters)=='<' && all_file[line].charAt(charackters+1)==' ' && all_file[line].charAt(charackters-1)==' '){
                     number_of_elementary_itteration++;
                 }
                 //find character '>'
                 if (all_file[line].charAt(charackters)=='>' && all_file[line].charAt(charackters+1)==' ' && all_file[line].charAt(charackters-1)==' '){
                     number_of_elementary_itteration++;
                 }

             }

         }
         System.out.println("Сложность алгоритма = "+ number_of_elementary_itteration);
    }
}
