package ex30;

public class App {
    public static String multiplicationTable(int x){
        String table = "";
        for(int i=1; i <= x; i++){
            for(int j=1; j <= x; j++){
                table += String.format("%4d", i*j);
            }
            table += String.format("\n");
        }
        return table;
    }

    public static void main(String args[]){

        System.out.println(multiplicationTable(12));
    }
}
