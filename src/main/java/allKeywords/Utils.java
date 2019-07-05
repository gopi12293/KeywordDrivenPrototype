package allKeywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utils {

	public static Properties properties;
	public static Workbook workbook;
	public static Sheet sheet;

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
}