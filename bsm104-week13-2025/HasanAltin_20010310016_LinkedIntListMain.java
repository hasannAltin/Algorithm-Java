
public class HasanAltin_20010310016_LinkedIntListMain {
			
	public static void main(String[] args) { 
			
		LinkedIntList linkedList = new LinkedIntList(); 
		
		System.out.println(linkedList.size()); 
		
		linkedList.add(3); 
		linkedList.add(5); 
		System.out.println(linkedList.size()); 
		
		System.out.println(linkedList.get(0)); 
		
		linkedList.add(7); 
		linkedList.add(13); 
		linkedList.add(17); 
		linkedList.add(71); 
		linkedList.add(53); 
		System.out.println(linkedList); 
		System.out.println("index:" + linkedList.indexOf (13)); 
		
		linkedList.add(0, 25); 
		System.out.println(linkedList); 
		
		linkedList.add(2, 0); 
		System.out.println(linkedList); 
		
		linkedList.remove(0); 
		System.out.println(linkedList); 
		
		linkedList.remove(3); 
		System.out.println(linkedList); 
		
		linkedList.reverse(); 
		System.out.println(linkedList);
	}
}