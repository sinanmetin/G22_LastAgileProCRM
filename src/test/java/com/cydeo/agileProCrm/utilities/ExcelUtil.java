package com.cydeo.agileProCrm.utilities;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtil {

    private static FileInputStream  fileInputStream;
    private static XSSFWorkbook  workbook;
    private static FileOutputStream fileOutputStream;


    static {

        try {
            fileInputStream = new FileInputStream(ConfigurationReader.getProperty("excel.filePath"));
            workbook = new XSSFWorkbook(fileInputStream);

        }catch (IOException e){
            System.out.println("File couldn't find");
            e.printStackTrace();
        }
    }


    public static XSSFSheet openAndGetSheet(String sheetName) {
            return workbook.getSheet(sheetName);
    }


    public static void fileSaveAndCloseAll(){

        try {
            fileOutputStream=new FileOutputStream(ConfigurationReader.getProperty("excel.filePath"));
            workbook.write(fileOutputStream);

            fileOutputStream.close();
            workbook.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("File couldn't save");
        }

    }

    public static void fileSave(){

        try {
        fileOutputStream=new FileOutputStream(ConfigurationReader.getProperty("credentialsExcel.filePath"));
        workbook.write(fileOutputStream);
        } catch (IOException e) {
            System.out.println("File couldn't save");
        }

    }












}
