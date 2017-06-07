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
    /** Excel �ļ�Ҫ��ŵ�λ�ã��ٶ���D����*/
    public static String outputFile = "C:/Users/thinkpad/test1.xls";
    
    public void addCreateXL(List<User> user) {
        try {
            // �����µ�Excel ������
            HSSFWorkbook workbook = new HSSFWorkbook();
            // ��Excel�������н�һ����������Ϊȱʡֵ
            // ��Ҫ�½�һ��Ϊ"Ч��ָ��"�Ĺ����������Ϊ��
            // HSSFSheet sheet = workbook.createSheet("Ч��ָ��");
            HSSFSheet sheet = workbook.createSheet();
            // ������0��λ�ô����У���˵��У�
            HSSFRow row = sheet.createRow((short)0);
            
            
            //add by Sophia 2017/06/03 convert List<User> to String for each cell in excel
            String string = "";
            
            int rowNum=0;
            	for(User temp : user){
            		int kk =0;
            		row = sheet.createRow((short) rowNum);
                	//������0��λ�ô�����Ԫ�����϶ˣ�
                    HSSFCell cellname = row.createCell((short)kk);
                    // ���嵥Ԫ��Ϊ�ַ�������
                    cellname.setCellType(HSSFCell.CELL_TYPE_STRING);
                	// �ڵ�Ԫ��������һЩ����
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
            
            
            	
            
            
            // �½�һ����ļ���
            FileOutputStream fOut = new FileOutputStream(outputFile);
            
            
            // ����Ӧ��Excel ����������
            workbook.write(fOut);
            fOut.flush();
            // �����������ر��ļ�
            fOut.close();
            System.out.println("�ļ�����...");
        } catch (Exception e) {
            System.out.println("������ xlCreate() : " + e);
        }
    }

}
