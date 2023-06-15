package mk.ukim.finki.hospital.web;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.*;
import mk.ukim.finki.hospital.service.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@AllArgsConstructor
public class BolnicaController {

    private final DijagnozaService dijagnozaService;
    private final DoktorService doktorService;
    private final IzvestajService izvestajService;
    private final LekoviService lekoviService;
    private final OddelService oddelService;
    private final PacientService pacientService;
    private final PregledService pregledService;
    private final ReceptaService receptaService;
    private final SpecijalnostService specijalnostService;
    private final UpatService upatService;
    private final NerealiziraniUpatiPoPacientService nerealiziraniUpatiPoPacientService;
    private final DijagnoziPacientService dijagnoziPacientService;
    private final PregelediIzvestaiDijagnoziViewService pregelediIzvestaiDijagnoziViewService;
//    private final BrojPreglediPoMesecIVkupnoService brojPreglediPoMesecIVkupnoService;
    private final UpatDoktorDenesenViewService upatDoktorDenesenViewService;
    private final LekoviPoTromesecijaViewService lekoviPoTromesecijaViewService;

    @GetMapping("/")
    public String getHomepage() {
        return "homepage1";
    }

    // pacient, pregled, recepta, lekovi, upat
    @GetMapping("/dijagnozi")
    public String getDijagnozi(Model model){
        List<Dijagnoza> dijagnozi = this.dijagnozaService.findAllDijagnozi();
        model.addAttribute("dijagnozi", dijagnozi);
        return "dijagnozi";
    }

    @GetMapping("/doktori")
    public String getDoktori(Model model){
        List<Doktor> doktori = this.doktorService.findAllDoktori();
        model.addAttribute("lekari", doktori);
        return "doktori";
    }
    @GetMapping("/izvestai")
    public String getIzvestai(Model model){
        List<Izvestaj> izvestai = this.izvestajService.findAllIzvestai();
        model.addAttribute("izvestai", izvestai);
        return "izvestai";
    }

    @GetMapping("/pacienti")
    public String getPacienti(Model model){
        List<Pacient> pacienti = this.pacientService.findAllPacienti();
        model.addAttribute("pacienti", pacienti);
        return "pacienti";
    }

    @GetMapping("/pregledi")
    public String getPregledi(Model model){
        List<Pregled> pregledi = this.pregledService.findAllPregledi();
        model.addAttribute("pregledi", pregledi);
        return "pregledi";
    }

    @GetMapping("/recepti")
    public String getRecepti(Model model){
        List<Recepta> recepti = this.receptaService.findAllRecepti();
        model.addAttribute("recepti", recepti);
        return "recepti";
    }

    @GetMapping("/lekovi")
    public String getLekovi(Model model){
        List<Lekovi> lekovi = this.lekoviService.findAllLekovi();
        model.addAttribute("lekovi", lekovi);
        return "lekovi";
    }

    @GetMapping("/upati")
    public String getUpati(Model model){
        List<Upat> upati = this.upatService.findAllUpati();
        model.addAttribute("upati", upati);
        return "upati";
    }
    @GetMapping("doktori/{lekarId}/upati")
    public String getUpatiForLekar(@PathVariable(name = "lekarId") Long lekarId, Model model) {
        List<Upat> upati = doktorService.getUpatiForLekar(lekarId);
        model.addAttribute("upati", upati);
        return "lekarUpati";
    }
    @GetMapping("doktori/{lekarId}/pregledi")
    public String getPreglediForLekar(@PathVariable(name = "lekarId") Long lekarId, Model model) {
        model.addAttribute("pregledi", doktorService.getPreglediForLekar(lekarId));
        return "lekarPregledi";
    }

    @PostMapping("/form")
    public String addUpat(@RequestParam(name = "datumIzdavanje")
                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate datumIzdavanje,
                          @RequestParam String embg,
                          @RequestParam Long doktor_upatuva,
                          @RequestParam Long doktor_upaten_kon) {
        upatService.saveUpat(datumIzdavanje, embg, doktor_upatuva, doktor_upaten_kon);
        return "redirect:/lekarUpati";
    }


                          @GetMapping(path = "pacienti/{embg}/pregledi")
    public String getPreglediForPacient(@PathVariable(name = "embg") String embg, Model model) {
        model.addAttribute("pregledi", pacientService.getPreglediForPacient(embg));
        return "pacientPregledi";
    }
    // TODO: implement this
    @GetMapping(path = "/nerealiziraniReceptiPoPacient")
    public String getNerealiziraniUpati(Model model) {
        model.addAttribute("nerealiziraniUpati",
                this.nerealiziraniUpatiPoPacientService.findAllNerealiziraniUpati());
        return "nerealiziraniRecepti";
    }
    @GetMapping("/dijagnoziNaPacienti")
    public String getDijagnoziNaPacienti(Model model) {
        model.addAttribute("dijagnoziPacient",
                this.dijagnoziPacientService.findAllDijagnoziPacient());
        return "dijagnoziPacient";
    }

    @GetMapping("/preglediIzvestaiDijagnozi")
    public String getPreglediIzvestaiDijagnozi(Model model) {
        model.addAttribute("preglediIzvestaiDijagnozi",
                this.pregelediIzvestaiDijagnoziViewService.findAllPreglediIzvestaiDijagnozi());
        return "preglediIzvestaiDijagnozi";
    }

//    @GetMapping("/vkupnoPreglediMesecnoIGodisnoPoDoktor")
//    public String getVkupnoPreglediMesecnoIGodisno(Model model) {
//        model.addAttribute("vkupnoPreglediMesecnoIGodisno",
//                this.brojPreglediPoMesecIVkupnoService.findAllBrojPreglediPoMesecIVkupno());
//        return "vkupnoPreglediMesecnoIGodisno";
//    }

    @GetMapping("/upatDoktorDenesen")
    public String getUpatDoktorDenesen(Model model) {
        model.addAttribute("upatDoktorDenesen",
                this.upatDoktorDenesenViewService.findAllUpatDoktorDenesen());
        return "upatDoktorDenesen";
    }

    @GetMapping("/lekoviPoTrimesecje")
    public String getLekoviPoTromesecija(Model model) {
        model.addAttribute("lekoviPoTrimesecje",
                this.lekoviPoTromesecijaViewService.findAllLekoviPoTromesecija());
        return "lekoviPoTrimesecje";
    }
}
