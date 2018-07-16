package Configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
class StringRateComparator implements Comparator< String> {

    public int compare(String o1, String o2){
        return new Double(o1).compareTo(new Double(o2));
    }

}

public class RateFinder {
	static ArrayList<String> ratesInt=new ArrayList<String>();
	public static Object Rate(String property,Date Date,String Channel,String los,String nog,String qualification,String promotion,String restriction,String RoomType,String Inclusion) throws IOException
	{
		
		
		
		
		/*System.out.println("property   "+property);
		System.out.println("channel   "+Date);
		System.out.println("date   "+Channel);
		System.out.println("rate   "+los);
		
		System.out.println("los   "+los);
		System.out.println("nog   "+nog);
		System.out.println("qual   "+qualification);
		System.out.println("Promotion   "+promotion);
		System.out.println("Restriction   "+restriction);
*/
		
		
		
		
		
		
		
		
		
		
		FileInputStream fis = new FileInputStream(Constant.configFileLoc);
		ActionKeyword.config.load(fis);	
		String configdata=	ActionKeyword.config.getProperty("config.file.sheet");
		String filesheet[]=configdata.split(",");
		
		String Filelocation=filesheet[0];
		int sitefound=0;
		int ratefound=0;
		int datefound=0;
		
		
			
		if(qualification.equalsIgnoreCase("Un-Qualified"))
			qualification="Unqualified";
		else if(qualification.equalsIgnoreCase("All"))
			qualification="";
		else
			qualification="New_Qualification";
		
		
		
		
		if(restriction.equalsIgnoreCase("Un-Restricted"))
			restriction="No";
		else if(restriction.equalsIgnoreCase("All"))
			restriction="";
		else
			restriction="Yes";

	
	
	 if(promotion.equalsIgnoreCase("Non-Promotional"))
		 promotion="No";
	 else if(promotion.equalsIgnoreCase("All"))
		 	promotion="";
		else
			promotion="Yes";
		

	 
	  if(RoomType.equalsIgnoreCase("All"))
		  RoomType="";
	 if(Inclusion.equalsIgnoreCase("All"))
		 Inclusion="";
		
		FileInputStream XlsxFileToRead = null;
		XSSFWorkbook workbook = null;
		try {
			
			File file= new File(filesheet[0]);
			XlsxFileToRead = new FileInputStream(file);
			
			//Getting the workbook instance for xlsx file
			workbook = new XSSFWorkbook(XlsxFileToRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//getting the first sheet from the workbook using sheet name. 
		// We can also pass the index of the sheet which starts from '0'.
		XSSFSheet ExcelWSheet = workbook.getSheet(filesheet[1]);
		XSSFRow row;
		XSSFRow row1;
		Iterator<Row> rows1;
		
		
		int count=0;
		
		
		int rowNumber = 0 ;
		int columnnumber = 0;
		int lastRow=ExcelWSheet.getLastRowNum();

		
		
		
		//ActionKeyword.ValuesCaptured.size()!=count &&
		 while( lastRow>rowNumber )
		 {
			 
			 if(rowNumber==54||rowNumber==53){
			// System.out.println("here");
			 }
			 
			 
			 try{
			 
			 ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
			 }catch(Exception e){
				// System.out.println("null");
				 break;
				 
			 }
			

			 
			 double filterconditionLOS=0;
			 double filterconditionGuest=0;

			 if(ExcelWSheet.getRow(rowNumber).getCell(4).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
					double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(4).getNumericCellValue();
					filterconditionLOS= Double.parseDouble(los);
				}
			 
			 if(ExcelWSheet.getRow(rowNumber).getCell(5).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
					double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(5).getNumericCellValue();
					filterconditionGuest=  Double.parseDouble(nog);
				}
			
			 
			// System.out.println(ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue());
			 
			if(ExcelWSheet.getRow(rowNumber).getCell(0).getStringCellValue().contains(property)

					&& ((ExcelWSheet.getRow(rowNumber).getCell(1).getStringCellValue().contains("Rank")
					&&ExcelWSheet.getRow(rowNumber).getCell(1).getStringCellValue().contains(Channel)&&Channel.equalsIgnoreCase("all")
					)||(ExcelWSheet.getRow(rowNumber).getCell(1).getStringCellValue().equalsIgnoreCase(Channel)
					)||(ExcelWSheet.getRow(rowNumber).getCell(1).getStringCellValue().contains(Channel)
					&&Channel.equalsIgnoreCase("all")))
					
					
					
					&& ExcelWSheet.getRow(rowNumber).getCell(2).getDateCellValue().equals(Date)
					&&
					
					
					( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(4).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(4).getStringCellValue().contains(los))
					|| (
							
							ExcelWSheet.getRow(rowNumber).getCell(4).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
							
						&&	ExcelWSheet.getRow(rowNumber).getCell(4).getNumericCellValue()==(filterconditionLOS)
					
					
					)
					
							
							
							)
							
						&&	
							
							
							( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(5).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(5).getStringCellValue().contains(nog))
					|| (
							
							ExcelWSheet.getRow(rowNumber).getCell(5).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
							
						&&	ExcelWSheet.getRow(rowNumber).getCell(5).getNumericCellValue()==(filterconditionGuest)
					
					
					)
					
							
							
							)

								&&	
							
						
							( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(6).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(6).getStringCellValue().contains(qualification))
				
					
							
							
							)
							
								&&	
							
						
							( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(7).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(7).getStringCellValue().contains(promotion))
				
					
							
							
							)
							
							
									&&	
							
						
							( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(8).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(8).getStringCellValue().contains(restriction))
				
					
							
							
							)
							
