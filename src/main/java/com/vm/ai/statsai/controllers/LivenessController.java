/**
 * 
 */
package com.vm.ai.statsai.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to hold the api for liveness of the service
 * 
 * @author vignesh
 *
 */
@RestController
public class LivenessController {

	@RequestMapping("/liveness")
	public String liveness() {
		return "LIVE";
	}

}
