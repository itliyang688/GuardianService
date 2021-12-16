package com.example.demo.service.impl;

import com.aliyun.oss.OSS;
import com.example.demo.entity.*;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


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
        LoginVo dengluVo = new LoginVo();
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
            dengluVo.setMsg("登陆失败");
        }
        return users;
    }

    @Override
    public int updateuser(User user) {
        return mapper.updateuser(user);
    }

//    @Override
//    public Result<String> uploadCompanyLogo(MultipartFile file) throws IOException {
//        if(file == null){
//            throw new NcException(ResponseEnum.FILE_UPLOAD_ERROR);
//        }
//
//        String contentType = file.getContentType();
//        if(! NcConstant.ALLOWED_IMG_TYPES.contains(contentType)){
//            throw new NcException(ResponseEnum.INVALID_FILE_TYPE);
//        }
//
//        if(file.getSize() > NcConstant.maxFileSize){
//            throw new NcException(ResponseEnum.FILE_SIZE_EXCEED_MAX_LIMIT);
//        }
//
//        //file.getOriginalFilename() 获取原始文件名(包含后缀)
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//        String fileName = dateFormat.format(new Date()) + file.getOriginalFilename();
//        //图片上传( 存储空间名称 ， 文件名， 文件流对象 )
//        PutObjectResult putObjectResult = oss.putObject(ossProperties.getBucketName(), fileName, file.getInputStream());
//
//        log.info("上传图片的结果："+putObjectResult.getResponse());
//        //host : https://%s.oss-cn-beijing.aliyuncs.com/
//        // bucketName: nineclock-itheima
//        //https://nineclock-itheima.oss-cn-beijing.aliyuncs.com/
//
//
//        String filePath = String.format(ossProperties.getHost() , ossProperties.getBucketName())  + fileName;
//        log.info("企业logo路径："+filePath);
//        return filePath;
//    }


}
