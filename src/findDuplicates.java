import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {

	public static void main(String[] args) {
		
		ArrayList<String> array =new ArrayList<String>();
		for(int i=0;i<=10;i++) {
			array.add(String.valueOf(i));
		}
        
		for(int i=0;i<=5;i++) {
			array.add(String.valueOf(i));
		}
		System.out.println("whole list  : " + array);
		System.out.println("\nFiltered duplicates : " + processList(array));
	}
		
		//Process Duplicates
		public static Set<String> processList(List<String> listContainingDuplicates){
			 Set<String> resultSet = new HashSet<String>();
			 Set<String> tempSet = new HashSet<String>();
			 for(String yourint:listContainingDuplicates) {
			 if(!tempSet.add(yourint)) {
				 resultSet.add(yourint);
			 }
			 
		}
			 return resultSet;
	
	}

}
