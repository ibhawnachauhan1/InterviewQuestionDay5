package InterviewQuestion;

//4. Get the first item, the middle item and the last item of the array

public class FetchTheItem {

	public static void main(String[] args) {
		
		int[] Arr = new int[] {1,2,3,4,5,6};
		
		//for(int i=0;i<Arr.length;i++) {
			int firstitem = Arr[0];
			int middleitem = Arr[Arr.length/2];
			int lastitem = Arr[Arr.length-1];
			
			System.out.println(firstitem);
			System.out.println(middleitem);
			System.out.println(lastitem);
			
			
		}
		

	}

//}
