package prototype;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import allKeywords.Utils;

public class Tests {

	ArrayList<String> caseslist = new ArrayList<String>();
	Map<Integer, ArrayList<String>> map = new LinkedHashMap<Integer, ArrayList<String>>();
	String filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\";
	String finalfilepath;
	
	@BeforeClass
	public ArrayList<String> activecases() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String totalcasesfilepath = Utils.readprop();
		int rowcount = Utils.rowcount(totalcasesfilepath);
		for (int i = 0; i < rowcount; i++) {
			if (Utils.getdata(totalcasesfilepath, i + 1, 1).equalsIgnoreCase("Yes")) {
				caseslist.add(Utils.getdata(totalcasesfilepath, i + 1, 0));
			}
		}
		return caseslist;
	}

	/*
	 * @Test public void testcase1() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase1")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase1.xlsx"
	 * ; int count = Utils.rowcount(Keywords.filepath);
	 * System.out.println("testcase1"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase2() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase2")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase2.xlsx"
	 * ; int count = Utils.rowcount(Keywords.filepath);
	 * System.out.println("testcase2"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase3() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase3")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase3.xlsx"
	 * ; int count = Utils.rowcount(Keywords.filepath);
	 * System.out.println("testcase3"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase4() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase4")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase4.xlsx"
	 * ; int count = Utils.rowcount(Keywords.filepath);
	 * System.out.println("testcase4"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase5() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase5")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase5.xlsx"
	 * ; int count = Utils.rowcount(Keywords.filepath);
	 * System.out.println("testcase5"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 */

	/*@Test
	public void testcase1() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase1.xlsx";
		int count = Utils.rowcount(Keywords.filepath);
		System.out.println("testcase1");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase2() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase2.xlsx";
		int count = Utils.rowcount(Keywords.filepath);
		System.out.println("testcase2");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase3() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase3.xlsx";
		int count = Utils.rowcount(Keywords.filepath);
		System.out.println("testcase3");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase4() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase4.xlsx";
		int count = Utils.rowcount(Keywords.filepath);
		System.out.println("testcase4");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase5() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase5.xlsx";
		int count = Utils.rowcount(Keywords.filepath);
		System.out.println("testcase5");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(Utils.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}*/

	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		finalfilepath = filepath + "testcase1.xlsx";
		map = Utils.fulldata(finalfilepath);
		Utils.invoke(map);
	}

	@Test
	public void testcase2() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		finalfilepath = filepath + "testcase2.xlsx";
		map = Utils.fulldata(finalfilepath);
		Utils.invoke(map);
	}
	@Test
	public void testcase3() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		finalfilepath = filepath + "testcase3.xlsx";
		map = Utils.fulldata(finalfilepath);
		Utils.invoke(map);
	}
	@Test
	public void testcase4() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		finalfilepath = filepath + "testcase4.xlsx";
		map = Utils.fulldata(finalfilepath);
		Utils.invoke(map);
	}
	@Test
	public void testcase5() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		finalfilepath = filepath + "testcase5.xlsx";
		map = Utils.fulldata(finalfilepath);
		Utils.invoke(map);
	}
}
