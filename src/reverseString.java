
public class reverseString {

	public static void main(String[] args) {
		String OriginlString= "ABCDEF";
        String TempString ="";
        int length = OriginlString.length();
        for(int i=length-1;i>=0;i--) {
        	TempString=TempString+OriginlString.charAt(i);
        }
        System.out.println(TempString);
}
}
