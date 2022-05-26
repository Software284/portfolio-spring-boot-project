package com.lamichhane.portfolio.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.entity.BlogContent;
import com.lamichhane.portfolio.entity.ContactDetail;
import com.lamichhane.portfolio.entity.ContactMedium;
import com.lamichhane.portfolio.entity.CreativeProcess;
import com.lamichhane.portfolio.entity.KnowldgeResume;
import com.lamichhane.portfolio.entity.Project;
import com.lamichhane.portfolio.entity.SkillProgressBar;
import com.lamichhane.portfolio.entity.Specialize;
import com.lamichhane.portfolio.entity.Stats;
import com.lamichhane.portfolio.entity.Testimonials;
import com.lamichhane.portfolio.modal.ProjectInformation;
import com.lamichhane.portfolio.service.AwardsService;
import com.lamichhane.portfolio.service.BlogContentService;
import com.lamichhane.portfolio.service.ContactDetailService;
import com.lamichhane.portfolio.service.ContactMediumService;
import com.lamichhane.portfolio.service.CreativeProcessService;
import com.lamichhane.portfolio.service.KnowldgeResumeService;
import com.lamichhane.portfolio.service.ProjectsService;
import com.lamichhane.portfolio.service.SkillProgressBarService;
import com.lamichhane.portfolio.service.SpecializeService;
import com.lamichhane.portfolio.service.StatsService;
import com.lamichhane.portfolio.service.TestimonialsService;

@RestController
@RequestMapping("/portfolio")
public class CustomerPanelController {
	
	@Autowired
	private SpecializeService specializeService;
	
	@Autowired
	private StatsService statsService;
	
	@Autowired
	private CreativeProcessService creativeProcessService;
	
	@Autowired
	private KnowldgeResumeService knowldgeResumeService;
	
	@Autowired
	private ContactDetailService contactDetailService;
	
	@Autowired
	private ContactMediumService contactMediumService;
	
	@Autowired
	private SkillProgressBarService skillProgressBarService;
	
	@Autowired
	private AwardsService awardsService;
	
	@Autowired
	private BlogContentService blogContentService;
	
	@Autowired
	private ProjectsService projectsService;
	
	@Autowired
	private TestimonialsService testimonialsService;
	
	
	/* Specialize API request processing */
	
	@GetMapping("/specialize")
	public List<Specialize> getAllSpecialize() {
		return specializeService.getAllSpecialize();
	}
	
	@GetMapping("/specialize/{specializeId}")
	public Specialize getSpecialize(@PathVariable int specializeId) {
		Specialize specialize = specializeService.getSpecialize(specializeId);
		return specialize;
	}
	
	
	@PostMapping("/specialize")
	public Specialize saveSpecialize(@RequestBody Specialize spe) {
		specializeService.saveSpecialize(spe);
		return spe;
	}
	
	@PutMapping("/specialize")
	public Specialize updateSpecialize(@RequestBody Specialize spe) {
		specializeService.saveSpecialize(spe);
		return spe;
	}
	
	@DeleteMapping("/specialize/{specializeId}")
	public String deleteSpecialize(@PathVariable int specializeId) {
		Specialize spe = specializeService.getSpecialize(specializeId);
		specializeService.deletSpecialize(specializeId);
		
		return "Deleted Specialize id is : "+specializeId;
	}
	
	/* Stats API request processing */
	
	@GetMapping("/stats")
	public List<Stats> getAllStats() {
		return statsService.getAllStats();
	}
	
	@GetMapping("/stats/{statsId}")
	public Stats getStats(@PathVariable int statsId) {
		Stats stats = statsService.getStats(statsId);
		return stats;
	}
	
	
	@PostMapping("/stats")
	public Stats saveStats(@RequestBody Stats sts) {
		statsService.saveStats(sts);
		return sts;
	}
	
	@PutMapping("/stats")
	public Stats updateStats(@RequestBody Stats sts) {
		statsService.saveStats(sts);
		return sts;
	}
	
