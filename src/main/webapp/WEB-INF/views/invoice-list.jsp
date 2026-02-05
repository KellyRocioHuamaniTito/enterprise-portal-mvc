<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Invoices</title>
</head>
<body>

<h2>Invoice List</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Customer</th>
        <th>Amount</th>
    </tr>

    <c:forEach var="invoice" items="${invoices}">
        <tr>
            <td>${invoice.id}</td>
            <td>${invoice.customerName}</td>
            <td>${invoice.amount}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
