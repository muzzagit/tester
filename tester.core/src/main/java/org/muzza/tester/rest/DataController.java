package org.muzza.tester.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by muzzammil.ayyubi on 003 03 Nov, 15.
 */
@RestController
@RequestMapping("/data/")
public class DataController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getData(){
        return "{\n" +
                "\"records\": [\n" +
                "  {\n" +
                "    \"Name\" : \"Alfreds Futterkiste\",\n" +
                "    \"City\" : \"Berlin\",\n" +
                "    \"Country\" : \"Germany\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Berglunds snabbköp\",\n" +
                "    \"City\" : \"Luleå\",\n" +
                "    \"Country\" : \"Sweden\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Centro comercial Moctezuma\",\n" +
                "    \"City\" : \"México D.F.\",\n" +
                "    \"Country\" : \"Mexico\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Ernst Handel\",\n" +
                "    \"City\" : \"Graz\",\n" +
                "    \"Country\" : \"Austria\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"FISSA Fabrica Inter. Salchichas S.A.\",\n" +
                "    \"City\" : \"Madrid\",\n" +
                "    \"Country\" : \"Spain\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Galería del gastrónomo\",\n" +
                "    \"City\" : \"Barcelona\",\n" +
                "    \"Country\" : \"Spain\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Island Trading\",\n" +
                "    \"City\" : \"Cowes\",\n" +
                "    \"Country\" : \"UK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Königlich Essen\",\n" +
                "    \"City\" : \"Brandenburg\",\n" +
                "    \"Country\" : \"Germany\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Laughing Bacchus Wine Cellars\",\n" +
                "    \"City\" : \"Vancouver\",\n" +
                "    \"Country\" : \"Canada\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Magazzini Alimentari Riuniti\",\n" +
                "    \"City\" : \"Bergamo\",\n" +
                "    \"Country\" : \"Italy\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"North/South\",\n" +
                "    \"City\" : \"London\",\n" +
                "    \"Country\" : \"UK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Paris spécialités\",\n" +
                "    \"City\" : \"Paris\",\n" +
                "    \"Country\" : \"France\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Rattlesnake Canyon Grocery\",\n" +
                "    \"City\" : \"Albuquerque\",\n" +
                "    \"Country\" : \"USA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Simons bistro\",\n" +
                "    \"City\" : \"København\",\n" +
                "    \"Country\" : \"Denmark\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"The Big Cheese\",\n" +
                "    \"City\" : \"Portland\",\n" +
                "    \"Country\" : \"USA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Vaffeljernet\",\n" +
                "    \"City\" : \"Århus\",\n" +
                "    \"Country\" : \"Denmark\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Name\" : \"Wolski Zajazd\",\n" +
                "    \"City\" : \"Warszawa\",\n" +
                "    \"Country\" : \"Poland\"\n" +
                "  }\n" +
                "]\n" +
                "}";
    }
}
