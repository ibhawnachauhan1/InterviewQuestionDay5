package InterviewQuestion;
import java.util.ArrayList;
public class ArraylstMixedDatatypes {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(13);
		list.add("Kite");
		list.add(45.6);
		list.add('b');
		list.add("we cam store heterogeneous/mixeddatatypes using Object Datatype");
		
		for(Object lists : list) {
			System.out.println(lists);
			
		

	}

	}
}
