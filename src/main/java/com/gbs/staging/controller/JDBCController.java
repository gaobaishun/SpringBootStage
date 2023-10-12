package com.gbs.staging.controller;


import com.gbs.staging.mapper.ProjectMapper;
import com.gbs.staging.pojo.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

   private static Logger logger= LogManager.getLogger(JDBCController.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired(required = false)
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    ProjectMapper projectMapper;

    @GetMapping("/getData")
    public List<Map<String,Object>> getData(){
        String sql = "select * from test.project";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        logger.info(maps.toString());
        return maps;
    }

    @GetMapping("/getData2")
    public List<Project> getData2(){
        List<Project> allProject = projectMapper.getAllProject();
        return allProject;
    }
}
