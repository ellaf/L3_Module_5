package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	Stack<String> bracketStack = new Stack<String>();
	
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));

	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		 
		for (int i = 0; i < b.length(); i++) {
			String bSub = b.substring(i, i+1);
			if(bSub.equals("{")){
			bracketStack.push("a");
			}else if(bSub.equals("}")) {
			bracketStack.pop();
			}
		}
			if(bracketStack.size() == 0) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
		
	}
	
	}

}