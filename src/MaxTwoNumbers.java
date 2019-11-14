
public class MaxTwoNumbers {

	public static void main(String[] args) {
		
		int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };
          getMaxNumber(list);
	}
	
	public static void getMaxNumber(int[] nums) {
		int Maxone=0;
		int Maxtwo=0;
		for(int n:nums) {
			if(Maxone<n) {
				Maxtwo=Maxone;
				Maxone=n;
			}else if(Maxtwo<n) {
				Maxtwo=n;
			}
		}
		System.out.println("Max1 - " + Maxone);
		System.out.println("Max2 - " + Maxtwo);
	}

}
