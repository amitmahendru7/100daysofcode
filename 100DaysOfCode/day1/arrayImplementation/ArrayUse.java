package arrayImplementation;

public class ArrayUse {

	public static void main(String[] args) {
		Array<Integer> arr=new Array<Integer>(10);
		arr.add(4);
		arr.add(2);
		System.out.println(arr);
		
		arr.add(5);
		 System.out.println(arr);
	  System.out.println(arr.contains(2));
	  System.out.println(arr.contains(6));
	  System.out.println(arr.remove(2));
	  System.out.println(arr);

	}

}
