package com.enrol

class Module {

	String moduleTitle
	String moduleCode
	int credits
	//String lecturer
	//String course
	String description	

	String toString(){
	return moduleTitle
	}


    static constraints = {
	moduleTitle nullable:false, blank:false
	moduleCode nullable:false, blank:false
	credits nullable:false, blank:false, min:20, max:120
	//lecturer nullable:false, blank:false
	description nullable:false, blank:false, maxSize:5000, widget:'textarea'
	
    }

static hasMany=[courses:Course, students:Student]
static belongsTo=[lecturer:Lecturer, courses:Course, students:Student]
}
