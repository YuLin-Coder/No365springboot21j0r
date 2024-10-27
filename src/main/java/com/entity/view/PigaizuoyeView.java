package com.entity.view;

import com.entity.PigaizuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 批改作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
@TableName("pigaizuoye")
public class PigaizuoyeView  extends PigaizuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PigaizuoyeView(){
	}
 
 	public PigaizuoyeView(PigaizuoyeEntity pigaizuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, pigaizuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
