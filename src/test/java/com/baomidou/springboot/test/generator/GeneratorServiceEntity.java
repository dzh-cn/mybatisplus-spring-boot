package com.baomidou.springboot.test.generator;

import org.junit.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {

	@Test
	public void generateCode() {
		String packageName = "spring.demo.dzhh_cn.springbootmybatisdemo";
		generateByTables(packageName, "abs_mall_product", "abs_mall_security");
	}

	/**
	 *
	 * @param serviceNameStartWithI //user -> UserService, 设置成true: user -> IUserService
	 * @param packageName
	 * @param tableNames
	 */
	private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
		String dbUrl = "jdbc:mysql://172.25.28.8:3306/abs_mall";
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL)
				.setUrl(dbUrl)
				.setUsername("m_abs_mall")
				.setPassword("regbcp")
				.setDriverName("com.mysql.jdbc.Driver");
		StrategyConfig strategyConfig = new StrategyConfig()
				.setCapitalMode(true)
				.setEntityLombokModel(false)
				.setDbColumnUnderline(true)
				.setNaming(NamingStrategy.underline_to_camel)
				.setTablePrefix(new String[]{"abs_mall"})// 去掉表前缀
				.setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
		GlobalConfig config = new GlobalConfig()
				.setActiveRecord(false)
				.setAuthor(System.getProperty("user.name"))
				.setOutputDir(System.getProperty("user.dir") + "/src/main/java")
				.setFileOverride(true);
		if (!serviceNameStartWithI) {
			config.setServiceName("%sService");
		}
		new AutoGenerator().setGlobalConfig(config)
				.setDataSource(dataSourceConfig)
				.setStrategy(strategyConfig)
				.setPackageInfo(
						new PackageConfig()
								.setParent(packageName)
								.setController("controller")
								.setEntity("entity")
				).execute();
	}

	private void generateByTables(String packageName, String... tableNames) {
		generateByTables(false, packageName, tableNames);
	}
}
