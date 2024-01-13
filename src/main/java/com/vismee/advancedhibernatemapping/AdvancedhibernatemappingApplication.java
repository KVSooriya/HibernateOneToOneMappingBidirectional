package com.vismee.advancedhibernatemapping;

import com.vismee.advancedhibernatemapping.dao.AppDAO;
import com.vismee.advancedhibernatemapping.entity.Instructor;
import com.vismee.advancedhibernatemapping.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvancedhibernatemappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedhibernatemappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO)
	{
		return runner -> {
		       // createInstructor(appDAO);
		       // findInstructorById(appDAO);
			   // deleteInstructorById(appDAO);

			   // findInstructorDetailById(appDAO);
			   // deleteInstructorDetailById(appDAO);
		};
	}

	private void deleteInstructorDetailById(AppDAO appDAO)
	{
		System.out.println("Deleting instructor detail from db");
		int id=2;
		appDAO.deleteInstructorDetailById(id);
	}

	private void findInstructorDetailById(AppDAO appDAO)
	{
		System.out.println("Fetching Instructor details");
        int id = 2;
		InstructorDetail instructorDetail = appDAO.findInstructorDetailById(id);
		System.out.println("Instructor detail " + instructorDetail);
		System.out.println("Instructor " +instructorDetail.getInstructor());
	}


	private void deleteInstructorById(AppDAO appDAO)
	{
		System.out.println("Deleting instructor By Id");
		int id = 1;
		appDAO.deleteInstructorById(id);
	}

	private void findInstructorById(AppDAO appDAO)
	{
		System.out.println("Fetching instructor and details by id");
		int instructorId = 1;
		Instructor instructor = appDAO.findInstructorById(instructorId);
		System.out.println("Instructor : " + instructor);
		System.out.println("Instructor details : " +instructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO)
	{
		Instructor instructor1 = new Instructor("Sooriya","Meenakshi","meenuvisu0702@gmail.com");
		InstructorDetail instructorDetail1 = new InstructorDetail("vismeelearnings","learning");
		instructor1.setInstructorDetail(instructorDetail1);

		appDAO.saveInstructor(instructor1);


		Instructor instructor2 = new Instructor("Bhargav","Parithi","Parithi3101@gmail.com");
		InstructorDetail instructorDetail2 = new InstructorDetail("parithilearnings","experimenting");
		instructor2.setInstructorDetail(instructorDetail2);

		appDAO.saveInstructor(instructor2);
	}

}
