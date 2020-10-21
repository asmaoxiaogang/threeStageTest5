<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>
<%--<html>--%>

<%--<body>--%>
<%--<h1>!!!hello world!!!</h1>--%>
<%--</body>--%>
<%--</html>--%>
<html>
<body>
<%
    request.getRequestDispatcher("/subject/selectAll").forward(request,response);
%>
</body>
</html>
