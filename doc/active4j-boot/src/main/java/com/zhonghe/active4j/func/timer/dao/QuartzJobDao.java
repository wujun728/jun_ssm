package com.zhonghe.active4j.func.timer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhonghe.active4j.func.timer.entity.QuartzJobEntity;

/**
 * 
 * @title QuartzJobDao.java
 * @description 
 * @time  2019年12月9日 下午4:40:09
 * @author guyp
 * @version 1.0
 */
public interface QuartzJobDao extends BaseMapper<QuartzJobEntity>{
	
	/**
	 * 
	 * @description
	 *  	根据任务id更新状态
	 * @params
	 *      job 定时任务实体
	 * @return void
	 * @author guyp
	 * @time 2019年12月10日 下午10:47:41
	 */
	public void updateJobById(QuartzJobEntity job);
}
