package com.enrol

class Lecturer {

	String fullName
	String username
	String password
	String post
	String subject
	String lecturerEmail
	String office
	String bio

	String toString(){
	return fullName
	}

    static constraints = {
	fullName nullable:false, blank:false
	post nullable:false, blank:false
	subject nullable:false, blank:false
	lecturerEmail nullable:false, blank:false, email:true
	office nullable:false, blank:false
	bio nullable:false, blank:false, maxSize:5000, widget:'textarea'
    }

static hasMany = [modules:Module, courses:Course]

static belongsTo = [courses:Course]

//static hasMany = [courses:Course]

}
