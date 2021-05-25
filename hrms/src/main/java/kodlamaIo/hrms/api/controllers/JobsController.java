package kodlamaIo.hrms.api.controllers;
import kodlamaIo.hrms.entities.concretes.Job;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.hrms.business.abstracts.JobService;
import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;

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
	public DataResult<List<Job>> getAll(){
		
		return this.jobService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	

}
