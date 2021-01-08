package xyz.lixiangyu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.lixiangyu.config.AnnotationConfig;
import xyz.lixiangyu.entity.Entity;

public class TestBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Entity entity = annotationConfigApplicationContext.getBean(Entity.class);
		entity.hello();
	}
}
