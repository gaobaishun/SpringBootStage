package com.gbs.staging.yamlObject;

import jakarta.validation.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "yaml-object")
//校验注解
@Validated
public class YamlObject {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;

    //jsr303校验
//    @Null 被注释的元素必须为 null
//    @NotNull 被注释的元素必须不为 null
//    @AssertTrue 被注释的元素必须为 true
//    @AssertFalse 被注释的元素必须为 false
//    @Min(value) 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
//    @Max(value) 被注释的元素必须是一个数字，其值必须小于等于指定的最大值
//    @DecimalMin(value) 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
//    @DecimalMax(value) 被注释的元素必须是一个数字，其值必须小于等于指定的最大值
//    @Size(max=, min=) 被注释的元素的大小必须在指定的范围内
//    @Digits (integer, fraction) 被注释的元素必须是一个数字，其值必须在可接受的范围内
//    @Past 被注释的元素必须是一个过去的日期
//    @Future 被注释的元素必须是一个将来的日期
//    @Pattern(regex=,flag=) 被注释的元素必须符合指定的正则表达式
//
//    Hibernate Validator 附加的注解
//    @NotBlank(message =) 验证字符串非null，且长度必须大于0
//    @Email 被注释的元素必须是电子邮箱地址
//    @Length(min=,max=) 被注释的字符串的大小必须在指定的范围内
//    @NotEmpty 被注释的字符串的必须非空
//    @Range(min=,max=,message=) 被注释的元素必须在合适的范围内

    @Email(message = "邮件格式错误")
    private String email;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public YamlObject() {
    }

    public YamlObject(String name, Integer age, Boolean happy, Date birth, String email, Map<String, Object> maps, List<Object> lists, Dog dog) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birth = birth;
        this.email = email;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "YamlObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getHappy() {
        return happy;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


}


