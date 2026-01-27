package Tasks;

public class FindCommonElement {
	public static void main(String[] args) {
		int[]num1 = {1,2,3,4};
		int[]num2 = {3,4,5};
		int []res = findCommon(num1,num2);
		
		for (int i : res) {
			if(i!=0) {
				System.out.println(i);
			}
		}
	}
	static int[]findCommon(int[]num1,int[]num2){
		int[]res = new int[num1.length];
		int n=num1.length;
		int k=0;
		for(int i=0;i<n;i++) {
			for (int j = 0; j <num2.length; j++) {
				if(num1[i]==num2[j]) {
					res[k++] = num2[j];
				}
			}
		}
		return res;
	}
}