	@DeleteMapping("/stats/{statsId}")
	public String deleteStats(@PathVariable int statsId) {
		Stats spe = statsService.getStats(statsId);
		statsService.deleteStats(statsId);
		
		return "Deleted Stats id is : "+statsId;
	}
	
	/* Creative Process API request processing */
	
	@GetMapping("/creative_process")
	public List<CreativeProcess> getAllCreativeProcess() {
		return creativeProcessService.getAllCreativeProcess();
	}
	
	@GetMapping("/creative_process/{creativeprocessId}")
	public CreativeProcess getCreativeProcess(@PathVariable int creativeprocessId) {
		CreativeProcess creative_process = creativeProcessService.getCreativeProcess(creativeprocessId);
		return creative_process;
	}
	
	
	@PostMapping("/creative_process")
	public CreativeProcess saveCreativeProcess(@RequestBody CreativeProcess creativeprocess) {
		creativeProcessService.saveCreativeProcess(creativeprocess);
		return creativeprocess;
	}
	
	@PutMapping("/creative_process")
	public CreativeProcess updateCreativeProcess(@RequestBody CreativeProcess creativeprocess) {
		creativeProcessService.saveCreativeProcess(creativeprocess);
		return creativeprocess;
	}
	
	@DeleteMapping("/creative_process/{creativeprocessId}")
	public String deleteCreativeProcess(@PathVariable int creativeprocessId) {
		CreativeProcess creativeprocess = creativeProcessService.getCreativeProcess(creativeprocessId);
		creativeProcessService.deleteCreativeProcess(creativeprocessId);
		
		return "Deleted Creative Process id is : "+creativeprocessId;
	}
	
	/* Knowldge Resume API request processing */
	
	@GetMapping("/knowldge_resume")
	public List<KnowldgeResume> getAllKnowldgeResume() {
		return knowldgeResumeService.getAllKnowldgeResume();
	}
	
	@GetMapping("/knowldge_resume/{knowldgeresumeId}")
	public KnowldgeResume getKnowldgeResume(@PathVariable int knowldgeresumeId) {
		KnowldgeResume knowldge_resume = knowldgeResumeService.getKnowldgeResume(knowldgeresumeId);
		return knowldge_resume;
	}
	
	
	@PostMapping("/knowldge_resume")
	public KnowldgeResume saveKnowldgeResume(@RequestBody KnowldgeResume knowldgeresume) {
		knowldgeResumeService.saveKnowldgeResume(knowldgeresume);
		return knowldgeresume;
	}
	
	@PutMapping("/knowldge_resume")
	public KnowldgeResume updateKnowldgeResume(@RequestBody KnowldgeResume knowldgeresume) {
		knowldgeResumeService.saveKnowldgeResume(knowldgeresume);
		return knowldgeresume;
	}
	
	@DeleteMapping("/knowldge_resume/{knowldgeresumeId}")
	public String deleteKnowldgeResume(@PathVariable int knowldgeresumeId) {
		KnowldgeResume knowldgeresume = knowldgeResumeService.getKnowldgeResume(knowldgeresumeId);
		knowldgeResumeService.deleteKnowldgeResume(knowldgeresumeId);
		
		return "Deleted Knowldge Resume id is : "+knowldgeresumeId;
	}
	
	/* ContactDetail API request processing */
	
	@GetMapping("/contact_detail")
	public List<ContactDetail> getAllContactDetail() {
		return contactDetailService.getAllContactDetail();
	}
	
	@GetMapping("/contact_detail/{contactdetailId}")
	public ContactDetail getContactDetail(@PathVariable int contactdetailId) {
		ContactDetail contact_detail = contactDetailService.getContactDetail(contactdetailId);
		return contact_detail;
	}
	
	
	@PostMapping("/contact_detail")
	public ContactDetail saveContactDetail(@RequestBody ContactDetail contactdetail) {
		contactDetailService.saveContactDetail(contactdetail);
		return contactdetail;
	}
	
