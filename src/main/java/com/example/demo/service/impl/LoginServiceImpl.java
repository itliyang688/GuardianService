package com.example.demo.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectResult;
import com.example.demo.constant.NcConstant;
import com.example.demo.entity.*;
import com.example.demo.enums.ResponseEnum;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper mapper;

    @Autowired
    OSS oss;

    @Autowired
    OssProperties ossProperties;

    @Override
    public UsersResult login(User user) {
        String username = user.getUsername();

        DataBean user1 = mapper.getwdfls(username);
        LoginVo loginVo = new LoginVo();
        UsersResult users = new UsersResult();

        if (user1 != null) {
            String password = user.getPasswd();
            String dbPwd = user1.getPassWord();
            if (password.equals(dbPwd)) {
//                dengluVo.setCode(200);
//                dengluVo.setFlag(true);
//                dengluVo.setMsg("登陆成功");
//                return dengluVo;
                users.setCode("1");
                users.setMsg("ok");
                users.setData(Arrays.asList(user1));
            } else {
                users.setCode("2");
                users.setMsg("no");
                users.setData(Arrays.asList(user1));
            }
        } else {
            loginVo.setMsg("登陆失败");
        }
        return users;
    }

    @Override
    public UsersResult updateuser(User user) {
//        前端
        String username = user.getUsername();

        UsersResult usersResult = new UsersResult();
//        String fullname = user.getFullname();

        int user1 = mapper.updateuser(user);
        DataBean dataBean = mapper.getwdfls(username);
        LoginVo loginVo = new LoginVo();
        if (user1!=0){
                usersResult.setCode("1");
                usersResult.setMsg("ok");
                usersResult.setData(Arrays.asList(dataBean));
            } else {
                usersResult.setCode("2");
                usersResult.setMsg("no");
        }
        return usersResult;
    }


    @Override
    public UsersResult uploadCompanyLogo(MultipartFile file, String username) throws IOException {
        if(file == null){
            throw new RuntimeException(ResponseEnum.FILE_UPLOAD_ERROR.getMessage());
        }

        String contentType = file.getContentType();
        if(! NcConstant.ALLOWED_IMG_TYPES.contains(contentType)){
            throw new RuntimeException(ResponseEnum.INVALID_FILE_TYPE.getMessage());
        }

        if(file.getSize() > NcConstant.maxFileSize){
            throw new RuntimeException(ResponseEnum.FILE_SIZE_EXCEED_MAX_LIMIT.getMessage());
        }

        //file.getOriginalFilename() 获取原始文件名(包含后缀)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String fileName = dateFormat.format(new Date()) + file.getOriginalFilename();
        //图片上传( 存储空间名称 ， 文件名， 文件流对象 )
        PutObjectResult putObjectResult = oss.putObject(ossProperties.getBucketName(), fileName, file.getInputStream());

        System.out.println("上传图片的结果："+putObjectResult.getResponse());
        //host : https://%s.oss-cn-beijing.aliyuncs.com/
        // bucketName: nineclock-itheima
        //https://nineclock-itheima.oss-cn-beijing.aliyuncs.com/


        String filePath = String.format(ossProperties.getHost() , ossProperties.getBucketName())  + fileName;
        System.out.println("企业logo路径："+filePath);

        UsersResult usersResult = new UsersResult();
        int user1 = mapper.uploadCompanyLogo(filePath, username);
        DataBean dataBean = mapper.getwdfls(username);
        if (user1!=0){
            usersResult.setCode("1");
            usersResult.setMsg("ok");
            usersResult.setData(Arrays.asList(dataBean));
        } else {
            usersResult.setCode("2");
            usersResult.setMsg("no");
        }
        return usersResult;
    }

    @Override
    public HomePage homePageTask(User user) {
        HomePage homePage = new HomePage();
        String username = user.getUsername();
        DataBean user1 = mapper.getwdfls(username);
        List<DataBeanone> home = mapper.homePageTask(user);
        if (username.equals(user1)){
            homePage.setCode("2");
            homePage.setMsg("no");
            homePage.setSize(12);
        }else {
            homePage.setCode("1");
            homePage.setMsg("ok");
            homePage.setSize(12);
            homePage.setData(home);

        }
        return homePage;
    }


}
