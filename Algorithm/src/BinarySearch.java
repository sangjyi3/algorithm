
public class BinarySearch {

	public static void main(String[] args) {
		// ����Ž��
		// ���ĵ� ������ ������ �̺�ȭ�ϸ鼭 Ž���ϴ� ���
		BinarySearch BS = new BinarySearch();
		int[] a = { 1,2,3,4,5,6,7};
		
		System.out.println(BS.binarySearch(a, 3));		
	}
	
	int binarySearch(int[] a, int x) {
		int low =0;
		int high = a.length -1;
		int mid;
		
		while(low <= high) {
			
			mid = (high + low) / 2;
			if(a[mid] < x) {
				low = mid +1;
			}else if(a[mid] > x){
				high = mid -1;
			}else {
				return a[mid];
			}
			
		}
		
		return -1;
	}


}
