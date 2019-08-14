package com.cqupt.zyx.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileUploadUtil {
    private static final String base = "C:\\Users\\victor\\Desktop\\SSM学习\\d14c3o\\Mall\\src\\main\\webapp\\upload\\";
    public static String save(MultipartFile multipartFile,String fileName){
            int dir1 = fileName.hashCode()&0xf;
            int dir2 = fileName.hashCode()&0xf0;

            String path  = base + dir1+File.separator+dir2+File.separator;
            File file = new File(path,new Date().getTime()+".jpg");
            if(!file.getParentFile().exists())
                file.getParentFile().mkdirs();
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return file.getPath().substring(58);
    }
    public static void main(String[] args){
    System.out.println("C:\\Users\\victor\\Desktop\\SSM学习\\d14c3o\\Mall\\src\\main\\webapp\\upload\\".lastIndexOf("upload"));
        System.out.println("C:\\Users\\victor\\Desktop\\SSM学习\\d14c3o\\Mall\\src\\main\\webapp\\upload\\".substring(58));

    }

}
