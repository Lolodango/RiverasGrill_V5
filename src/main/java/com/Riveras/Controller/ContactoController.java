
package com.Riveras.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String contactoPage() {
        return "contacto"; 
    }
}