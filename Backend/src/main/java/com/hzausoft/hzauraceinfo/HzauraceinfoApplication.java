package com.hzausoft.hzauraceinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@MapperScan(basePackages = {"com.hzausoft.hzauraceinfo.dao"})
public class HzauraceinfoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HzauraceinfoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(HzauraceinfoApplication.class);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

	}
}