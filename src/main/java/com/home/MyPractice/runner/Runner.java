package com.home.MyPractice.runner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.home.MyPractice.entity.ScholarshipVO;
import com.home.MyPractice.entity.StudentVO;
import com.home.MyPractice.service.Service;
import com.home.MyPractice.service.ServiceImpl;

public class Runner extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	resp.setContentType("text/html"); 
		
		String studentName = req.getParameter("studentname");
		String studentCgpa = req.getParameter("studentcgpa");
		String studentDoa = req.getParameter("studentdoa");
		String providerName = req.getParameter("providername");
		String validFrom = req.getParameter("validfrom");
		String validTill = req.getParameter("validtill");
		  System.out.println("inside runner");
			
			StudentVO studentVO = new StudentVO();
			studentVO.setName(studentName);
			studentVO.setCgpa(studentCgpa);
			studentVO.setDoa(studentDoa);
			System.out.println("StudentVO is set");
				
			ScholarshipVO scholarVO = new ScholarshipVO();
			scholarVO.setProviderName(providerName);
			scholarVO.setValidFrom(validFrom);
			scholarVO.setValidTill(validTill);
			System.out.println("ScholarshipVO is set");
			
					
			Service service = new ServiceImpl();
			service.saveStudents(studentVO, scholarVO);
					 
				 
		 
		resp.getWriter().println("1 record saved");
		
		
	}
}
