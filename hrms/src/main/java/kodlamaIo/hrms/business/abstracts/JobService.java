package kodlamaIo.hrms.business.abstracts;

import java.util.List;

import kodlamaIo.hrms.entities.concretes.Job;


public interface JobService {

	List<Job> getAll();
}
