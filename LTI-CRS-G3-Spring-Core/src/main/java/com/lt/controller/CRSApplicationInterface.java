package com.lt.controller;

import org.springframework.context.annotation.Import;

@Import({CRSApplication.class})
public interface CRSApplicationInterface {
	public void crsLaunchMenu();

}
