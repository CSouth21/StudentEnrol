package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing = new Course(
		department: 'Computing',
		courseCode: 'CS123',
		courseTitle: 'BSc Hon Computing',
		courseLeader: 'Dr Michelle Murphy',
		startDate: new Date('09/09/2019'),
		endDate: new Date('07/07/2023'),
		numberOfStudents: 55,
		studyMode: 'Fulltime',
		tuitionFees: 9000.60,
		description: '''Bombay Chadderboomtown''').save()

	def business = new Course(
		department: 'Business Studies',
		courseCode: 'BS123',
		courseTitle: 'BSc Hon Business Studies',
		courseLeader: 'Dr Steve Anus',
		startDate: new Date('09/09/2019'),
		endDate: new Date('07/07/2023'),
		numberOfStudents: 60,
		studyMode: 'Fulltime',
		tuitionFees: 9000.60,
		description: '''Bootylicious Chadderino''').save()

	def psychology = new Course(
		department: 'Psychology',
		courseCode: 'PS123',
		courseTitle: 'BSc Hon Psychology',
		courseLeader: 'Dr Marcelo Bielsa',
		startDate: new Date('09/09/2019'),
		endDate: new Date('07/07/2023'),
		numberOfStudents: 30,
		studyMode: 'Fulltime',
		tuitionFees: 9000.60,
		description: '''Marching on Together #LUFC''').save()

	def bamford = new Student(
		studentName: 'Patrick Bamford',
		studentID: 'PB9',
		dob: new Date('23/03/1994'),
		isFundingAvailable: true,
		studentEmail: 'pbamford@gmail.com',
		studentUsername: 'LordBamford420',
		studentPassword: 'bielsaisgod',
		course: 'Psychology').save()

	def harrison = new Student(
		studentName: 'Jack Harrison',
		studentID: 'JH22',
		dob: new Date('28/07/1998'),
		isFundingAvailable: true,
		studentEmail: 'jharrison@gmail.com',
		studentUsername: 'JackLame',
		studentPassword: 'bielsaislife',
		course: 'Computing').save()

	def sysArchs = new Module(
		moduleTitle: 'System Architectures',
		moduleCode: 'SA120',
		credits: 20,
		lecturer: 'Faiza Samreen',
		course: 'Computing',
		description: '''u wot m8''').save()

	def wadi = new Module(
		moduleTitle: 'Web Application Design and Implementation',
		moduleCode: 'WADI120',
		credits: 20,
		lecturer: 'Jacky Stallard',
		course: 'Computing',
		description: '''big chungus''').save()

	def faiza = new Lecturer(
		fullName: 'Faiza Samreen',
		post: 'Geoff',
		subject: 'Computing',
		lecturerEmail: 'faizasamreen@shu.co.uk',
		office: 'Cantor',
		bio: '''insert bio here''').save()

	def jacky = new Lecturer(
		fullName: 'Jacky Stallard',
		post: 'Geoff',
		subject: 'Computing',
		lecturerEmail: 'jackystallard@shu.co.uk',
		office: 'Cantor',
		bio: '''insert bio here v2''').save()


    }
    def destroy = {
    }
}
