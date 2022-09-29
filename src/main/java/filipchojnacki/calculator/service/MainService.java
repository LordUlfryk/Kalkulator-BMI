package filipchojnacki.calculator.service;

import org.springframework.stereotype.Service;
import filipchojnacki.calculator.CalculatorVO;

@Service
public class MainService {

    public double compute(CalculatorVO calculatorVO){
        switch(calculatorVO.getOperator()){
            case "+":
                return calculatorVO.getValue1() + calculatorVO.getValue2();
            case "*":
                return calculatorVO.getValue1() * calculatorVO.getValue2();
            case "/":
                return calculatorVO.getValue1() / calculatorVO.getValue2();
            case "-":
                return calculatorVO.getValue1() - calculatorVO.getValue2();
            case ".": // liczenie bmi (menu po wybraniu opcji "bmi" zwraca ".")
                return calculatorVO.getValue1() / (calculatorVO.getValue2()*calculatorVO.getValue2());
            default:
                return 0;
        }
    }
}
