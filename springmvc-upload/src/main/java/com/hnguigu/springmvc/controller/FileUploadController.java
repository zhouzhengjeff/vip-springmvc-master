package com.hnguigu.springmvc.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FileUploadController {

    /**
     * 进入文件上传的页面
     *
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {
        return "upload";
    }

    /**
     * 文件上传的处理
     *
     * @param file    MultipartFile类型的参数。参数是用来绑定表单提交的数据
     * @param request 文件上传需要确定路径，获取路径（getRealPath()）
     * @param model   上传成功后需要设置属性
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file, HttpServletRequest request, Model model) {


        // TODO 确定上传的路径
        // 1. 获取真实路径
        String path = request.getRealPath("/files");

        // 2. 真实路径实例化成File对象
        File uploadFile = new File(path);

        // 3. File对象（目录）是否存在
        if (!uploadFile.exists()) {

            // 创建目录
            uploadFile.mkdirs();
        }

        // 获取原始文件名称
        String originalFilename = file.getOriginalFilename();

        // 获取文件流
        /*try {
            inputStream = file.getInputStream();

            fileOutputStream = new FileOutputStream(new File(uploadFile, originalFilename));

            while ((i = inputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        try {
            // 源文件的流数据
            InputStream inputStream = file.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(uploadFile, originalFilename));
            IOUtils.copy(inputStream, fileOutputStream);

            model.addAttribute("message", originalFilename + "文件上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }
}

