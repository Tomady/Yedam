package co.dy.prj;

import co.dy.prj.product.LgTV;
import co.dy.prj.product.MyPrint;
import co.dy.prj.product.Pencil4B;
import co.dy.prj.product.Pencil6B;
import co.dy.prj.product.SamsungTV;
import co.dy.prj.service.Pencil;
import co.dy.prj.service.RemoteController;
import co.dy.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   	
//    	RemoteController rc;
//    	TestInterface ts = new TestInterface(new SamsungTV());
//    	
//    	rc = ts.reReturn();
//    	rc.powerOn();
//    	rc.powerOff();
//		ts.toString();
    	
//    	MyPrint myPrint = new MyPrint(new Pencil4B());
//    	myPrint.toPrint();
    	TryCatchTest trycatchTest = new TryCatchTest();
    	
    	try {
			trycatchTest.method1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항상 실행하는 구문");
		}
    }
}

