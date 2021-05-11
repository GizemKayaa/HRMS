package kodlamaIo.hrms.api.controllers;
import kodlamaIo.hrms.entities.concretes.Job;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.hrms.business.abstracts.JobService;

@RestController
@RequestMapping("/api/jobpositions")
public class JobsController {
	
	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/getall")
	public List<Job> getAll(){
		
		return this.jobService.getAll();
		
	}

}
