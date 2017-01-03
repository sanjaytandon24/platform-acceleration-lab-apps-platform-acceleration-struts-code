<%@attribute name="title" %>

<!DOCTYPE>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
    <link rel="stylesheet" type="text/css" href="style/layout.css"/>
    <title>${title}</title>
</head>
<body class="v2">
<div id="page">

    <div id="header">
        <a href="addUser">Add User</a>
        <a href="findUser">Find User</a>
        <a href="list">List all users</a>
    </div>

    <div id="content">
        <jsp:doBody/>
    </div>

    <div id="footer">Footer</div>

</div>
</body>
</html>
