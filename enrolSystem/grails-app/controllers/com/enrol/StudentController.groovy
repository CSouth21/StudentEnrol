package com.enrol

class StudentController {

    def scaffold=com.enrol.Student

	def Search(){
		render view:'search'
	}

	def results(String name){
		def students=Student.where{
			studentName=~name
		}.list()
	
		return [students:students,
			term:params.name,
			totalStudents:Student.count()]
	}

	def advSearch(){
		render view:'advSearch'
	}

	def advResults(){
		 def studentProps = Student.metaClass.properties*.name
		 def students = Student.withCriteria {
 		 "${params.queryType}" {
		 params.each { field, value ->
 		 if (studentProps.grep(field) && value) {
 		 	ilike(field, value)
 		 }
 	 }
 	}
 }
 return [ students : students ]
 }

}
