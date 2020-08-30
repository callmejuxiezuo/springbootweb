package com.sinopac.springbootweb.controller;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 * @author hp
 */
@RestController
public class FileController {

    @PostMapping("/fileupload")
    // file参数的名字需和页面的名字一致，否则会NULL
    public void fileUpload(MultipartFile file) throws IOException {
        // 默认大小是1M
        System.out.println("文件名：" + file.getOriginalFilename());
        System.out.println("文件存放路径：" + ResourceUtils.getURL("classpath:static/file").getPath());
        file.transferTo(new File(ResourceUtils.getURL("classpath:static/file").getPath() + "reload.txt"));
    }
}
