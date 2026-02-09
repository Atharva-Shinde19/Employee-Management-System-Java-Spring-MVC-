<c:forEach var="emp" items="${employees}">
<tr>
<td>${emp.name}</td>
<td>${emp.department}</td>
<td>${emp.salary}</td>
<td>
<a href="delete/${emp.id}">Delete</a>
</td>
</tr>
</c:forEach>
