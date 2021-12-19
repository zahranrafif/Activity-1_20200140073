package exercise.java.exercise.java;

import exercise.java.exercise.java.service.projectSerVice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Zahran Rafif Pc
 */
@Controller
public class fileController { 
    @RequestMapping("/dataktp")
    public String getTable (Model tampil) {           
                ArrayList<List<String>> data = new ArrayList ();
                data.add(Arrays.asList("20200", "889090", "Zahran Rafif", "Cisait puri pratama"));
                data.add(Arrays.asList("20201", "889091", "Gaga Muhammad", "Graha Cisait"));
                data.add(Arrays.asList("20202", "889056", "Zidhan Khalid", "Graha Cisait"));   
                data.add(Arrays.asList("20203", "889441", "Alif Riziki", "Ciruas"));
                data.add(Arrays.asList("20204", "889035", "Rafli Romadhoni", "Ringroad Utara"));
                data.add(Arrays.asList("20205", "889011", "Fitra Jajang", "Magelang Baru"));
                data.add(Arrays.asList("20206", "889065", "Ni'mat Ismatullah", "Merapi"));
                data.add(Arrays.asList("20207", "889029", "Popong", "Sleman"));
                data.add(Arrays.asList("20208", "889055", "Dita Azazkia", "Pasar Giwangan"));
                data.add(Arrays.asList("20209", "889000", "Dirra Mong mong", "Ciruas Pasar"));
                
                data.add(Arrays.asList("20210", "889043", "Utusan Allah", "Sentul Lio"));
                data.add(Arrays.asList("20211", "889077", "Riziki Fadlirohman", "Kulon Progo"));
                data.add(Arrays.asList("20212", "889009", "Maulana Hasanudin", "Jl Adi Sucipto"));
                data.add(Arrays.asList("20213", "889004", "Maulana Adi Rahmadi", "Villa Jogjakarta"));
                data.add(Arrays.asList("20214", "889030", "Senja sky", "Mirota Kampus"));
                data.add(Arrays.asList("20215", "889035", "Gala Muhammad", "Gamping Baru"));
                data.add(Arrays.asList("20216", "889037", "Erlangga F", "Graha Cisait"));
                data.add(Arrays.asList("20217", "889096", "Juslih Safei", "jl.Stasiun Tugu"));
                data.add(Arrays.asList("20218", "889097", "Imat Budi", "Taman Tirto"));
                data.add(Arrays.asList("20219", "889099", "Rizal", "Kost Gantenk"));
                
                tampil.addAttribute("tabel",data);
                return "View";        
    }
}
