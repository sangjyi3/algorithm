
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	int binarySearch(int[] a, int x) {
		int low =0;
		int high = a.length -1;
		int mid;
		
		while(low <= high) {
			mid = (high + low) / 2;
			if(a[mid] < x) {
				mid = mid +1;
			}else if(a[mid] > x){
				mid = mid -1;
			}else {
				return x;
			}
			
		}
		
		return -1;
	}


}
