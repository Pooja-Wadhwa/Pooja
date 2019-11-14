
public class reverseNumber {

	public long invertNumber(long Number) {
		long invert=0;
		while(Number!=0) {
			invert=(invert*10)+(Number%10);
			Number=invert/10;
		}
		return Number;
}
	public static void main(String[] args) {
		int OriginlNumber= 123456789;
        reverseNumber input= new reverseNumber();
        System.out.println(OriginlNumber);
        System.out.println(input.invertNumber(OriginlNumber));

	}	
	}

