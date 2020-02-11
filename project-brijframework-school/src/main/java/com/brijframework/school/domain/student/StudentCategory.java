package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.CategoryDetail;

@Entity
@Table(name = "STUDENT_CATEGORY")
public class StudentCategory extends EntityObject<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "CATEGORY_DETAIL_ID")
	private CategoryDetail categoryDetail;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentCategory")
	private List<StudentInformation> students;
	
	public CategoryDetail getCategoryDetail() {
		return categoryDetail;
	}

	public void setCategoryDetail(CategoryDetail categoryDetail) {
		this.categoryDetail = categoryDetail;
	}

	public List<StudentInformation> getStudents() {
		return students;
	}

	public void setStudents(List<StudentInformation> students) {
		this.students = students;
	}

}
