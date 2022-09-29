package filipchojnacki.calculator.controller;

import filipchojnacki.calculator.CalculatorVO;
import filipchojnacki.calculator.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {

        private final MainService mainService = new MainService();

        @GetMapping("/")
        public String getHome(Model model){
            model.addAttribute("value1",0);
            model.addAttribute("value2",0);
            model.addAttribute("result",0);
            return "index";
        }
        @PostMapping("/")
        public String postHome(@ModelAttribute CalculatorVO calculatorVO, Model model){
            System.out.println(calculatorVO);
            model.addAttribute("value1", calculatorVO.getValue1());
            model.addAttribute("value2", calculatorVO.getValue2());
            model.addAttribute("result",mainService.compute(calculatorVO));
            return "index";
        }

}
