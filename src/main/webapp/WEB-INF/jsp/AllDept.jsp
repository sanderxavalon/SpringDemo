<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Departments</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Departments No.</th>
                    <th>Departments name</th>
                    <th>Location</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${depts}" var="depts">
                    <tr>
                        <td>${depts.deptno}</td>
                        <td>${depts.dname}</td>
                        <td>${depts.loc}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>