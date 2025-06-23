package sprindmvcpackeage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MController {
	@RequestMapping("/welcome")
	public String Welcome() {
		return "Welcome.jsp";
	}

}
