package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class MyController {
    private static final String FILE_DIRECTORY="D:/bank";
    @PostMapping("/upload")
    public String file(MultipartFile multipartFile){

        String filename = multipartFile.getOriginalFilename();
        String path  = FILE_DIRECTORY+ File.separator+filename;
        File file = new File(path);
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamResource> download(String filename) throws UnsupportedEncodingException, FileNotFoundException {
        String fullPath =  FILE_DIRECTORY+File.separator+filename;
        File file = new File(fullPath);
        String mediatype  = URLConnection.guessContentTypeFromName(filename);
        if (mediatype==null){
            mediatype = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        System.out.println("mediatype = " + mediatype);
        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.setContentType(MediaType.parseMediaType(mediatype));

        respHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));
        InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(inputStreamResource,respHeaders, HttpStatus.OK);
    }
}
