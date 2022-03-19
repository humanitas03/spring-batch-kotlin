package com.example.springbatchkotlin.runner

import org.springframework.batch.core.Job
import org.springframework.batch.core.JobParametersBuilder
import org.springframework.batch.core.launch.JobLauncher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class JobRunner @Autowired constructor(
    val jobLauncher: JobLauncher,
    val job: Job
) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val jobParameters = JobParametersBuilder()
            .addString("name", "user1")
            .toJobParameters()

        jobLauncher.run(job, jobParameters)
    }
}
