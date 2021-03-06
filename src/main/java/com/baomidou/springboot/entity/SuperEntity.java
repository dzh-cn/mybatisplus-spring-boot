package com.baomidou.springboot.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 演示实体父类
 */
@TableName("user")
public class SuperEntity /*extends Model<T>*/ {

	/**
	 * 主键ID , 这里故意演示注解可以无
	 */
	@TableId("test_id")
	private Long id;
	private Long tenantId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

//    @Override
//    protected Serializable pkVal() {
//        return this.id;
//    }
}
