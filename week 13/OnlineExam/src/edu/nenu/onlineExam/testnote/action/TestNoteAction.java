package edu.nenu.onlineExam.testnote.action;

import edu.nenu.onlineExam.testnote.entity.TestNote;
import edu.nenu.onlineExam.testnote.service.TestNoteService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestNoteAction extends ActionSupport implements ModelDriven<TestNote>{
	private TestNote testNote = new TestNote();
	public TestNote getModel() {
		return testNote;
	}
	private TestNoteService tnService;
	public void setTnService(TestNoteService tnService) {
		this.tnService = tnService;
	}
	//���Խ���
	public String closeTestNote(){
		System.out.println("���Լ�¼id"+testNote.getTnid());
		tnService.upEndTime(testNote.getTnid());
		return "closeTestNote";
	}
}
