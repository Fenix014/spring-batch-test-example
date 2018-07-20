package hello;

import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean {
	 @Bean
	JobLauncherTestUtils jobLauncherTestUtils() {
         return new JobLauncherTestUtils();
     }
}
