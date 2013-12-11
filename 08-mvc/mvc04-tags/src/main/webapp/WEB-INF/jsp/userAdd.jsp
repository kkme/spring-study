<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>演示 Spring 标签的使用</title>
  </head>
  <body>
    <h1>新增用户 -- 演示 Spring 标签的使用</h1>
    <hr/>
    <form:form action="/demo/add" modelAttribute="user">
        <table>
            <tr>
                <td>姓名 :</td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>密码 :</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td>性别 :</td>
                <td>
                    <form:radiobuttons path="gender" items="${genderMap}"/>
                </td>
            </tr>
            <tr>
                <td>邮箱地址 :</td>
                <td>
                   <form:input path="email"/>
                </td>
            </tr>
            <tr>
                <td>所在城市 :</td>
                <td>
                    <form:select path="city" items="${cityMap}"/>
                </td>
            </tr>
            <tr>
                <td>兴趣爱好 :</td>
                <td>
                    <form:checkboxes path="hobby" items="${hobbyMap}"/>
                </td>
            </tr>
            <tr>
                <td>个人简介 :</td>
                <td>
                    <form:textarea path="remark"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <form:checkbox path="info"/>愿意接受社区的通知消息
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form:form>
  </body>
</html>
