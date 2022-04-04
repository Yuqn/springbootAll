package com.yuqn.controller;

import com.yuqn.entity.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
public class RedisController {

//    创建保存RedisTemplate的对象，java依靠RedisTemplate操作redis，可以手动设置序列化类型，一般设置json
    @Resource
    private RedisTemplate redisTemplate;
//    这个有序列化string类型
    @Resource
    private StringRedisTemplate stringRedisTemplate;

//    string类型添加数据到数据库
    @GetMapping(value = "/setRed/{id}/{name}")
    public String redisSet(@PathVariable String id,@PathVariable String name){
//        指定操作的数据类型
        ValueOperations red=stringRedisTemplate.opsForValue();
//        对数据库进行操作
        red.set("id",id);
        red.set("name",name);
        return "添加成功，id为"+id+"name为"+name;
    }


//    查询数据库
    @GetMapping(value = "/getRed/{id}/{name}")
    public String redisGet(@PathVariable String id,@PathVariable String name){
//        指定操作数据类型
        ValueOperations red=stringRedisTemplate.opsForValue();

        System.out.println(id);
        System.out.println(name);
//        对数据库进行操作
        String getid=red.get(id).toString();
        String getname=red.get(name).toString();

        return "id为" + getid + "name为" + getname;
    }

//    =========================使用自定义序列化类型==================================
    @GetMapping(value = "/setStu/{sid}/{sname}")
    public String setStu(@PathVariable String sid,@PathVariable String sname){

        Student student=new Student(1,"yuqn");

//        手动设置redisTemplate的序列化格式，设置为字符串类型，跟StringRedisTemplate一样
        redisTemplate.setKeySerializer( new StringRedisSerializer());
//        手动设置redisTemplate的序列化格式，设置为json类型存储对象
        redisTemplate.setValueSerializer( new Jackson2JsonRedisSerializer( Student.class));
//        设置添加数据类型
        ValueOperations red=redisTemplate.opsForValue();
//        添加数据
        red.set("sStudent",student);
        return "序列化添加成功";
    }

    @GetMapping(value = "/getStu/{sid}/{sname}")
    public String getStu(@PathVariable String sid,@PathVariable String sname){

//        手动设置redisTemplate的序列化格式，设置为字符串类型，跟StringRedisTemplate一样
        redisTemplate.setKeySerializer( new StringRedisSerializer());
//        手动设置redisTemplate的序列化格式，设置为json类型存储对象
        redisTemplate.setValueSerializer( new Jackson2JsonRedisSerializer( Student.class));
//        设置添加数据类型
        ValueOperations red=redisTemplate.opsForValue();
//        添加数据
        Object obj=red.get("sStudent");
        return obj.toString();
    }

}
