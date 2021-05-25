package kodlamaIo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.hrms.business.abstracts.JobService;
import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;
import kodlamaIo.hrms.core.utilities.results.SuccessDataResult;
import kodlamaIo.hrms.core.utilities.results.SuccessResult;
import kodlamaIo.hrms.dataAccess.abstracts.JobDao;
import kodlamaIo.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<Job>>  getAll() {
		
		return new SuccessDataResult<List<Job>>
		(this.jobDao.findAll(),"Data Listelendi"); 
				
	}

	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Ürün eklendi");
	}


}
