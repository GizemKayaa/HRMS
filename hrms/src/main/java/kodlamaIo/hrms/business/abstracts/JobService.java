package kodlamaIo.hrms.business.abstracts;

import java.util.List;

import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;
import kodlamaIo.hrms.entities.concretes.Job;


public interface JobService {

	DataResult<List<Job>>  getAll();
	Result add(Job job);
}
