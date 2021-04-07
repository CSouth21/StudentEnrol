<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolment System | Simple Search</title>
</head>
<body>

<div class="row">
	<h1>Sreda Student Enrolment System</h1>
<h3>Search Results</h3>

<p>
 Searched ${totalStudents} records
 for items matching <em>${term}</em>.
 Found <strong>${students.size()}</strong> students.
 </p>

 <ul>
 <g:each var="student" in="${students}">
 <li><g:link controller="student" action="show"
id="${student.id}">${student.studentName}</g:link></li>
 </g:each>
 </ul>

<button type="button" class="btn btn-success">
 <g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>

