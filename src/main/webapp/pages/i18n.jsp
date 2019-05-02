<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/2
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>i18nTest</title>
</head>
<body>

    <fmt:message key="i18n.password"></fmt:message>
    <fmt:message key="i18n.username"></fmt:message>

    <a href="/i18n?locale=zh_CN">中文</a>
    <a href="/i18n?locale=en_US">英文</a>
</body>
</html>