	@PutMapping("/contact_detail")
	public ContactDetail updateContactDetail(@RequestBody ContactDetail contactdetail) {
		contactDetailService.saveContactDetail(contactdetail);
		return contactdetail;
	}
	
	@DeleteMapping("/contact_detail/{contactdetailId}")
	public String deleteContactDetail(@PathVariable int contactdetailId) {
		ContactDetail contact_detail = contactDetailService.getContactDetail(contactdetailId);
		contactDetailService.deleteContactDetail(contactdetailId);
		
		return "Deleted Knowldge Resume id is : "+contactdetailId;
	}
	
	/* ContactMedium API request processing */
	
	@GetMapping("/contact_medium")
	public List<ContactMedium> getAllContactMedium() {
		return contactMediumService.getAllContactMedium();
	}
	
	@GetMapping("/contact_medium/{contactmediumId}")
	public ContactMedium getContactMedium(@PathVariable int contactmediumId) {
		ContactMedium contact_medium = contactMediumService.getContactMedium(contactmediumId);
		return contact_medium;
	}
	
	
	@PostMapping("/contact_medium")
	public ContactMedium saveContactMedium(@RequestBody ContactMedium contactmedium) {
		contactMediumService.saveContactMedium(contactmedium);
		return contactmedium;
	}
	
	@PutMapping("/contact_medium")
	public ContactMedium updateContactMedium(@RequestBody ContactMedium contactmedium) {
		contactMediumService.saveContactMedium(contactmedium);
		return contactmedium;
	}
	
	@DeleteMapping("/contact_medium/{contactmediumId}")
	public String deleteContactMedium(@PathVariable int contactmediumId) {
		ContactMedium contact_medium = contactMediumService.getContactMedium(contactmediumId);
		contactMediumService.deleteContactMedium(contactmediumId);
		
		return "Deleted contact detail id is : "+contactmediumId;
	}
	
	/* SkillProgressBar API request processing */
	
	@GetMapping("/skill_progressbar")
	public List<SkillProgressBar> getAllSkillProgressBar() {
		return skillProgressBarService.getAllSkillProgressBar();
	}
	
	@GetMapping("/skill_progressbar/{skillprogressbarId}")
	public SkillProgressBar getSkillProgressbar(@PathVariable int skillprogressbarId) {
		SkillProgressBar skill_progressbar = skillProgressBarService.getSkillProgressBar(skillprogressbarId);
		return skill_progressbar;
	}
	
	
	@PostMapping("/skill_progressbar")
	public SkillProgressBar saveSkillProgressBar(@RequestBody SkillProgressBar skillprogressbar) {
		skillProgressBarService.saveSkillProgressBar(skillprogressbar);
		return skillprogressbar;
	}
	
	@PutMapping("/skill_progressbar")
	public SkillProgressBar updateSkillProgressBar(@RequestBody SkillProgressBar skillprogressbar) {
		skillProgressBarService.saveSkillProgressBar(skillprogressbar);
		return skillprogressbar;
	}
	
	@DeleteMapping("/skill_progressbar/{skillprogressbarId}")
	public String deleteSkillProgressBar(@PathVariable int skillprogressbarId) {
		SkillProgressBar skill_progressbar = skillProgressBarService.getSkillProgressBar(skillprogressbarId);
		skillProgressBarService.deleteSkillProgressBar(skillprogressbarId);
		
		return "Deleted skill progressbar id is : "+skillprogressbarId;
	}
	
	/* Awards API request processing */
	
	@GetMapping("/awards")
	public List<Awards> getAllAwards() {
		return awardsService.getAllAwards();
	}
	
	@GetMapping("/awards/{awardsId}")
	public Awards getAwards(@PathVariable int awardsId) {
		Awards awards = awardsService.getAwards(awardsId);
		return awards;
	}
	
	
	@PostMapping("/awards")
	public Awards saveAwards(@RequestBody Awards awards) {
		awardsService.saveAwards(awards);
		return awards;
	}
	
