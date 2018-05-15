package spring.demo.dzhh_cn.springbootmybatisdemo.service.impl;

import spring.demo.dzhh_cn.springbootmybatisdemo.entity.Security;
import spring.demo.dzhh_cn.springbootmybatisdemo.mapper.SecurityMapper;
import spring.demo.dzhh_cn.springbootmybatisdemo.service.SecurityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 证券信息表 服务实现类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
@Service
public class SecurityServiceImpl extends ServiceImpl<SecurityMapper, Security> implements SecurityService {

}
