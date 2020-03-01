package com.yyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class FileTransController {

    @RequestMapping("/upload.action")
    public String upload(@RequestParam("name") String name, @RequestParam("uploadfile") List<MultipartFile> uploadfile, HttpServletRequest request){
        if(!uploadfile.isEmpty() && uploadfile.size() > 0){
            for(MultipartFile file : uploadfile){
                String originalFilename = file.getOriginalFilename();
                String dirPath = request.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                if(!filePath.exists()){
                    filePath.mkdirs();
                }
                String newFilename = name + "_" + UUID.randomUUID() + "_"+originalFilename;
                try {
                    file.transferTo(new File(dirPath + newFilename));
                } catch (IOException e) {
                    e.printStackTrace();
                    return "error";
                }
                return "success";
            }
            return "error";
        }
        return  "Failure";
    }

    @RequestMapping("/download.action")
    public String download(){
        return null;
    }
}
