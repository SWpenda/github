package githubtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class This_is_only_github {
	public static void main(String[]args) {
		List<String> product = new ArrayList<>();
		product.add("virtual");
		product.add("real");
		product.add("financal");
		
		for(int i=0;i<product.size();i++) {
			String value = product.get(i);
			System.out.println(value);//에러가 뜬다.
		}
	}
}
