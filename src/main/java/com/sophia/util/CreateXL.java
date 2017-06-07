package com.sophia.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.sophia.usertest.vo.User;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public class CreateXL {
    /** Excel 文件要存放的位置，假定在D盘下*/
    public static String outputFile = "C:/Users/thinkpad/test1.xls";
    
    public void addCreateXL(List<User> user) {
        try {
            // 创建新的Excel 工作簿
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 在Excel工作簿中建一工作表，其名为缺省值
            // 如要新建一名为"效益指标"的工作表，其语句为：
            // HSSFSheet sheet = workbook.createSheet("效益指标");
            HSSFSheet sheet = workbook.createSheet();
            // 在索引0的位置创建行（最顶端的行）
            HSSFRow row = sheet.createRow((short)0);
            
            
            //add by Sophia 2017/06/03 convert List<User> to String for each cell in excel
            String string = "";
            
            int rowNum=0;
            	for(User temp : user){
            		int kk =0;
            		row = sheet.createRow((short) rowNum);
                	//在索引0的位置创建单元格（左上端）
                    HSSFCell cellname = row.createCell((short)kk);
                    // 定义单元格为字符串类型
                    cellname.setCellType(HSSFCell.CELL_TYPE_STRING);
                	// 在单元格中输入一些内容
                    cellname.setCellValue("name:"+temp.getName());
                    System.out.println(temp.getName());
                    kk++;
                    HSSFCell cellpassword = row.createCell((short)kk);
                    cellpassword.setCellType(HSSFCell.CELL_TYPE_STRING);
                    cellpassword.setCellValue("password:"+temp.getPassword());
                    System.out.println(temp.getPassword());
                    kk++;
                    rowNum++;
                }
            
            
            	
            
            
            // 新建一输出文件流
            FileOutputStream fOut = new FileOutputStream(outputFile);
            
            
            // 把相应的Excel 工作簿存盘
            workbook.write(fOut);
            fOut.flush();
            // 操作结束，关闭文件
            fOut.close();
            System.out.println("文件生成...");
        } catch (Exception e) {
            System.out.println("已运行 xlCreate() : " + e);
        }
    }

}
