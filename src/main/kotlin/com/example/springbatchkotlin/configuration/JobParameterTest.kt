//package com.example.springbatchkotlin.configuration
//
//import org.springframework.batch.core.Job
//import org.springframework.batch.core.JobParametersBuilder
//import org.springframework.batch.core.launch.JobLauncher
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.ApplicationArguments
//import org.springframework.boot.ApplicationRunner
//import org.springframework.stereotype.Component
//import java.util.Date
//
//@Component
//class JobParameterTest @Autowired constructor(
//    val jobLauncher: JobLauncher,
//    val job: Job
//) : ApplicationRunner {
//    override fun run(args: ApplicationArguments?) {
//       val jobParameters =  JobParametersBuilder()
//            .addString("name", "user1")
//            .addLong("seq", 2L)
//            .addDate("date", Date())
//            .addDouble("age", 16.5)
//            .toJobParameters()
//
//        jobLauncher.run(job, jobParameters)
//    }
//}