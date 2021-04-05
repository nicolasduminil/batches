package fr.dsirc.ecd.config;

import org.slf4j.*;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.core.launch.support.*;
import org.springframework.batch.core.scope.context.*;
import org.springframework.batch.core.step.tasklet.*;
import org.springframework.batch.repeat.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

@EnableBatchProcessing
@Configuration
public class EcdJobConfig
{
	private Logger logger = LoggerFactory.getLogger(EcdJobConfig.class);
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Bean
	public Job job() throws Exception
	{
		return this.jobBuilderFactory.get("integrerECDBrouillard").incrementer(new RunIdIncrementer()).start(b10ControleParametres()).next(b20FusionTasklet()).next(b30TriTasklet())
		    .next(b40SplitterIntegrerECDTasklet()).next(b50IntegrerECDBrouillardM()).next(b60FusionnerFichierAnomalie()).build();
	}

	@Bean
	public Step b10ControleParametres()
	{
		return this.stepBuilderFactory.get("b10ControleParametres").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	@Bean
	public Step b20FusionTasklet()
	{
		return this.stepBuilderFactory.get("b20FusionTasklet").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	@Bean
	public Step b30TriTasklet()
	{
		return this.stepBuilderFactory.get("b30TriTasklet()").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	@Bean
	public Step b40SplitterIntegrerECDTasklet()
	{
		return this.stepBuilderFactory.get("b40SplitterIntegrerECDTasklet()").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	@Bean
	public Step b50IntegrerECDBrouillardM()
	{
		return this.stepBuilderFactory.get("b50IntegrerECDBrouillardM").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	@Bean
	public Step b60FusionnerFichierAnomalie()
	{
		return this.stepBuilderFactory.get("b60FusionnerFichierAnomalie()S").tasklet(new Tasklet()
		{
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			{
				logger.info("### EcdJobConfig.b10ControleParametres()");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}
}
