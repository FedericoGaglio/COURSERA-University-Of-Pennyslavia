import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyFileWriterTest {

	MyFileWriter myFileWriter1; 

	@BeforeEach
	void setUp() throws Exception {
		this.myFileWriter1 = new MyFileWriter("output_test.txt");  // test output file
	}

	@Test
	public void testWriteToFile() {

		// TODO write at least 1 test case using myFileWriter1
		// Hint(s):
		// - Create an ArrayList<String> to store a list of words to write to the test file "output_test.txt"
		// - Call writeToFile to write the list of words to the file
		// - Call readWrittenFile to read the written file and compare its contents to the defined ArrayList of words above
		ArrayList<String> actualLines = new ArrayList<String>();

		// Test file with multiple words per line
		actualLines.add("hello world");
		actualLines.add("Course Name and ID");
		actualLines.add("The quick brown fox jumps over the lazy dog.");

		// Write to file
		myFileWriter1.writeToFile(actualLines);

		// Read the written file to test its contents
		ArrayList<String> expectedLines = readWrittenFile("output_test.txt");
		assertEquals(expectedLines, actualLines);

		// Test original info.txt file
		actualLines.removeAll(actualLines);
		actualLines.add("Course: MCIT_590");
		actualLines.add("CourseID: 590");
		actualLines.add("StudentID: 101");

		myFileWriter1.writeToFile(actualLines);

		expectedLines = readWrittenFile("output_test.txt");
		assertEquals(expectedLines, actualLines);

		// Test original info.txt file
		actualLines.removeAll(actualLines);
		actualLines.add("Course: MCIT_594");
		actualLines.add("CourseID: 594");
		actualLines.add("StudentID: 8598");

		myFileWriter1.writeToFile(actualLines);

		expectedLines = readWrittenFile("output_test.txt");
		assertEquals(expectedLines, actualLines);

		// Test original info.txt file
		actualLines.removeAll(actualLines);
		actualLines.add("Course: MCIT_594");
		actualLines.add("CourseID: 594");
		actualLines.add("StudentID: 8598");

		myFileWriter1.writeToFile(actualLines);

		expectedLines = readWrittenFile("output_test.txt");
		assertEquals(expectedLines, actualLines);
	}

	/**
	 * Helper method for reading in the written file to check its contents.
	 * @param writtenFilename 
	 * @return an ArrayList of the lines from the written file
	 */
	public ArrayList<String> readWrittenFile(String writtenFilename) {
		ArrayList<String> expectedLines = new ArrayList<String>();
		try {
			BufferedReader file = new BufferedReader(new FileReader(writtenFilename));
			String line = file.readLine();
			while (line != null) {
				expectedLines.add(line);
				line = file.readLine();
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return expectedLines;
	}
}