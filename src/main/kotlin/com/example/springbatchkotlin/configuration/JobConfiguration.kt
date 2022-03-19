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
//class JobConfiguration constructor(
//    val jobBuilderFactory: JobBuilderFactory,
//    val stepBuilderFactory: StepBuilderFactory
//) {
//
//    @Bean
//    fun job(): Job {
//        return jobBuilderFactory.get("job")
//            .start(step1())
//            .next(step2())
//            .build()
//    }
//
//    @Bean
//    fun step1(): Step {
//        return stepBuilderFactory.get("step1")
//            .tasklet {
//                _, _ ->
//                println("step1 was executed")
//                RepeatStatus.FINISHED
//            }.build()
//    }
//
//    @Bean
//    fun step2(): Step {
//        return stepBuilderFactory.get("step1")
//            .tasklet {
//                _, _ ->
//                println("step2 was executed")
//                RepeatStatus.FINISHED
//            }.build()
//    }
//}
