import java.io.*;
public class TestBuffereredStreams {

	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("file2");
			BufferedReader bufInput = new BufferedReader(input);
			
			try {
				FileWriter output = new FileWriter("file3");
				BufferedWriter bufOutput = new BufferedWriter(output);
				try {
					String line ;
					line  = bufInput.readLine();
					while ( line != null) {
						bufOutput.write(line, 0, line.length());
						bufOutput.newLine();
						line  = bufInput.readLine();
					}
				}finally {
					bufOutput.close();
				}
			}finally {
				bufInput.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
