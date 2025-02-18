package cp213;

public class ReverseArray {
public static void main(String[] args) {
	int[] x = {4,2,6,1,7};
	
	for (int i=0; i < x.length/2; i++) {
		int temp = x[i];
		x[i] = x[x.length - i -1];
		x[x.length - i -1] = temp;
	}
} 

}
