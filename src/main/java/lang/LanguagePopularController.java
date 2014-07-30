package lang;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/app/langlist")
public class LanguagePopularController implements LanguageService{

	@Autowired private LangPopularRepository repository;
	
	@Override
	@RequestMapping (value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<LangPopular> getAll() {
		return (List<LangPopular>) repository.findAll(new Sort(Sort.Direction.ASC, "noOfUsers"));
	}

}
