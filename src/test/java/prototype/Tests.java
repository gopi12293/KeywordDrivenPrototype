package prototype;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allKeywords.Keywords;
import allKeywords.Utils;

public class Tests {

	ArrayList<String> caseslist = new ArrayList<String>();
	Utils util = new Utils();
	Keywords keywords = new Keywords();
	public static Method method;
	Map<Integer, ArrayList<String>> map = new LinkedHashMap<Integer, ArrayList<String>>();
	String filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\";

	@BeforeClass
	public ArrayList<String> activecases() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String filepath = util.readprop();
		int rowcount = util.rowcount(filepath);
		for (int i = 0; i < rowcount; i++) {
			if (util.getdata(filepath, i + 1, 1).equalsIgnoreCase("Yes")) {
				caseslist.add(util.getdata(filepath, i + 1, 0));
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
	 * ; int count = util.rowcount(Keywords.filepath);
	 * System.out.println("testcase1"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase2() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase2")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase2.xlsx"
	 * ; int count = util.rowcount(Keywords.filepath);
	 * System.out.println("testcase2"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase3() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase3")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase3.xlsx"
	 * ; int count = util.rowcount(Keywords.filepath);
	 * System.out.println("testcase3"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase4() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase4")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase4.xlsx"
	 * ; int count = util.rowcount(Keywords.filepath);
	 * System.out.println("testcase4"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 * 
	 * @Test public void testcase5() throws EncryptedDocumentException, IOException,
	 * NoSuchMethodException, SecurityException, InvalidFormatException,
	 * IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 * if (!caseslist.contains("testcase5")) { throw new
	 * SkipException("Skipping this exception"); } else { Keywords.filepath =
	 * "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase5.xlsx"
	 * ; int count = util.rowcount(Keywords.filepath);
	 * System.out.println("testcase5"); for (int i = 0; i <= count; i++) {
	 * Keywords.datarownum = i; method =
	 * keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0)); //
	 * method = keywords.getClass().getMethod("keyword3"); method.invoke(keywords);
	 * } } }
	 */

	/*@Test
	public void testcase1() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase1.xlsx";
		int count = util.rowcount(Keywords.filepath);
		System.out.println("testcase1");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase2() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase2.xlsx";
		int count = util.rowcount(Keywords.filepath);
		System.out.println("testcase2");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase3() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase3.xlsx";
		int count = util.rowcount(Keywords.filepath);
		System.out.println("testcase3");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase4() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase4.xlsx";
		int count = util.rowcount(Keywords.filepath);
		System.out.println("testcase4");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}

	@Test
	public void testcase5() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\testcase5.xlsx";
		int count = util.rowcount(Keywords.filepath);
		System.out.println("testcase5");
		for (int i = 0; i <= count; i++) {
			Keywords.datarownum = i;
			method = keywords.getClass().getMethod(util.getdata(keywords.filepath, i, 0));
			// method = keywords.getClass().getMethod("keyword3");
			method.invoke(keywords);
		}
	}*/

	@Test
	public void testcase1() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = filepath + "testcase1.xlsx";
		map = util.fulldata(Keywords.filepath);
		util.invoke(map);
	}

	@Test
	public void testcase2() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = filepath + "testcase2.xlsx";
		map = util.fulldata(Keywords.filepath);
		util.invoke(map);
	}
	@Test
	public void testcase3() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = filepath + "testcase3.xlsx";
		map = util.fulldata(Keywords.filepath);
		util.invoke(map);
	}
	@Test
	public void testcase4() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = filepath + "testcase4.xlsx";
		map = util.fulldata(Keywords.filepath);
		util.invoke(map);
	}
	@Test
	public void testcase5() throws EncryptedDocumentException, IOException, NoSuchMethodException, SecurityException,
			InvalidFormatException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Keywords.filepath = filepath + "testcase5.xlsx";
		map = util.fulldata(Keywords.filepath);
		util.invoke(map);
	}
}
