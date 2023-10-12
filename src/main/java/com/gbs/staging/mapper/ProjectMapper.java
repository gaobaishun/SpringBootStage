package com.gbs.staging.mapper;

import com.gbs.staging.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectMapper {
    List<Project> getAllProject();
}