	@PutMapping("/awards")
	public Awards updateAwards(@RequestBody Awards awards) {
		awardsService.saveAwards(awards);
		return awards;
	}
	
	@DeleteMapping("/awards/{awardsId}")
	public String deleteAwards(@PathVariable int awardsId) {
		Awards awards = awardsService.getAwards(awardsId);
		awardsService.deleteAwards(awardsId);
		
		return "Deleted awards  id is : "+awardsId;
	}
	
	/* BlogContent API request processing */
	
	@GetMapping("/blog_content")
	public List<BlogContent> getAllBlogContent() {
		return blogContentService.getAllBlogContent();
	}
	
	@GetMapping("/blog_content/{blogcontentId}")
	public BlogContent getBlogContent(@PathVariable int blogcontentId) {
		BlogContent blog_content = blogContentService.getBlogContent(blogcontentId);
		return blog_content;
	}
	
	
	@PostMapping("/blog_content")
	public BlogContent saveBlogContent(@RequestBody BlogContent blogcontent) throws IOException {
		BlogContent content = blogContentService.saveBlogContent(blogcontent);

		return blogcontent;
	}
	
	@PutMapping("/blog_content")
	public BlogContent updateBlogContent(@RequestBody BlogContent blogcontent) {
		blogContentService.saveBlogContent(blogcontent);
		return blogcontent;
	}
	
	@DeleteMapping("/blog_content/{blogcontentId}")
	public String deleteBlogContent(@PathVariable int blogcontentId) {
		BlogContent blog_content = blogContentService.getBlogContent(blogcontentId);
		blogContentService.deleteBlogContent(blogcontentId);
		
		return "Deleted blog content id is : "+blogcontentId;
	}
	
	
	/* Testimonials API  request processing */
	
	@GetMapping("/testimonial")
	public List<Testimonials> getAllTestimonial() {
		return testimonialsService.getAllTestimonials();
	}
	
	@GetMapping("/testimonial/{testimonialId}")
	public Testimonials getTestimonials(@PathVariable int testimonialId) {
		Testimonials testimonial = testimonialsService.getTestimonials(testimonialId);
		return testimonial;
	}
	
	
	@PostMapping("/testimonial")
	public Testimonials saveTestimonials(@RequestBody Testimonials testimonials) throws IOException {
		testimonialsService.saveTestimonials(testimonials);
		return testimonials;
	}
	
	@PutMapping("/testimonial")
	public Testimonials updateTestimonials(@RequestBody Testimonials testimonials) {
		testimonialsService.saveTestimonials(testimonials);
		return testimonials;
	}
	
	@DeleteMapping("/testimonial/{testimonialId}")
	public String deleteTestimonials(@PathVariable int testimonialId) {
		Testimonials testimonials = testimonialsService.getTestimonials(testimonialId);
		testimonialsService.deleteTestimonials(testimonialId);
		
		return "Deleted Testimonials id is : "+testimonialId;
	}
	
	/* Projects description API  request processing */
	
	@GetMapping("/projects")
	public List<Project> getAllProjects() {
		return projectsService.getAllProjects();
	}
	
	@GetMapping("/projects/{projectsId}")
	public Project getProjects(@PathVariable int projectsId) {
		Project projects = projectsService.getProjects(projectsId);
		return projects;
	}
	
	
	@PostMapping("/projects")
	public ProjectInformation saveProjects(@RequestBody ProjectInformation projects) throws IOException {
		projectsService.saveProjects(projects);
		return projects;
	}
	
	@PutMapping("/projects")
	public ProjectInformation updateProjects(@RequestBody ProjectInformation projects) {
		projectsService.saveProjects(projects);
		return projects;
	}
	
	@DeleteMapping("/projects/{projectsId}")
	public String deleteProjects(@PathVariable int projectsId) {
		Project projects = projectsService.getProjects(projectsId);
		projectsService.deleteProjects(projectsId);
		
		return "Deleted Projects id is : "+projectsId;
	}
	
	
	
	
}
