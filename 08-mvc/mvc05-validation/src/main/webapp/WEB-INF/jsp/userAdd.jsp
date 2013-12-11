<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>Bean Validation (JSR303)</title>
  </head>
  <body>
    <h1>Bean Validation (JSR303)</h1>
    <hr/>
    <p>演示提交一个User对象</p>

    <form:errors/>

    <form:form action="/demo/add" modelAttribute="user">
        <input type="text" name="name"><form:errors path="name" />
        <br/>
        <input type="text" name="password"><form:errors path="password" />
        <br/>
        <input type="text" name="age"><form:errors path="age" />
        <br/>
        <input type="submit" value="提交">
    </form:form>

    <form method="post" action="/demo/add">
        <table border="1">
            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            <tr>
                <th>Password:</th>
                <td>
                    <input type="text" name="password">
                </td>
            </tr>
            <tr>
                <th>Age:</th>
                <td>
                    <input type="text" name="age">
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>

  </body>
</html>
