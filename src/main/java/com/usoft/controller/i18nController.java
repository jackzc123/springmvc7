package com.usoft.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.naming.Name;
import java.io.File;
import java.io.IOException;

/**
 * @author zc
 * @create 2019-05_02-14:23
 */
@Controller
public class i18nController {

    /**
     * i18n国际化测试
     * @return
     */
    @RequestMapping(value = "/i18n", method = RequestMethod.GET)
    public String i18ntest(){
        return "i18n";
    }

    @RequestMapping(value = "/fileUp", method = RequestMethod.POST)
    public String fileUploade(@RequestParam("file")MultipartFile file, @RequestParam("desc")String desc) throws IOException {
        if (!file.isEmpty()){
            System.out.println(desc);
            String path = "E:\\IdeaProjects\\springmvc7\\src\\main\\resources\\";
            String name = file.getOriginalFilename();
            File file1 = new File(path , name);
            file.transferTo(file1);
        }
        return "i18n";
    }

    @RequestMapping(value = "/xiazai", method = RequestMethod.GET)
    public ResponseEntity<byte[]> xiazai() throws IOException {
        String path = "E:\\IdeaProjects\\springmvc7\\src\\main\\resources\\";
        String name = "引入bootstrap.txt";
        File file = new File(path, name);
        byte[] body = FileUtils.readFileToByteArray(file);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-disposition", "attachment;filename=引入bootstrap.txt");
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity =
                new ResponseEntity<>(body, httpHeaders, httpStatus);
        return  responseEntity;
    }

}
