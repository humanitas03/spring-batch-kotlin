package com.example.springbatchkotlin.configuration

import mu.KotlinLogging
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.repeat.RepeatStatus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

private val log = KotlinLogging.logger { }

@Configuration
class SampleJobConfiguration @Autowired constructor(
    private val jobBuilderFactory: JobBuilderFactory,
    private val stepBuilderFactory: StepBuilderFactory
) {

    @Bean
    fun sampleJob(): Job = jobBuilderFactory.get("sampleJob").start(sampleStep()).build()

    @Bean
    fun sampleStep(): Step = stepBuilderFactory.get("helloStep").tasklet { _, _ ->
        log.info("==========================================")
        log.info("Hello Spring batch")
        log.info("==========================================")
        RepeatStatus.FINISHED
    }.build()
}
