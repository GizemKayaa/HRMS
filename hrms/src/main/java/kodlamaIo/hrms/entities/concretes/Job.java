package kodlamaIo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobpositions")
public class Job {

	    @Id
	    @GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String position;
		
		public Job(){
			
		}

		public Job(int id, String position) {
			super();
			this.id = id;
			this.position = position;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
}
