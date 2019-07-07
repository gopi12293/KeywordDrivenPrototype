package allKeywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utils {

	public static Properties properties;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Method method;

	Keywords keywords;
	public String getdata(String filepath, int row, int col)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		File file = new File(filepath);
		FileInputStream fileInputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(fileInputStream);

		sheet = workbook.getSheet("Sheet1");
		String data = sheet.getRow(row).getCell(col).toString();
		return data;
	}

	public int rowcount(String filepath) throws EncryptedDocumentException, IOException {
		File file = new File(filepath);
		FileInputStream fileInputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(fileInputStream);

		sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();

		return rowcount;
	}

	public int colcount(String filepath, int row) throws EncryptedDocumentException, IOException {
		File file = new File(filepath);
		FileInputStream fileInputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(fileInputStream);

		sheet = workbook.getSheet("Sheet1");
		int colcount = sheet.getRow(row).getLastCellNum();

		return colcount;
	}

	public String readprop() {
		String path = null;
		try {
			properties = new Properties();
			FileInputStream fi = new FileInputStream(
					"C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\prototype\\src\\main\\java\\data\\config.properties");
			properties.load(fi);
			path = properties.getProperty("filepath");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

	public ArrayList<String> data(String data) throws EncryptedDocumentException, IOException {

		ArrayList<String> datalist = new ArrayList<String>();
		String[] rawdata = data.split(";");
		datalist.addAll(Arrays.asList(rawdata));
		return datalist;

	}

	public ArrayList<String> totalkewords() throws EncryptedDocumentException, IOException, InvalidFormatException {
		Utils utils = new Utils();
		ArrayList<String> totalkeys = new ArrayList<String>();
		String path = utils.readprop();
		int row = utils.rowcount(path);
		for (int i = 0; i < row; i++) {
			totalkeys.add(utils.getdata(path, i + 1, 0));
		}
		return totalkeys;

	}

	public Map<Integer, ArrayList<String>> fulldata(String filepath)
			throws EncryptedDocumentException, IOException, InvalidFormatException {
		Map<Integer, ArrayList<String>> map = new LinkedHashMap<Integer, ArrayList<String>>();
		Utils utils = new Utils();
		File file = new File(filepath);
		FileInputStream fileInputStream = new FileInputStream(file);
		workbook = WorkbookFactory.create(fileInputStream);
		sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int j = 0; j <= rowcount; j++) {
			ArrayList<String> bothdata = new ArrayList<String>();
			bothdata.add(utils.getdata(Keywords.filepath, j, 0));
			int colcount = utils.colcount(Keywords.filepath, j);
			if (colcount > 1) {
				bothdata.add(utils.getdata(Keywords.filepath, j, 1));
			}
			map.put(j, bothdata);
		}
		return map;
	}
	public void invoke(Map<Integer, ArrayList<String>> map) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		keywords = new Keywords();
		for(Entry e:map.entrySet()){
			Keywords.data1=(ArrayList<String>) e.getValue();
			method = keywords.getClass().getMethod(Keywords.data1.get(0));
			method.invoke(keywords);
		}
	}
}