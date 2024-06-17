package com.super20.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.super20.entity.Department;
import com.super20.entity.Employee;
import com.super20.entity.Project;

public class HibernateConfiguration {
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).addAnnotatedClass(Project.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		return sf;
	}

}
