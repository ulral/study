<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>사원번호</th>
        <th>생년월일</th>
        <th>성</th>
        <th>이름</th>
        <th>성별</th>
        <th>고용일</th>
    </tr>
    <c:forEach var="item" items="${array}">
        <tr>
            <td>${item.empNo}</td>
            <td>${item.birthDate}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.gender}</td>
            <td>${item.hireDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
