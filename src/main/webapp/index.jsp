<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="/i18n">i18n</a>

<form action="/fileUp" method="post" enctype="multipart/form-data">
    fileName:<input type="file" name="file"/><br>
    fileDesc:<input type="text" name="desc"/><br>
    <input type="submit" value="提交"/>
</form>

<a href="/xiazai">下载</a>

</body>
</html>
