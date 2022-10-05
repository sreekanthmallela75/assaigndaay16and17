package assaignDay16and17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner input = new Scanner(System.in);

		        //read data from the file
		        ReadFile read = new ReadFile();
		        ArrayList<String> dataArray = read.readFile();

		        //sort the data in ascending order
		        Collections.sort(dataArray);

		        //Take input from the user to search for the word
		        System.out.print("Enter the word you want to search from the file: ");
		        String value = input.next();

		        boolean b = false;
		        for (String i: dataArray) {
		            if(value.equalsIgnoreCase(i)){
		                b = true;
		            }
		        }
		        if(b){
		            System.out.println(value + "  Word is found");
		        }
		        else
		            System.out.println(value + "  Word is not found");
		    }
		}

	