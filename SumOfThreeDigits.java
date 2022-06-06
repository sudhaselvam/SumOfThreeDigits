package sum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfThreeDigits {
public int sum(int a,int b,int c) {
		
		if(a==13) {
			return 0;
		}
		else if(b==13) {
			return a;
		}
		else if (c==13) {
			return a+b;
		}
		else {
		return a+b+c;
		
	}
	}
	@Test
	public void testcase() {
		Assert.assertEquals(sum(1,2,3), 6);
	}
	@Test
	public void test1() {
		Assert.assertEquals(sum(1,2,13), 3);
	}
	@Test
	public void test2() {
		Assert.assertEquals(sum(1,13,3), 1);
	}

}



