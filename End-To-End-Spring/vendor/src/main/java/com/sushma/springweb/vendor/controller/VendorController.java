package com.sushma.springweb.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springweb.vendor.entities.Vendor;
import com.sushma.springweb.vendor.service.VendorService;

@Controller
public class VendorController {
	@Autowired
	private VendorService service;
	
	@RequestMapping("/showCreateVendor")
	public String createVendor() {				
		return "showCreateVendor";
	}
	
	@RequestMapping(value="/saveVendor", method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		System.out.println("**** Vendor:"+vendor);
		service.createVendor(vendor);
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
	@RequestMapping("/editVendor")
	public String editVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "editVendor";
	}
	
	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor ven, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(ven.getId());
		if(vendor != null) {
			service.updateVendor(ven);
		}
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		service.deleteVendor(id);
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
	@RequestMapping("/viewAll")
	public String showAllVendors(ModelMap modelMap) {
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
}
