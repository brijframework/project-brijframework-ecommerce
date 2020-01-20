package org.brijframework.college.service;

import java.text.ParseException;
import java.util.List;

import org.brijframework.college.model.Students;
import org.brijframework.college.models.dto.FeecategoryAmountDTO;
import org.brijframework.college.models.dto.StudentAdmissionDTO;
import org.brijframework.college.models.dto.StudentDTO;

public interface StudentsAdmissionService extends CRUDService<Integer , Students> {

	String[] getStudentAdmissionNo();

	public int getSerialNo();

	public List<StudentAdmissionDTO> getApplicationList();

	public StudentAdmissionDTO getStudentAdmissionDetails(int id);

	public StudentDTO findInActiveStudentDetails(Integer id);

	void registerStudentDetails(StudentDTO studentDTO) throws ParseException;

	List<StudentDTO> getStudentListById(int courseId, int branchId, int batchId);

	List<StudentDTO> getStudentsbyFirstname(String firstName);

	public List<StudentDTO> getStudentsByClassIdAndName(int classId,
			String firstName, int sessionId);

	StudentDTO findStudentDetails(Integer id);

	StudentDTO getStudentId(int id);

	void updateStudentDetails(StudentDTO studentDTO) throws ParseException;

	void setActiveById(Integer id);

	List<StudentDTO> getStudentandSubjectsListById(int courseId, int branchId,
			int batchId);

	List<StudentDTO> getStudentsbyClassandSection(int classId, int sectionId,
			int sessionId);

	List<StudentDTO> getStudentsbyFathername(String fatherName, int sessionId);

	List<StudentDTO> getStudentsbyFathername(int categoryId, int sessionId);

	List<StudentDTO> getCancelledStudentsbySession(int sessionId);

	public Boolean transferBatch(FeecategoryAmountDTO feecategoryAmountDTO);

	List<StudentDTO> getStudentsbyClassandSectionfeecheck(int classId,
			int sectionId, int sessionId);

	List<StudentDTO> getStudentsByClassId(int classId);

	List<StudentDTO> getStudentsbySessionandClass(int classId, int sessionId);

	List<StudentDTO> getStudentsbySessionClasspageno(int classId,
			int sessionId, int pageno, int totalNoOfPages);

	List<StudentDTO> getlogindetailsbyname(int classId, int sessionId,
			String firstname);

	StudentDTO getStudentProfile(Integer id);

	List<StudentDTO> getStudentsbySessionClassId(int classId, Integer sessionId);

	List<StudentDTO> getStudentsBySessionClassId(int classId, Integer sessionId);

	void updatePasswordbyId(Integer changeId, String newpassword);

	int getUniqueIdNo();

	String getRollNo(String classId, String sectionId);

	StudentDTO findStudentData(Integer id);

	List<StudentDTO> getStudentsbyCategoryId(int categoryId, int sessionId,
			int classId);

	public StudentAdmissionDTO StudentAdmission(StudentAdmissionDTO admissionDTO)
			throws ParseException;

	StudentDTO findStudentDetailsforPDF(Integer studentId);

	String transferStudent(int id) throws ParseException;

	void cancelRegistration(int id);

	List<StudentAdmissionDTO> getCancelledRegistration(int sessionId);

	List<StudentAdmissionDTO> getTransferredRegistration(int sessionId);

	String findStudentbalance(Integer studentId);

	StudentDTO findStudentPerforma(Integer studentId);

	void deleteRegistration(Integer id);

	void ReadmitStudent(Integer id);

}
