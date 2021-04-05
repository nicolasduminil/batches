package fr.dsirc.ecd;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.web.servlet.support.*;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class EcdBatchApplication extends SpringBootServletInitializer
{
	public static void main(String[] args)
	{
		SpringApplication.run(EcdBatchApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(EcdBatchApplication.class);
	}
}
