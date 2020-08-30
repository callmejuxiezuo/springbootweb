<html>
<head>
    <title>ShowUsersList</title>
</head>
<body>
<table border="1px;">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <#list List as users>
        <tr>
            <td>${users.userName}</td>
            <td>${users.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>