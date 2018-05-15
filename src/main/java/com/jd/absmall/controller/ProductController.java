package com.jd.absmall.controller;


import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jd.absmall.entity.Product;
import com.jd.absmall.mapper.ProductMapper;
import com.jd.absmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-10
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("queryAll")
	Object queryAll() {
		Page<Product> page = new Page<>();
		Wrapper<Product> wrapper = new Condition();
		wrapper.between("product_id", 1, 3);
		productService.selectPage(page, wrapper);
		return page;
	}
}

