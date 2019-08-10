package com.cqupt.zyx.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUploadUtil {
    private static final String base = "C:\\Users\\victor\\Desktop\\SSM学习\\d14c3o\\Mall\\src\\main\\webapp\\WEB-INF\\uploadFile";
    public static String save(MultipartFile multipartFile,String fileName){
            int dir1 = fileName.hashCode()&0xf;
            int dir2 = fileName.hashCode()&0xf0;
            String path  = base+File.separator+dir1+File.separator+dir2+File.separator+fileName+".jpg";
            File file = new File(path);
            System.out.println(file.exists());
            if(!file.exists()){
                file.mkdirs();
            }
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            return null;
        }
        return path;
    }
    public static void main(String[] args){
        File file = new File("src/main/webapp/WEB-INF/uploadFile/12/64");
        if(!file.exists())
            file.mkdirs();
    }
}
