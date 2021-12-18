package exercise.java.exercise.java;

import exercise.java.exercise.java.service.projectSerVice;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Zahran Rafif Pc
 */
@RestController
public class fileController {
    
    @RequestMapping("/dataktp")
    public List<projectSerVice> getAllprojeSerVices(){
        return Arrays.asList(
                new projectSerVice("20200", "889090", "Zahran Rafif", "Cisait puri pratama" + " \n"),
                new projectSerVice("20201", "889091", "Gaga Muahammad", "Graha Cisait" + " \n"),
                new projectSerVice("20202", "889056", "Gaga Muahammad", "Graha Cisait" + " \n" ),
                new projectSerVice("20203", "889441", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20204", "889035", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20205", "889011", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20206", "889065", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20207", "889029", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20208", "889055", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20209", "889000", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                
                new projectSerVice("20210", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20211", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20212", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20213", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20214", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20215", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20216", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20217", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20218", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n"),
                new projectSerVice("20219", "889091", "Gaga Muahammad", "Graha Cisait"+ " \n")
                );              
    }
}
