//package com.example.springbatchkotlin.configuration
//
//import org.springframework.batch.core.Job
//import org.springframework.batch.core.Step
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
//import org.springframework.batch.repeat.RepeatStatus
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class JobInstanceConfiguration constructor(
//    val jobBuilderFactory: JobBuilderFactory,
//    val stepBuilderFactory: StepBuilderFactory
//) {
//
//    @Bean
//    fun job(): Job = jobBuilderFactory.get("job").start(step1()).next(step2()).build()
//
//    @Bean
//    fun step1(): Step {
//        return stepBuilderFactory.get("step1")
//            .tasklet { contribution, chunkContext ->
//
//                var fromContribution = contribution.stepExecution.jobExecution.jobParameters
//                fromContribution.getString("name")
//                fromContribution.getLong("seq")
//                fromContribution.getDate("date")
//                fromContribution.getDouble("age")
//
//                var fromChunkContext = chunkContext.stepContext.jobParameters
//                fromChunkContext.forEach { t, u -> println("$t : $u")  }
//
//                System.out.println("Step1 has executed")
//                RepeatStatus.FINISHED }
//            .build()
//    }
//
//    @Bean
//    fun step2(): Step {
//        return stepBuilderFactory.get("step2")
//            .tasklet { contribution, chunkContext -> RepeatStatus.FINISHED }
//            .build()
//    }
//}
