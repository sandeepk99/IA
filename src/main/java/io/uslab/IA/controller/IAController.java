package io.uslab.IA.controller;

import com.netflix.discovery.DiscoveryClient;
import io.uslab.IA.io.uslab.IA.model.IAOfferDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IAController {

    @GetMapping("/ia/{pageId}/{placementId}")
    public IAOfferDetails retriveIAOfferDetails(
            @PathVariable String pageId,@PathVariable String placementId){
         return new IAOfferDetails(pageId,"result from IA",
                 placementId,"C_ent_overdraftrewind_hpprimary_web",
                 "https://www20.test.com/assets/images/contextual/banner/student-loans/1200x532/wfic412_ph_g-187715263_1200x532.jpg");
    }
}
