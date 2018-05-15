package com.jd.absmall.service.impl;

import com.jd.absmall.entity.Security;
import com.jd.absmall.mapper.SecurityMapper;
import com.jd.absmall.service.SecurityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 证券信息表 服务实现类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-10
 */
@Service
public class SecurityServiceImpl extends ServiceImpl<SecurityMapper, Security> implements SecurityService {

}
