<%--
  Created by IntelliJ IDEA.
  User: mo
  Date: 2020/5/29
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="fileupload" enctype="multipart/form-data" method="post" action="/fileupload.do">
    上传文件:<input type="file" name="upload_file"/>
    <button type="submit">文件上传</button>
</form>
</body>
</html>
