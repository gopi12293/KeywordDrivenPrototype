package allKeywords;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;


public class Keywords {
	
	/*public static String filepath;
	public static int datarownum;
	public static int datacolnum = 1;*/
	public static ArrayList<String> splittedData = new ArrayList<String>();
	public static ArrayList<String> unsplittedData = new ArrayList<String>();
	/*public void keyword1() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = utils.data(utils.getdata(filepath, datarownum, datacolnum));
		//data = utils.data(data1.get(1));
		int size=data.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword1 data "+data.get(i));
		Assert.assertTrue(true);
		}
	}

	public void keyword2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = utils.data(utils.getdata(filepath, datarownum, datacolnum));
		//data = utils.data(data1.get(1));
		int size=data.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword2 data " +data.get(i));
		Assert.assertTrue(true);
		}
	}
	public void keyword3() {
		System.out.println("keyword3 data Text3");
		Assert.assertTrue(true);
	}
	public void keyword4() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = utils.data(utils.getdata(filepath, datarownum, datacolnum));
		//data = utils.data(data1.get(1));
		int size=data.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword4 data "+data.get(i));
		Assert.assertTrue(true);
		}
	}
	public void keyword5() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = utils.data(utils.getdata(filepath, datarownum, datacolnum));
		//data = utils.data(data1.get(1));
		int size=data.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword5 data "+data.get(i));
		Assert.assertTrue(true);
		}
	}
	public void keyword6() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = utils.data(utils.getdata(filepath, datarownum, datacolnum));
		int size=data.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword6 data "+data.get(i));
		Assert.assertTrue(true);
		}
	}*/
	
	public static void keyword1() throws EncryptedDocumentException, InvalidFormatException, IOException {
		splittedData = Utils.data(unsplittedData.get(1));
		int size=splittedData.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword1 data "+splittedData.get(i));
		Assert.assertTrue(true);
		}
	}

	public static void keyword2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		splittedData = Utils.data(unsplittedData.get(1));
		int size=splittedData.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword2 data " +splittedData.get(i));
		Assert.assertTrue(true);
		}
	}
	public static void keyword3() {
		System.out.println("keyword3 data Text3");
		Assert.assertTrue(true);
	}
	public static void keyword4() throws EncryptedDocumentException, InvalidFormatException, IOException {
		splittedData = Utils.data(unsplittedData.get(1));
		int size=splittedData.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword4 data "+splittedData.get(i));
		Assert.assertTrue(true);
		}
	}
	public static void keyword5() throws EncryptedDocumentException, InvalidFormatException, IOException {
		splittedData = Utils.data(unsplittedData.get(1));
		int size=splittedData.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword5 data "+splittedData.get(i));
		Assert.assertTrue(true);
		}
	}
	public static void keyword6() throws EncryptedDocumentException, InvalidFormatException, IOException {
		splittedData = Utils.data(unsplittedData.get(1));
		int size=splittedData.size();
		for(int i=0; i<size;i++) {
		System.out.println("keyword6 data "+splittedData.get(i));
		Assert.assertTrue(true);
		}
	}
}
