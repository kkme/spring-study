<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h1>Result 2</h1>
        <hr/>
        <p>刚才提交的数据是:</p>
        <c:forEach items="${users}" var="u">
            <p>User:${u}</p>
            <p>Name:${u.name}</p>
            <p>Password:${u.password}</p>
        </c:forEach>
    </body>
</html>