								&&( 
							
					
						(ExcelWSheet.getRow(rowNumber).getCell(9).getCellType()==XSSFCell.CELL_TYPE_STRING
						&& ExcelWSheet.getRow(rowNumber).getCell(9).getStringCellValue().contains(RoomType))
				
					
							
							
							)
							&&( 
									
									
									(ExcelWSheet.getRow(rowNumber).getCell(10).getCellType()==XSSFCell.CELL_TYPE_STRING
									&& ExcelWSheet.getRow(rowNumber).getCell(10).getStringCellValue().contains(Inclusion))
							
								
										
										
										)
					
					)
					
					{
				
				/*System.out.println("property   "+ExcelWSheet.getRow(rowNumber).getCell(0));
				System.out.println("channel   "+ExcelWSheet.getRow(rowNumber).getCell(1));
				System.out.println("date   "+ExcelWSheet.getRow(rowNumber).getCell(2));
				System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(3));
				
				System.out.println("los   "+ExcelWSheet.getRow(rowNumber).getCell(4));
				System.out.println("nog   "+ExcelWSheet.getRow(rowNumber).getCell(5));
				System.out.println("qual   "+ExcelWSheet.getRow(rowNumber).getCell(6));
				System.out.println("Restriction   "+ExcelWSheet.getRow(rowNumber).getCell(7));
				System.out.println("Promotion   "+ExcelWSheet.getRow(rowNumber).getCell(8));*/

				
				
		//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
				XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(3);
				ActionKeyword.ExcelValuesCaptured.add(cell);
			
				 
				 
				 
				 count++;
			}
			
			
			 rowNumber++;
			
			 
			 
			 
			
			
			
		 }
		 
		 
		 for (int i = 0; i < ActionKeyword.ExcelValuesCaptured.size(); i++) {
			 ratesInt.add(ActionKeyword.ExcelValuesCaptured.get(i).toString());
			 

			 
		}
		 Collections.sort(ratesInt,new StringRateComparator());
		 
		 
		 
		 if(ActionKeyword.ExcelValuesCaptured.isEmpty()){
			 
			 
		//	 System.out.println("  no matching value found in excel  ");
				ActionKeyword.ExcelValuesCaptured.add("NA");

				 ActionKeyword.ExcelValuesCaptured.get(0);
				 }else{
					 ActionKeyword.ExcelValuesCaptured.clear();
					
					 ActionKeyword.ExcelValuesCaptured.addAll(ratesInt);
					 ratesInt.clear();
				 }

		return  ActionKeyword.ExcelValuesCaptured.get(0);
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		