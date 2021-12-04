package com.home.MyPractice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.home.MyPractice.dao.ServiceDao;
import com.home.MyPractice.dao.ServiceDaoImpl;
import com.home.MyPractice.entity.Scholarship;
import com.home.MyPractice.entity.ScholarshipVO;
import com.home.MyPractice.entity.StudentVO;
import com.home.MyPractice.entity.Students;

public class ServiceImpl implements Service {

	@Override
	public void saveStudents(StudentVO st, ScholarshipVO sc) {
		System.out.println("inside serviceimpl");
		SimpleDateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
		Students student=new Students();
		student.setName(st.getName().trim());
		student.setCgpa(Double.parseDouble(st.getCgpa().trim()));
		try {
			student.setDoa(fm.parse(st.getDoa().trim()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Scholarship scholar=new Scholarship();
		scholar.setProviderName(sc.getProviderName().trim());
		try {
			scholar.setValidFrom(fm.parse(sc.getValidFrom().trim()));
			System.out.println(sc.getValidTill());
			scholar.setValidTill(fm.parse(sc.getValidTill().trim()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setScholarship(scholar);
		System.out.println("All set before dao"+student);

		ServiceDao serviceDao = new ServiceDaoImpl();
		serviceDao.saveStudents(student);

	}

}
