package utility;

public class reverseASttring {
    public static void main(String[] args) {
        String str="school is fun";
                String result = "";
             for(int i = str.length()-1;  i >=0 ; i--){
                 result += str.charAt(i);
             }
        System.out.println(result);
        
        //add line from github
    }
}
