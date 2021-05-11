package kodlamaIo.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIo.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer > {

	
}
