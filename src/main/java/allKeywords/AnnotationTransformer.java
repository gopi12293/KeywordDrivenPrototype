package allKeywords;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import prototype.Tests;


public class AnnotationTransformer implements IAnnotationTransformer {


    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){

    	try {
    		Tests tests = new Tests();
			if (tests.activecases().contains(testMethod.getName())){
			    annotation.setEnabled(true);
			}else {
				annotation.setEnabled(false);
			}
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	

}