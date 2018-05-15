package spring.demo.dzhh_cn.springbootmybatisdemo.service.impl;

import spring.demo.dzhh_cn.springbootmybatisdemo.entity.Product;
import spring.demo.dzhh_cn.springbootmybatisdemo.mapper.ProductMapper;
import spring.demo.dzhh_cn.springbootmybatisdemo.service.ProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
