import java.io.File;

public class TestApp {

	    public static void main(String args[]) {
	    	 File sys = new File("/java/system");
	         System.out.print(sys.canWrite());
	         System.out.print(" " + sys.canRead());
}
}