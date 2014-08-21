package beginning.tdd.exercise.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import beginning.tdd.exercise.mvc.model.Person;
import beginning.tdd.exercise.mvc.repository.AddressRepository;

@Controller
public class AddressController {
	private static final String REDIRECT_LIST_PAGE = "redirect:list";

	private AddressRepository addressRepository;

	@Autowired
	public AddressController(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@RequestMapping(value = "/list", method = { RequestMethod.GET })
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("addresses", addressRepository.findBy());

		return mav;
	}

	@RequestMapping(value = "/add", method = { RequestMethod.POST })
	public String add(@ModelAttribute Person person) {
		addressRepository.add(person);

		return REDIRECT_LIST_PAGE;
	}

	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	public String remove(@RequestParam Long id) {
		System.out.println(">>> id >>> " + id);
		addressRepository.remove(id);

		return REDIRECT_LIST_PAGE;
	}
}
