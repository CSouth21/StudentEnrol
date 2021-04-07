<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolment System | Advanced Search</title>
</head>
<body>

<div class="row">
<h1>Sreda Student Enrolment System</h1>
 <h3>Advanced Results</h3>

<p>Searched
 for students matching <em>${term}</em>.
 Found <strong>${students.size()}</strong> students.
 </p>

 <ul>
 <g:each var="student" in="${students}">
 <li><g:link controller="student" action="show"
id="${student.studentID}">${student.studentName}</g:link></li>
 </g:each>
 </ul>

 <g:link action='advSearch'>Search Again</g:link>
</div>
</body>
</html>
