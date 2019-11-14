import java.util.ArrayList;
import java.util.Arrays;
//Write Code To Sort The List Of Strings Using Java Collection
public class arraySorting {

	public static void main(String[] args) {
		
		String[] inputString= {"Jan","MAr","Feb","Apr","May","June","July","Aug"};
        showList(inputString);
        Arrays.sort(inputString);
        System.out.println("\n-------Sorted List-------");
		showList(inputString);
	}
	public static void showList(String[] String) {
		for(String s: String) {
			System.out.println(s+"  ");
		}
		System.out.println();
	}

}
