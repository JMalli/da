package newalgoutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static List<String> readExcelSheet() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/Excel/ArrayData.xlsx";
        File excelFile = new File(path);
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        List<String> cellValuesList = new ArrayList<>();

        Iterator<Row> row = sheet.rowIterator();
        while (row.hasNext()) {
            Row ctrow = row.next();
            Iterator<Cell> cell = ctrow.cellIterator();
            while (cell.hasNext()) {
                Cell ctcell = cell.next();
                cellValuesList.add(ctcell.getStringCellValue());
            }
        }

        workbook.close();
        fis.close();

        return cellValuesList;
    }

    public static void main(String[] args) throws IOException {
        List<String> cellValuesList = readExcelSheet();
        for (String rowValues : cellValuesList) {
            System.out.println("Row Values: " + rowValues);
        }
    }
}
