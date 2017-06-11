package helloworld1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by DELL on 06/11/17.
 */
@Controller
public class HelloWorldControler {
    @RequestMapping("/helloworld")
    private String phuongThuc1(@RequestParam(name = "ten") String ten,
                               @RequestParam(name = "lop") String lop,
                               Model model){
        model.addAttribute("tenATB",ten);
        model.addAttribute("lopATB",lop);
        return "helloworld2/helloworld2jsp";
    }

    @RequestMapping("/helloworld/{ten}/{lop}")
    private String phuongThuc2(@PathVariable("ten") String ten,
                               @PathVariable("lop") String lop,
                               Model model){
        model.addAttribute("tenATB",ten);
        model.addAttribute("lopATB",lop);
        return "helloworld2/helloworld2jsp";
    }
}
