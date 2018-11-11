package com.survey.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.survey.entity.Question;
import com.survey.entity.SurveyAns;
import com.survey.model.EmpModel;
import com.survey.model.SurveyAnswer;
import com.survey.model.SurveyResult;
import com.survey.service.SurveyServiceImpl;
@SessionAttributes("employeeDetail")
@Controller
@RequestMapping("/")
public class SurveyController {
	
	@Autowired
	SurveyServiceImpl surveyService;
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

	//	List<Employee> employees = service.findAllEmployees();
	//	model.addAttribute("employees", employees);
		return "employeeDetail";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("empForm") EmpModel empModel, ModelMap model) {
		model.addAttribute("employeeDetail",empModel);
		
		List<SurveyAnswer> questions = surveyService.getAllQuestion();
		model.addAttribute("questionList", questions);
		return "survey";
	}
	
	@RequestMapping(value = "/saveSurvey", method = RequestMethod.POST)
	public String saveSurvey(@ModelAttribute("surveyAnsList") SurveyResult surveyResult,  ModelMap model, HttpSession session) {
		
		try {
			EmpModel empModel = (EmpModel) session.getAttribute("employeeDetail");
			List<SurveyAnswer> answers = new ArrayList<>();
			answers = surveyResult.getAnswers();
			EmpModel empDetail = (EmpModel) session.getAttribute("employeeDetail");
			System.out.println("emp detail "+empDetail.getKin());
			for (SurveyAnswer surveyAnswer2 : answers) {
				System.out.println("que "+surveyAnswer2.getQuestion()+" "+surveyAnswer2.getId()+" "+surveyAnswer2.getVote());
				SurveyAns surveyAns = new SurveyAns();
				surveyAns.setKin(empDetail.getKin());
				surveyAns.setName(empDetail.getName());
				surveyAns.setQuestion(surveyAnswer2.getQuestion());
				surveyAns.setAnswer(surveyAnswer2.getVote());
				surveyService.save(surveyAns);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	session.invalidate();
		return "success";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success() {
		return "employeeDetail";
	}

}
