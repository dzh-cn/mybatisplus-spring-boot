package com.jd.absmall.service.impl;

import com.jd.absmall.entity.Product;
import com.jd.absmall.mapper.ProductMapper;
import com.jd.absmall.service.ProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-10
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
