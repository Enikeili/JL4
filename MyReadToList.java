package MyReadToList;

import java.io.FileReader;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;

import Entitys.Gender;
import Entitys.Man;

/**
 * Class MyReadToList, fields: list of mans, path to csv file, separator
 * @author enikeili
 */
public class MyReadToList
{
	private String csvFilePath;
	private char separator;
	private List<Man> mans;
	/**
	 * Constructor with parameters for a MyReadToList class object
	 * @param csvFilePath the path to resource csv file
	 * @param separator the separator between fields in csv file
	 * @param mans the list of the mans
	 */
	public MyReadToList(String csvFilePath, char separator, List<Man> mans)
	{
		this.csvFilePath = csvFilePath;
		this.separator = separator;
		this.mans = mans;
	}
	/**
	 * Getter for the path to csv file
	 * @return the csvFilePath
	 */
	public String getCsvFilePath()
	{
		return csvFilePath;
	}
	/**
	 * Setter for the path to csv file
	 * @param csvFilePath the path to csv file to set
	 */
	public void setCsvFilePath(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}
	/**
	 * Getter for the separator
	 * @return the separator
	 */
	public char getSeparator()
	{
		return separator;
	}
	/**
	 * Setter for the separator
	 * @param separator the separator to set
	 */
	public void setSeparator(char separator)
	{
		this.separator = separator;
	}
	/**
	 * Getter for the list of mans
	 * @return the mans
	 */
	public List<Man> getMans()
	{
		return mans;
	}
	/**
	 * Setter for the list of mans
	 * @param mans the list of mans to set
	 */
	public void setMans(List<Man> mans)
	{
		this.mans = mans;
	}
	/**
	 * Adds to list data from csv file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void readFromCSVToList()
	{
		 try (FileReader in = new FileReader(csvFilePath))
		 {
			 	CSVParser parser = new CSVParserBuilder().withSeparator(separator).build();
			 	CSVReader reader = new CSVReaderBuilder(in).withCSVParser(parser).withSkipLines(1).build();
	            if (reader == null)
	            {
	                throw new CsvValidationException(csvFilePath);
	            }
	            String[] nextLine;
	            while ((nextLine = reader.readNext()) != null)
	            {
	            	Man man = new Man(Integer.valueOf(nextLine[0]), nextLine[1], Gender.valueOf(nextLine[2]), nextLine[4], Integer.valueOf(nextLine[5]), nextLine[3]);
	            	mans.add(man);
	            	System.out.print(nextLine);
	            }
	            
		 }

		 catch(FileNotFoundException e2)
		 {
			 System.out.print("FileNotFoundException");
		 }
		 catch(IOException e1)
		 {
			 System.out.print("IOException");
		 }
		 catch(CsvValidationException e)
		 {
			 System.out.print("CsvValidationException");
		 }
	}
	public void printMans()
	{
		for(int i=0; i<mans.size(); i++)
		{
			System.out.println(mans.get(i).getId()+"|"+mans.get(i).getName()+"|"+mans.get(i).getGender()+"|"+mans.get(i).getDivision()+"|"+mans.get(i).getSalary()+"|"+mans.get(i).getBirthday());
		}
	}
}
