package com.ylh.modules.quarts.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylh.modules.quarts.entity.QuartzJob;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 定时任务在线管理
 * @Author: jeecg-boot
 * @Date:  2019-01-02
 * @Version: V1.0
 */
@Mapper
public interface QuartzJobMapper extends BaseMapper<QuartzJob> {

	public List<QuartzJob> findByJobClassName(@Param("jobClassName") String jobClassName);

	boolean save(@Param("quartzJob")  QuartzJob quartzJob);
}
