package com.example.demo.mapper;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface LoginMapper {
    @Select("select * from users where username = #{username} limit 1")
    DataBean getwdfls(String username);

    @Update("update users set fullname=#{fullname} where username=#{username}")
    int updateuser(User user);

    @Update("update users set filepath=#{filepath} where username=#{username}")
    int uploadCompanyLogo(@Param("filepath") String filepath, @Param("username") String username);

    @Select("SELECT * FROM associatedmenu LEFT JOIN users on users.menus = associatedmenu.menus LEFT JOIN menuusers on menuusers.tepy=associatedmenu.tepy WHERE users.username= #{username}")
    List<DataBeanone> homePageTask(User user);

    @Insert("INSERT INTO thestore (floor,industry_id,inforshopID,shop_address,shop_has_device,shop_lat,shop_lng,shop_look_type,shop_name,size,username) VALUES (floor=#{floor},industry_id=#{industry_id},inforshopID=#{inforshopID},shop_address=#{shop_address},shop_has_device={shop_has_device},shop_lat={shop_lat},shop_lng=#{shop_lng},shop_look_type=#{shop_look_type},shop_name=#{shop_name},size=#{size},username=#{username})")
    int addStore(Contactorsone contactors);

    @Insert("INSERT INTO contactors (contactorsId,conType,thestoreId,`name`,position,qq\n" +
            ",remark,telephone,weixin) VALUES (contactorsId=#{contactorsId},conType=#{conType},thestoreId=#{thestoreId},name=#{`name`},position=#{position},qq=#{qq}\\n\" +\n" +
            "            \",remark=#{remark},telephone=#{telephone},weixin=#{weixin})")
    int addUserInt(ContactorsBean contactorsBean);
}


