package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobTitleManager implements JobPositionService {

	
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public List<JobPosition> getAll() {
		
		return jobTitleDao.findAll();
	}

}
