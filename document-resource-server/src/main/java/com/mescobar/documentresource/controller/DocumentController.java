package com.mescobar.documentresource.controller;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

	@GetMapping("/document")
    @RolesAllowed({"document_read"})
    public String getDocument(Principal principal) {
        return "Response from Document Service, User Id:" + principal.getName();
    }
}
