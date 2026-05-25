import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListJavaCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        
        List<Integer> inputList = new ArrayList<>();
        for(int i=0; i<n; i++){
            inputList.add(scanner.nextInt());
        }
          
        int q = scanner.nextInt();
        for(int j=0; j<q; j++){
            String queryType = scanner.next();
            if(queryType.equalsIgnoreCase("Insert")){
                int ind = scanner.nextInt();
                int value = scanner.nextInt();
                inputList.add(ind, value);
            }
            else if(queryType.equalsIgnoreCase("Delete")){
                int index = scanner.nextInt();
                inputList.remove(index);
            }
        }  
        scanner.close();
        for(int k =0; k<inputList.size(); k++){
            System.out.print(inputList.get(k) + " ");
        }
    }
}