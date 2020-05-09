package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductlistTest {

	String str2="displayed all products";
		Object[] whishlist=new Object[3];
		@Autowired
		private ProductListService productlistservice;
		/*@Before
		public void initInputs() {
			
			 * whishlist[0]=new Product(1485,"nokia","electronics",123); whishlist[1]=new
			 * Product( 1456,"samsung","mobiles",123); whishlist[2]=new Product(
			 * 1542,"honor","electronics",123);
			 
		}*/

		@Test
		public void test()  throws IdNotFoundException{
			List<Product> testOutput=whishlistservice.viewProduct();
			if(testoutput!=null)
			{
				String str1="displayed all products";
			}
			
			assertEquals(str2,str1);
			
		}

	}


}
