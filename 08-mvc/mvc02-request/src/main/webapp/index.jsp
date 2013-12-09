<%@ page pageEncoding="UTF-8"%>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
    <h1>Index</h1>
    <hr/>
    <form method="post" action="/demo/test1">
        Name:<input type="text" name="name" value="Test Name">
            <br/>
        Password:<input type="text" name="password" value="Test Pwd">
            <br/>
            <input type="submit" value="提交 user">
    </form>

    <form method="post" action="/demo/test3" enctype="multipart/form-data">
        文件:<input type="file" name="file">
            <br/>
            <input type="submit" value="上传文件">
    </form>
  </body>
</html>
