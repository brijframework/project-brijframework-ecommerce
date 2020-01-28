package org.brijframework.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class SpringConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/style/**").addResourceLocations("/resources/style/");
		registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/tiles-defs.xml", "/WEB-INF/jsp/**/views.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}

	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		tilesViewResolver.setOrder(1);
		return tilesViewResolver;
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/WEB-INF/jsp/");
		resourceViewResolver.setSuffix(".jsp");
		resourceViewResolver.setOrder(2);
		return resourceViewResolver;
	}

	@Bean("pdfView")
	public XmlViewResolver getPdfViewResolver() {
		XmlViewResolver resolver=new XmlViewResolver();
		Resource location=new ClassPathResource("spring-pdf-views.xml");
		resolver.setLocation(location);
		resolver.setOrder(0);
		return resolver;
	}
	
	@Bean("jasperView")
	public XmlViewResolver getJasperViewResolver() {
		XmlViewResolver resolver=new XmlViewResolver();
		Resource location=new ClassPathResource("jasper-views.xml");
		resolver.setLocation(location);
		resolver.setOrder(1);
		return resolver;
	}
	
	@Bean("excelView")
	public ViewResolver getExcelViewResolver() {
		XmlViewResolver resolver=new XmlViewResolver();
		Resource location=new ClassPathResource("spring-excel-views.xml");
		resolver.setLocation(location);
		resolver.setOrder(1);
		return resolver;
	}
	
	
}
