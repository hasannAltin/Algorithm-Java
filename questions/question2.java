package s2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;


public class HasanAltin_20010310016_Soru2 {

	public static void main(String[] args) { 
	
	}
	
	public List<List<Integer>> collatzSequences(List<Integer> numbers) {
	    List<List<Integer>> result = new List<ArrayList<>>();

	    for (int num : numbers) {
	        List<Integer> sequence = new ArrayList<>();
	        int current = num;

	        while (current != 1) {
	            sequence.add(current);
	            if (current % 2 == 0) {
	                current = current / 2;
	            } else {
	                current = 3 * current + 1;
	            }
	        }

	        sequence.add(1);
	        result.add(sequence);
	    }

	    return result;
	}

	
	
}
