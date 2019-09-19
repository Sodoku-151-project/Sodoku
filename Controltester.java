import java.io.FileNotFoundException;

public class Controltester {
	public static void main(String[] args) throws FileNotFoundException {
		Control test = new Control();
		
		test.printOutput();
		System.out.print(test.rowTest(0, 6));
		System.out.print(test.colTest(2, 4));
		System.out.print(test.sectionTest(3,9));
		test.setElement(0, 0, "9");
		System.out.println();
		test.printOutput();
		test.removeElement(0, 0, "9");
		System.out.println();
		test.printOutput();
		//		int x= 4;
//		
//		if(test.print().equals(Integer.toString(x)))
//		{
//			
//		}
	}
}
