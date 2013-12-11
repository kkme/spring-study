<%@ page pageEncoding="UTF-8"%>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
    <h1>演示通过请求提交数据的多种方式</h1>
    <hr/>
    <p>
        1.通过请求提交多个参数
    </p>
    <a href="/demo/test1?name=jack&age=25">GET请求提交参数</a>
    <hr/>
    <p>
        2.通过请求提交对象
    </p>
    <form method="post" action="/demo/test2">
        Name:<input type="text" name="name" value="Test Name">
            <br/>
        Password:<input type="text" name="password" value="Test Pwd">
            <br/>
            <input type="submit" value="提交 user">
    </form>
    <hr/>
    <p>
        3.通过请求提交对象集合
    </p>
    <form method="post" action="/demo/test3">
        第1个user的name:<input type="text" name="users[0].name" value="Test Name 1">
        第1个user的password:<input type="text" name="users[0].password" value="Test Pwd 1">
            <br/>
        第2个user的name:<input type="text" name="users[1].name" value="Test Name 2">
        第2个user的password:<input type="text" name="users[1].password" value="Test Pwd 2">
            <br/>
            <input type="submit" value="提交">
    </form>
    <hr/>
    <p>
        4.通过请求上传文件
    </p>
    <form method="post" action="/demo/test4" enctype="multipart/form-data">
        文件:<input type="file" name="myFile">
            <br/>
            <input type="submit" value="上传文件">
    </form>
  </body>
</html>
