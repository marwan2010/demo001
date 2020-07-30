package utility;

import org.testng.annotations.DataProvider;

public class DP
{
	   @DataProvider(name="testdata")
		public static Object[][] userData()
		{
			return new Object [][] {
				    {"Orange","Hi From Demo Desription Test 00","www.google.com","SKU_010000","200000","50000","1","500000"},
					{"bannaa","Hi From Demo Desription Test 00","www.google.com","SKU_010001","100000.99","50000","1","450000"},
					{"Apple","Hi From Demo Desription Test 00","www.google.com","SKU_010002","200000","4000.99","1","1"},
					{"Avocado","Hi From Demo Desription Test 00","www.google.com","SKU_010003","30000.99","1000.99","1","2000"},
					{"Blueberries","Hi From Demo Desription Test 00","www.google.com","SKU_010004","40000","5000","1","1300"},
					{"Carambola","Hi From Demo Desription Test 00","www.google.com","SKU_010005","50050.99","5000","1","5"},
					{"Cantaloupe","Hi From Demo Desription Test 00","www.google.com","SKU_010006","65050","5000","1","20"},
					{"Cherries","Hi From Demo Desription Test 00","www.google.com","SKU_010007","7500","400","1","3000"},
					{"Coconut Meat","Hi From Demo Desription Test 00","www.google.com","SKU_010008","8888","5000","1","8000"},
					{"Honeydew Melon","Hi From Demo Desription Test 00","www.google.com","SKU_010009","9999","450","1","9000"},
					{"Guava","Hi From Demo Desription Test 00","www.google.com","SKU_010010","1050","55.99","1","1100"},
					{"Lemon","Hi From Demo Desription Test 00","www.google.com","SKU_010011","1160","960","1","1200"},
					{"Mango","Hi From Demo Desription Test 00","www.google.com","SKU_010012","120","88","1","13000"},
					{"Papaya","Hi From Demo Desription Test 00","www.google.com","SKU_010013","13.99","8.77","1","1400"},
					{"Papaya2","Hi From Demo Desription Test 00","www.google.com","SKU_010014","145.99","100","1","157"},
					{"Strawberries","Hi From Demo Desription Test 00","www.google.com","SKU_010015","15","8","1","405"}
			
			};
		}
		
	   
	   
	   
	   @DataProvider(name="testdata2")
	  	public static Object[][] userData2()
	  	{
	  		return new Object [][] {

		        {"Simple_web 00029062020","Hi From Demo web Desription Test 000","www.yahoo.com","SKU_web__00000","200000","50000","1","500000"},
	  			{"Simple_web 00129062020","Hi From Demo web Desription Test 001","www.yahoo.com","SKU_web__00001","100000.99","50000","1","450000"},
	  			{"Simple_web 00229062020","Hi From Demo web Desription Test 002","www.yahoo.com","SKU_web_00002","200000","4000.99","1","1"},
	  			{"Simple_web 00329062020","Hi From Demo web Desription Test 003","www.yahoo.com","SKU_web_00003","30000.99","1000.99","1","2000"},
	  			{"Simple_web 00429062020","Hi From Demo web Desription Test 004","www.yahoo.com","SKU_web_00004","40000","5000","1","1300"},
	  			{"Simple_web 00529062020","Hi From Demo web Desription Test 005","www.yahoo.com","SKU_web_00005","50050.99","5000","1","5"},
	  			{"Simple_web 00629062020","Hi From Demo web  Desription Test 006","www.yahoo.com","SKU_web_00006","65050","5000","1","20"},
	  			{"Simple_web 00729062020","Hi From Demo web Desription Test 007","www.yahoo.com","SKU_web_00007","7500","400","1","3000"},
	  			{"Simple_web 00829062020","Hi From Demo web  Desription Test 008","www.yahoo.com","SKU_web_00008","8888","5000","1","8000"},
	  			{"Simple_web 00929062020","Hi From Demo web Desription Test 009","www.yahoo.com","SKU_web_00009","9999","450","1","9000"},
	  			{"Simple_web 01029062020","Hi From Demo web Desription Test 010","www.yahoo.com","SKU_web_00010","1050","55.99","1","1100"},
	  			{"Simple_web 01129062020","Hi From Demo  web Desription Test 011","www.yahoo.com","SKU_web_00011","1160","960","1","1200"},
	  			{"Simple_web 01229062020","Hi From Demo web Desription Test 012","www.yahoo.com","SKU_web_00012","120","88","1","13000"},
	  			{"Simple_web 01329062020","Hi From Demo web  Desription Test 013","www.yahoo.com","SKU_web_00013","13.99","8.77","1","1400"},
	  			{"Simple_web 01429062020","Hi From Demo web Desription Test 014","www.yahoo.com","SKU_web_00014","145.99","100","1","157"},
	  			{"Simple_web 0l1529062020","Hi From Demo web Desription Test 015","www.yahoo.com","SKU_web_00015","15","8","1","405"}
	  		
	  		};
	  	} 
	   
	   
	   
	   
}